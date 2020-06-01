# External algorithms and libraries

This document summarizes external low-level algorithms incorporated in the engine, which are essential to the simulation of different types of physical models, as well as 
high-level scientific computing libraries imported, which let users first create complex models, generate C/C++/Fortran simulation code and then optimize it using various tools introduced below.

## Book series:

### From Springer

#### On computing algorithms and theory
- [Texts in Computational Science and Engineering](https://www.springer.com/series/5151?detailsPage=titles) contains titles on various topics.
- [Simulation Foundations, Methods and Applications](https://www.springer.com/series/10128?detailsPage=titles)
- []()

#### On applications

- [Modeling and Simulation in Science, Engineering and Technology](https://www.springer.com/series/4960?detailsPage=titles)
- [Mathematics in Industry](https://www.springer.com/series/4650?detailsPage=titles)
- []()

## Reduced precision algorithms

Floating point emulation can save memory, energy and other resources by customizing the precision level of intermediate computation steps in a simulation. We incorporate several floating point emulation tools ( see the list below ). These tools all have convenient C++ APIs. Demonstration of how to use these tools is in the ```demo``` folder. 

Libraries included :

[FloatX](https://github.com/oprecomp/FloatX)
[FlexFloat](https://github.com/oprecomp/flexfloat)

## Optimization algorithms

### Derivative-free optimization algorithms

In many optimization problems arising from scientific, engineering and artificial intelligence
applications, objective and constraint functions are available only as the output of a black-box or
simulation oracle that does not provide derivative information. Such settings necessitate the use of
methods for derivative-free, or zeroth-order, optimization([link to a survey paper](https://arxiv.org/pdf/1904.11585)). The engine provides a selection of derivative-free optimization algorithms:

- []()


### Algorithmic differentiation algorithms

Algorithmic differentiation (AD) describes the mathematical theory of how a computer program can be differentiated( [link to a paper on this topic](https://dl.acm.org/doi/pdf/10.1145/3356900?download=true)). AD has wide application in engineering researches. Available AD algorithms are :

[CoDiPack](https://www.scicomp.uni-kl.de/software/codi/)
[ADOL-C](https://github.com/coin-or/ADOL-C)
[dco/c++](https://www.nag.co.uk/content/downloads-dco-c-versions)
[CppAD](https://coin-or.github.io/CppAD/doc/cppad.htm)
[Sacado](https://github.com/trilinos/Trilinos) Sacado is inside the packages folder



## Ordinary differential equations algorithms:

### exact solution

### numerical solution



## Partial differential equations algorithms:

- [Google's suggested list of partial differential equations books](https://www.google.com/search?sa=X&sxsrf=ALeKk00qFEIM-KZTKkT55rMBsXwTQ-GPnA:1590737978022&q=Partial+differential+equations+Fritz+John&stick=H4sIAAAAAAAAAOOQUeLSz9U3MMsxNiuKN1IpSCwqyUzMUUjJTEtLLUrNA3NSC0sTSzLz84oVkvLzs4ujdAmoSq1ITC5RKM7PKQXxTzEi2XCKkVc_Xd_QMNkoxyK9yrwEJmluaJxleoqRByRZWV6QW5iTUgDlGiXlGSZnmRfDuGXxFRVlBRVQncmGZdkgY6BKcy0Mio3SYbakm2SZxydnGcLUmqSVm5b8YlQJgLrfBdn9rqi-XMSqGYDfm25FmSVVCl75GXkA16JQkkYBAAA&ved=2ahUKEwjF-fDgyNjpAhVbIMUKHcUCA_QQ-BYwHHoECBAQJw&biw=1673&bih=885)
- [Google's suggested list of partial differential equations reference books](https://www.google.com/search?sa=X&sxsrf=ALeKk019gI10oA0XL0e01IlYXyp5Vw5chw:1590737974651&q=Elements+of+partial+differential+equations&stick=H4sIAAAAAAAAAIWPvQ6CMBSFw2BijL6BQ-NoIj8tAu6yO7sYqIUAhQIF2vg4Pg6P5KQQCCzq-J17Tm6-5Xa30lJNt2wDxUeo5l5ZRR4F9ygISEmyHkhRe1XEMg5K0qeYAJ-xhF8Pf_pEergCnNG641aZ_WqVtRZqBmxuUja5HBEajm1bjxH9NMnSmA9LjCgXeLqFuiXQhBAWIm6VTYeGLwIBTUTHqXmSKJ-62IGl_VLUyyBwngu434Sfi71LSfqpccAC8Nv-DUATZM5cAQAA&ved=2ahUKEwiCiaPfyNjpAhUK2KQKHeIlB1EQ-BYwHXoECBMQJw&biw=1673&bih=885)

### exact solution

The following list is very incomplete but offers a starting point for calculating exact solutions of partial differential equations.

- [Handbook of nonlinear partial differential equations](https://books.google.co.uk/books/about/Handbook_of_Nonlinear_Partial_Differenti.html?id=FdLKBQAAQBAJ&printsec=frontcover&source=kp_read_button&redir_esc=y#v=onepage&q&f=false)
- [Springer's book search result](https://www.springer.com/gp/search?dnc=true&facet-subj=subj__M12155&facet-type=type__book&query=exact+solution+partial+differential+equations&submit=Submit)
- [Google's book search result](https://www.google.com/search?biw=1673&bih=885&tbm=bks&sxsrf=ALeKk01FGy_1Gt19F6c-EetDoPAz2SQBNw%3A1590981589900&ei=1XPUXo3CNtOo1fAP-uWigAk&q=partial+differential+equations+exact+solution&oq=partial+differential+equations+exact+solution&gs_l=psy-ab.3...286301.288255.0.288441.7.7.0.0.0.0.302.594.2-1j1.2.0....0...1c.1.64.psy-ab..5.0.0....0.EuyTEjRhze4)
- [Elsevier's book search result](https://www.elsevier.com/catalog?producttype=books&cat0=27376&cat1=&series=&q=exact+solution+partial+differential+equations&search=1&imprintname=&categoryrestriction=&sort=relevance)


### numerical solution

- []()
- [Google's book search result](https://www.google.com/search?q=partial+differential+equations+numerical+solution&sxsrf=ALeKk03n5eLEV6LcrtmxJiCOJ4OsKZPdrA:1590981554950&source=lnms&tbm=bks&sa=X&ved=2ahUKEwi_2rST1N_pAhXhrnEKHZd4DkQQ_AUoAXoECBQQCQ&biw=1673&bih=885&dpr=2)
- [Springer's book search result](https://www.springer.com/gp/search?dnc=true&facet-subj=subj__M12155&facet-type=type__book&query=numerical+solution+partial+differential+equations&submit=Submit)
- [Elsevier's book search result](https://www.elsevier.com/catalog?producttype=books&cat0=27376&cat1=&series=&q=numerical+solution+partial+differential+equations&search=1&imprintname=&categoryrestriction=&sort=relevance)


## Approximation algorithms



## FEM algorithms



## Parallel computing algorithms

[OpenMP](https://www.openmp.org/)
[OpenCL](https://www.khronos.org/opencl/)






