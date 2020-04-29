# This document summarizes algorithms incorporated in the engine, which are essential to the simulation of different types of physical models.

## Reduced precision algorithms

Floating point emulation can save memory, energy and other resources by customizing the precision level of intermediate computation steps in a simulation. We incorporate several floating point emulation tools ( see the list below ). These tools all have convinient C++ APIs. Demostration of how to use these tools is in the ```demo``` folder. 

## Optimization algorithms

### Derivative-free optimization algorithms

In many optimization problems arising from scientific, engineering and articial intelligence
applications, objective and constraint functions are available only as the output of a black-box or
simulation oracle that does not provide derivative information. Such settings necessitate the use of
methods for derivative-free, or zeroth-order, optimization([link to a survey paper](https://arxiv.org/pdf/1904.11585)). The engine provides a selection of derivative-free optimization algorithms:

[]


### Algorithmic differentiation algorithms

Algorithmic differentiation (AD) describes the mathematical theory of how a computer program can be differentiated( [link to a paper on this topic](https://dl.acm.org/doi/pdf/10.1145/3356900?download=true)). AD has wide application in engineering researches. Available AD algorithms are :

[CoDiPack](https://www.scicomp.uni-kl.de/software/codi/)
[ADOL-C](https://github.com/coin-or/ADOL-C)
[dco/c++](https://www.nag.co.uk/content/downloads-dco-c-versions)
[CppAD](https://coin-or.github.io/CppAD/doc/cppad.htm)
[Sacado](https://github.com/trilinos/Trilinos) Sacado is inside the packages folder

## Approximation algorithms



## FEM algorithms

## Parallel computing algorithms

[OpenMP](https://www.openmp.org/)
[]