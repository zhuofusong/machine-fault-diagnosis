using CommandLine;
using Serilog;
using Serilog.Core;
using Serilog.Events;
using System.Collections.Generic;


namespace model_app
{
    class MachineLearning
    {

        public class Options
        {
            [Option('m', "mode", Required = true, HelpText = "Operation mode : (I)nteractive or (B)ackground")]
            public string mode { get; set; }
            [Option('t', "model_type", Required = false, HelpText = "Type of Model to use")]
            public string ModelType { get; set; }
        }

        static void HandleParseError(IEnumerable<Error> errs)
        {
            //handle errors
            System.Console.WriteLine("Command line arguments error. Please use --help option to see details");
        }

        static int Main(string[] args)
        {
            // Test if input arguments were supplied.
            Parser.Default.ParseArguments<Options>(args)
                  .WithParsed<Options>(o =>
                  {
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

                      if (o.mode == "I" || o.mode == "Interactive")
                      {
                          // Opens the interactive C# app

                      }
                      else
                      {
                          // 
                          if (o.ModelType == "ProbabilisticNetwork")
                          {

                              log.Information("Start Probabilistic Graphical Model Engine");


                          }
                      }
                  }
            ).WithNotParsed(HandleParseError);
            return 0;
        }

    }
}