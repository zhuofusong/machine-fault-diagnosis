# Introduction of backend

The fault diagnosis library integrates machine learning and physical modeling tool. The following is a roadmap which describes things have been developed 
( in experimental mode ) and things to be done.

# Roadmap

The emphasis of the backend engine is to provide a mathematically and empirically verifiable solution for physics model-based simulation/fault diagnosis. 

For the simulation part, there are two kinds of solution packages : 

1. Run simulation w/o algorithms analysis and improvement

The docker image of this solution is constructed based the following steps:

    1. Build Windows/Linux-based images which are equipped with CAD/Modelica software ( prototype is done ). User can customize this part and add their own software.
    2. Install C++/Java/Python libraries ( which are based on low-level efficient simulation libraries ) to process FMU model file generated from Modelica software or stl model file generated from CAD software. ( Prototype is done for Python )
    3. Write test suites for the following scenario: ( Under development )
       1. For the same OS, create model through CAD/Modelica GUI or APIs
       2. Export stl/fmu files for simulation
       3. Run simulation and co-simulation ( based on mixed types of models ) through simulation engine API
          1. Test the compatibility with user-defined Modelica Libraries
       4. Check simulation result accuracy and algorithm efficiency


2. Run simulation w/ algorithms analysis and improvement

The docker image of this solution is constructed based on the following steps:
    1. Build Windows/Linux-based images which are equipped with CAD/Modelica software ( prototype is done ). User can customize this part and add their own software.
    2. Install C++/Java/Python libraries ( which are based on low-level efficient simulation libraries ) to process FMU model file generated from Modelica software or stl model file generated from CAD software. ( Prototype is done for Python )
    3. Export the simulation model in C/C++/Modelica language and extract math formulas and their types, e.g. non-linear PDE, etc 
    4. Apply the math problem-specific algorithm-improvement packages and transform the original simulation model code
       1. See [a list of general and specific algorithms categorized by the types of problem they solve embedded in the engine]() ( Under development)
       2. Integrate theoretical & empirical algorithm verification tools ( See [a list of such tools embedded in the engine]()), which help select optimal algorithms and verify improvement results ( Under development )
       3. Implementation details:
          1. Math-model extractor ( from different formats of models ) ( Under development )
          2. Write a uniform wrapper for all external algorithms from the above list, which eases the integration of them ( Under development )
          3. Write an script for installing these wrapped algorithm libraries. During the one-time installation process, a test suite based on standard test problems for these libraries will be run to determine their accuracy and performance in the specific image environment ( Under development )
          4. After the math-model extractor identifies potential fixes, the user will be presented with options regarding algorithms replacements and for some global level fixes, suggestions on code change
          5. User can activate several verification methods, including running simulation using different algorithms packages and compare result, open a theoretical proof assistant to check the correctness, etc


For the fault diagnosis part, it can be built on either simulation results ( a model-based approach ) or can incorporate machine learning libraries ( a data-based approach).
 


## Integration of machine learning models

There exists built-in ML modeling tools based on .NET framework ([Microsoft ML.NET](https://dotnet.microsoft.com/apps/machinelearning-ai/ml-dotnet) and other .NET packages). 
Besides, users can freely integrate their own code into the engine. Supported languages include C++, C#, Julia, Python and R. The final docker image ( or probably VM
, which is still under development now ) will be preinstalled with common ML packages in these languages. The documentation will be posted after the development concludes.


