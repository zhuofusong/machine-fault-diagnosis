# Introduction of simulation

This folder currently contains simulation engines utilizing FMU format models. [This list of software tools](https://fmi-standard.org/tools/) support FMU model import/export and modification. 
The Python/C++/Java sample APPs contained in this folder demonstrates how to 
use these engines. 

## Example FMUs. In the ```sample_fmu``` folder, there are linux and windows 64 platform -specific FMU files. Beware that the simulation wrapper needs to be called on the same kind of platform for the FMU model file to be corrected interpreted.

## Simulation wrappers

Although most commercial and open source software tools have built-in simulation, sensitivity analysis and optimization functionality, it is still useful to incorporate them into your own app ( in common language like Python, Java or C++ ). The wrappers below are for demo purpose, showing how to do it.

## To run simulation based on FMU through Python wrapper, run
```python3 wrapper_python/simulation_engine.py -f <fmu_file_path> -t <simulation_end_time> -r <simulation_result_file_path>```
Then follow on-screen instruction to modify/review simulation options regarding solvers, etc. 


