# Introduction of simulation

This folder currently contains simulation engines utilizing FMU format models. [This list of software tools](https://fmi-standard.org/tools/) support FMU model import/export and modification. 
The Python/C++/Java sample APPs contained in this folder demonstrates how to 
use these engines. 

Although FMU models can be imported and exported by the above listed software packages, please pay attention to the operation platform which generates it. 
Some tools for processing FMU models only accept those from the same platform. As shown above, the two main platforms supported are Windows and Linux. 
Therefore, please make sure that when you use this library on a platform, the FMUs need to be produced on the same type of platform. Installation of the dependencies is easy. 
Please just follow the instruction found on corresponding packages. It is best that you install low level C++ libraries first, then other high level Python and C# libraries recursively.

