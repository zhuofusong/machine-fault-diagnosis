#pragma once

#include <string>
#include <vector>

//C# TO C++ CONVERTER NOTE: Forward class declarations:
namespace CommandLine { class Error; }

using namespace CommandLine;
using namespace Serilog;
using namespace Serilog::Core;
using namespace Serilog::Events;

namespace model_app
{
	class MachineLearning
	{

	public:
		class Options
		{
		private:
			std::wstring mode;
			std::wstring ModelType;

		public:
			std::wstring getMode() const;
			void setMode(const std::wstring &value);
			std::wstring getModelType() const;
			void setModelType(const std::wstring &value);
		};

	private:
		static void HandleParseError(std::vector<Error*> &errs);

		static int Main(std::vector<std::wstring> &args);

	};
}
