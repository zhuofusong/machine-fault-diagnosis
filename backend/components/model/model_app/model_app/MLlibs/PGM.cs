using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using Serilog;
using Serilog.Core;
using Serilog.Events;
using System;
using System.IO;

namespace modelapp.MLlibs
{
    class PGM
    {
        public readonly string ModelFile, DataFile, TrainedModelFile, TrainingLogFile;
        public JArray TrainData, TrainDataColumns;
        public JObject Model;

        public PGM()
        {

        }

        public async void LearnParameters()
        {
            try
            {


            }
            catch
            {

            }
        }

        public async void LearnStructure()
        {
            try
            {

            }
            catch
            {

            }
        }

        public async void LoadModel()
        {
            try
            {

            }
            catch
            {

            }
        }

        public void InferPosteriors()
        {

        }

        public int Run(string task, string estimateStructure)
        {
            LoggingLevelSwitch levelSwitch = new LoggingLevelSwitch
            {
                MinimumLevel = LogEventLevel.Debug
            };
            Logger log = new LoggerConfiguration()
                          .MinimumLevel.ControlledBy(levelSwitch)
                          .WriteTo.Console(restrictedToMinimumLevel: LogEventLevel.Debug)
                          .WriteTo.File("backend_component_model_pgm_log-.txt", outputTemplate: "{Timestamp:yyyy-MM-dd HH:mm:ss.fff zzz} [{Level:u3}] {Message:lj}{NewLine}{Exception}",
                          rollingInterval: RollingInterval.Day, restrictedToMinimumLevel: LogEventLevel.Information)
                          .CreateLogger();
            log.ForContext<PGM>();


            try
            {
                // load training data 
                if (Environment.GetEnvironmentVariable("DataFile").Length > 0)
                {
                    using (StreamReader file = File.OpenText(Environment.GetEnvironmentVariable("DataFile")))
                    using (JsonTextReader reader = new JsonTextReader(file))
                    {
                        JObject o2 = (JObject)JToken.ReadFrom(reader);
                        TrainData = JArray.Parse(o2["data"].ToString());
                        TrainDataColumns = JArray.Parse(o2["columns"].ToString());
                    }
                }
                else
                {
                    if (task == "Train")
                    {
                        throw new FileNotFoundException("For train task, data file is required. Please specify one in Trainconfig.json");
                    }
                }

                // Interpret data structure

                // load model file
                if (Environment.GetEnvironmentVariable("ModelFile").Length > 0)
                {
                    using (StreamReader file = File.OpenText(Environment.GetEnvironmentVariable("ModelFile")))
                    using (JsonTextReader reader = new JsonTextReader(file))
                    {
                        Model = (JObject)JToken.ReadFrom(reader);
                    }
                }
                else
                {
                    throw new FileNotFoundException("A model file is required. Please specify one in Trainconfig.json");
                }

                // Training
                // 1. Learn probabilistic model from data
                if (task == "Train")
                {
                    if (estimateStructure == "Yes")
                    {
                        // create a loop to estimate CPT for each variable
                        LearnStructure();

                    }
                    LearnParameters();
                    Utils.WriteResults write = new Utils.WriteResults();
                    int writeResult = write.Run();
                    if (writeResult == 0)
                    {
                        log.Information("Successfully wrote training result to files.");
                        return 0;
                    }
                    else
                    {
                        log.Error("Error occurred when writing training result to files.");
                        return -1;
                    }
                }
                else
                {
                    LoadModel();
                    InferPosteriors();
                    Utils.WriteResults write = new Utils.WriteResults();
                    int writeResult = write.Run();
                    if (writeResult == 0)
                    {
                        log.Information("Successfully wrote training result to files.");
                        return 0;
                    }
                    else
                    {
                        log.Error("Error occurred when writing training result to files.");
                        return -1;
                    }
                }
            }
            catch (ArgumentNullException e1)
            {
                log.Error("Please set environment variables in Trainconfig.json first. Error message is {0}", e1);
                return -2;
            }
            catch (FileNotFoundException e2)
            {
                log.Error("Model or data file not found. Error message is {0}", e2);
                return -3;
            }
            catch (Exception e3)
            {
                log.Error("Error occurred when reading loading model and data file. Error message is {0}", e3);
                return -4;
            }
        }
    }
}

