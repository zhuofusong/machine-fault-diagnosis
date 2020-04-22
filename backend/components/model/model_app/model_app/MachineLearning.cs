using CommandLine;
using Newtonsoft.Json.Linq;
using Serilog;
using Serilog.Core;
using Serilog.Events;
using System;
using System.Collections.Generic;
using System.IO;
using modelapp.MLlibs;


namespace modelapp
{
    internal class MachineLearning
    {

        public class Options
        {
            [Option('m', "mode", Required = true, HelpText = "Operation mode : (I)nteractive or (B)ackground")]
            public string mode { get; set; }
            [Option('t', "model_type", Required = false, HelpText = "Type of Model to use")]
            public string ModelType { get; set; }
        }

        private static void HandleParseError(IEnumerable<Error> errs)
        {
            //handle errors
            System.Console.WriteLine("Command line arguments error. Please use --help option to see details");
        }

        private static int Main(string[] args)
        {
            // Test if input arguments were supplied.
            Parser.Default.ParseArguments<Options>(args)
                  .WithParsed<Options>(o =>
                  {
                      // set logger
                      LoggingLevelSwitch levelSwitch = new LoggingLevelSwitch
                      {
                          MinimumLevel = LogEventLevel.Debug
                      };
                      Logger log = new LoggerConfiguration()
                          .MinimumLevel.ControlledBy(levelSwitch)
                          .WriteTo.Console(restrictedToMinimumLevel: LogEventLevel.Debug)
                          .WriteTo.File("backend_component_model_log-.txt", outputTemplate: "{Timestamp:yyyy-MM-dd HH:mm:ss.fff zzz} [{Level:u3}] {Message:lj}{NewLine}{Exception}",
                          rollingInterval: RollingInterval.Day, restrictedToMinimumLevel: LogEventLevel.Information)
                          .CreateLogger();
                      log.ForContext<MachineLearning>();

                      // load environmental variables
                      // DB connection configuration
                      JObject o1 = JObject.Parse(File.ReadAllText(@"C:\Users\Administrator\Documents\GitHub\machine-fault-diagnosis\backend\components\model\model_app\model_app\config\DBconfig.json"));
                      Environment.SetEnvironmentVariable("DBURL", (string)o1["DBURL"]);
                      Environment.SetEnvironmentVariable("DBUSER", (string)o1["DBUSER"]);
                      Environment.SetEnvironmentVariable("DBPW", (string)o1["DBPW"]);
                      // Model training configuration
                      JObject o2 = JObject.Parse(File.ReadAllText(@"C:\Users\Administrator\Documents\GitHub\machine-fault-diagnosis\backend\components\model\model_app\model_app\config\Trainconfig.json"));
                      Environment.SetEnvironmentVariable("ModelFile", (string)o2["ModelFile"]);
                      Environment.SetEnvironmentVariable("DataFile", (string)o2["DataFile"]);
                      Environment.SetEnvironmentVariable("TrainedModelFile", (string)o2["TrainedModelFile"]);
                      Environment.SetEnvironmentVariable("TrainingLogFile", (string)o2["TrainingLogFile"]);

                      if (o.mode == "I" || o.mode == "Interactive")
                      {
                          // Opens the interactive C# app

                      }
                      else
                      {
                          // Run machine learning engine in the background
                          switch (o.ModelType)
                          {
                              case "ProbabilisticNetwork":
                                  log.Information("Start Probabilistic Graphical Model Engine");
                                  Console.WriteLine("Please choose a task (Train, Inference or All)");
                                  string t = Console.ReadLine();
                                  string estimateStructure1;
                                  if (t != "Inference")
                                  {
                                      Console.WriteLine("Please choose whether to estimated the graph structure or not ( Yes or No)");
                                      estimateStructure1 = Console.ReadLine();
                                  }
                                  else
                                  {
                                      estimateStructure1 = "No";
                                  }
                                  PGM BNEngine = new PGM();
                                  int result = BNEngine.Run(task: t, estimateStructure: estimateStructure1);
                                  break;
                              case "TimeSeriesAnalysis":
                                  log.Information("Start Time-series Analysis Engine");
                                  break;
                              case "BinaryClassification":
                                  log.Information("Start Binary Classification Engine");
                                  string[] algorithms1 = {"AveragedPerceptronTrainer",
                                        "SdcaLogisticRegressionBinaryTrainer",
                                        "SdcaNonCalibratedBinaryTrainer",
                                        "SymbolicSgdLogisticRegressionBinaryTrainer",
                                        "LbfgsLogisticRegressionBinaryTrainer",
                                        "LightGbmBinaryTrainer",
                                        "FastTreeBinaryTrainer",
                                        "FastForestBinaryTrainer",
                                        "GamBinaryTrainer",
                                        "FieldAwareFactorizationMachineTrainer",
                                        "PriorTrainer",
                                        "LinearSvmTrainer" };
                                  Console.WriteLine("Please choose an algorithm from below");
                                  Console.WriteLine(algorithms1);
                                  string al1 = Console.ReadLine();
                                  BinaryClassification bc = new BinaryClassification(al1);
                                  int bcResult = bc.Run();
                                  break;

                              case "MultiClassification":
                                  log.Information("Start Multi Classification Engine");
                                  string[] algorithms2 = {"LightGbmMulticlassTrainer",
                                        "SdcaMaximumEntropyMulticlassTrainer",
                                        "SdcaNonCalibratedMulticlassTrainer",
                                        "LbfgsMaximumEntropyMulticlassTrainer",
                                        "NaiveBayesMulticlassTrainer",
                                        "OneVersusAllTrainer",
                                        "PairwiseCouplingTrainer",
                                        "ImageClassificationTrainer" };
                                  Console.WriteLine("Please choose an algorithm from below");
                                  Console.WriteLine(algorithms2);
                                  string al2 = Console.ReadLine();
                                  MultiClassification mc = new MultiClassification(al2);
                                  int mcResult = mc.Run();
                                  break;

                              case "Regression":
                                  log.Information("Start Regression Engine");
                                  string[] algorithms3 = {"LbfgsPoissonRegressionTrainer",
                                        "LightGbmRegressionTrainer",
                                        "SdcaRegressionTrainer",
                                        "OlsTrainer",
                                        "OnlineGradientDescentTrainer",
                                        "FastTreeRegressionTrainer",
                                        "FastTreeTweedieTrainer",
                                        "FastForestRegressionTrainer",
                                        "GamRegressionTrainer"};
                                  Console.WriteLine("Please choose an algorithm from below");
                                  Console.WriteLine(algorithms3);
                                  string al3 = Console.ReadLine();
                                  Regression rg = new Regression(al3);
                                  int rgResult = rg.Run();
                                  break;

                              case "Clustering":
                                  log.Information("Start Clustering Engine. Use KMeans algorithm");
                                  string al4 = "KMeans";
                                  Clustering cluster = new Clustering(al4);
                                  int clusResult = cluster.Run();
                                  break;

                              case "AnomalyDetection":
                                  log.Information("Start Anomaly Detection Engine. Use Randomized PCA algorithm");
                                  string al5 = "RandomPCA";
                                  Anomaly ano = new Anomaly(al5);
                                  int anoResult = ano.Run();
                                  break;

                              case "Ranking":
                                  log.Information("Start Ranking Engine");
                                  string[] algorithms6 = {"LightGbmRankingTrainer",
                                          "FastTreeRankingTrainer"};
                                  Console.WriteLine("Please choose an algorithm from below");
                                  Console.WriteLine(algorithms6);
                                  string al6 = Console.ReadLine();
                                  Ranking rank = new Ranking(al6);
                                  int rankResult = rank.Run();
                                  break;

                              case "Recommendation":
                                  log.Information("Start Recommendation Engine");
                                  string al7 = "MatrixFactorizationTrainer";
                                  Recommendation recomm = new Recommendation(al7);
                                  int recommResult = recomm.Run();
                                  break;

                              case "Forecast":
                                  log.Information("Start Forecasting Engine");
                                  string al8 = "ForecastBySsa";
                                  Forecast forecast = new Forecast(al8);
                                  int forecastResult = forecast.Run();
                                  break;

                              default:
                                  log.Information("Start AutoML Engine");
                                  break;

                          }
                      }
                  }
            ).WithNotParsed(HandleParseError);
            return 0;
        }

    }
}