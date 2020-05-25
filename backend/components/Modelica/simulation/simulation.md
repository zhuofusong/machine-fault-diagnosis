# Introduction of simulation

This folder currently contains simulation engines utilizing FMU format models. [This list of software tools](https://fmi-standard.org/tools/) support FMU model import/export and modification. 
The Python/C++/Java sample APPs contained in this folder demonstrates how to 
use these engines. 


## Example FMUs. In the ```sample_fmu``` folder, there are linux and windows 64 platform -specific FMU files. Beware that the simulation wrapper needs to be called on the same kind of platform for the FMU model file to be correctly interpreted.

## Simulation wrappers

Although most commercial and open source software tools have built-in simulation, sensitivity analysis and optimization functionality, it is still useful to incorporate them into your own app ( in common language like Python, Java or C++ ). The wrappers below are for demo purpose, showing how to do it.

## To run simulation based on FMU through Python wrapper, run
```python3 wrapper_python/simulation_engine.py -f <fmu_file_path> -t <simulation_end_time> -r <simulation_result_file_path>```
Then follow on-screen instruction to modify/review simulation options regarding solvers, etc. 

## Integration with simulation engines, e.g. SimulationX

User can create models ( with fault augmentation ) in a simulation engine like SimulationX ( [A tutorial for creating model with faults augmentation is here](http://doc.simulationx.com/4.1/1033/Content/Tutorials/SystemReliabilityAnalysis.htm?Highlight=SRA) ). 
Then either export the simulation data ( as shown in Step 3.6 in the above instruction ) or export the model file in FMU format ( select export C-code and then choose the FMU 2.0 format ). 
If simulated data under different faulty scenarios are exported, machine learning models in the ```backend/components/model``` folder can be used for analysis. If the FMU model is exported, the simulation wrapper above can be used for running simulation based on the FMU model. 



