#include "Program.h"

using namespace CommandLine;
using namespace Serilog;
using namespace Serilog::Core;
using namespace Serilog::Events;

namespace model_app
{

	std::wstring MachineLearning::Options::getMode() const
	{
		return mode;
	}

	void MachineLearning::Options::setMode(const std::wstring &value)
	{
		mode = value;
	}

	std::wstring MachineLearning::Options::getModelType() const
	{
		return ModelType;
	}

	void MachineLearning::Options::setModelType(const std::wstring &value)
	{
		ModelType = value;
	}

	void MachineLearning::HandleParseError(std::vector<Error*> &errs)
	{
		//handle errors

	}

	int MachineLearning::Main(std::vector<std::wstring> &args)
	{
		// Test if input arguments were supplied.
		Parser::Default->ParseArguments<Options*>(args)->WithParsed<Options*>([&] (std::any o)
		{
				  auto levelSwitch = new LoggingLevelSwitch();
				  levelSwitch->MinimumLevel = LogEventLevel::Debug;
				  LoggerConfiguration tempVar();
				  auto log = (&tempVar)->MinimumLevel->ControlledBy(levelSwitch)->WriteTo->Console(restrictedToMinimumLevel: LogEventLevel::Debug).WriteTo->File(L"backend_component_model_log-.txt", outputTemplate: L"{Timestamp:yyyy-MM-dd HH:mm:ss.fff zzz} [{Level:u3}] {Message:lj}{NewLine}{Exception}", rollingInterval: RollingInterval::Day, restrictedToMinimumLevel: LogEventLevel::Information).CreateLogger();
				  log->ForContext<MachineLearning*>();
    
				  if (o->mode == L"I" || o->mode == L"Interactive")
				  {
					  // Opens the interactive C# app
    
				  }
				  else
				  {
					  //
					 if (o->ModelType == L"ProbabilisticNetwork")
					 {
    
						log->Information(L"Start Probabilistic Graphical Model Engine");
    
    
					 }
				  }

//C# TO C++ CONVERTER TODO TASK: A 'delete levelSwitch' statement was not added since levelSwitch was passed to a method or constructor. Handle memory management manually.
		}).WithNotParsed(HandleParseError);
		return 0;
	}
}
