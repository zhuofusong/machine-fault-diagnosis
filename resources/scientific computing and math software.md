# Scientific computing and math software libraries ( dependencies )

## Literature

There exists a large amount of literature on the topic of math software programs ( See this [link](https://www.google.com/search?q=handbook+mathematical+software&oq=handbook+mathematical+software&aqs=chrome..69i57j46l4j69i61l3.4384j1j7&sourceid=chrome&ie=UTF-8) and this [link](https://scholar.google.co.uk/scholar?start=10&q=handbook+mathematical+software&hl=en&as_sdt=0,5&as_vis=1) ). 

Miscellaneous:

- [Free online dictionary of computing](https://foldoc.org/wombat.doc.ic.ac.uk)

## The test environment 

The test environment is a Ubuntu 18.04 WSL on a Win10 64 byte VM machine

Since the majority of the simulation software packages can be run on Windows and Linux systems, we found it most convenient to run experiment on such platform. 
The whole backend engine system relies on the Windows 10 platform and its WSL. To realize the functionalities with minimum duplicated installations of similar tools, 
we experimented with different installation paths and tried to optimize it. The resulting installation scripts for all dependencies of the backend engine is shown in ```install\backend_dependency``` folder. 

## Dependency software packages

The following links contain detailed description about software package dependencies used. 

- [NIST](https://gams.nist.gov/) maintains a cross-index and virtual repository of mathematical and statistical software components of use in computational science and engineering, which provides classification of them by keywords. 

- [More scientific computing projects at NIST](https://math.nist.gov/) and [math software developed by it](https://www.nist.gov/itl/math/software)

- [This list](https://people.maths.ox.ac.uk/trefethen/tools.html) is compiled by Oxford researcher and is an index of indices of general and specialized scientific computing code. 

- [Trilinos suite of software libraries](https://trilinos.github.io/)

- U.S. national laboratories open source code
  - [The Lawrence Livermore National Laboratory (LLNL) software catalog](https://software.llnl.gov/)
    - [The Visit package developed by LLNL](https://wci.llnl.gov/simulation/computer-codes/visit) is an open Source, interactive, scalable, visualization, animation and analysis tool, which is 
  capable of visualizing data from over 120 different scientific data formats
  - [The Lawrence Berkeley National Laboratory](https://crd.lbl.gov/software/)
  - [The Ames National Laboratory](https://www.ameslab.gov/work-us/open-source-software)
  - [The Argonne National Laboratory MCS software](https://www.anl.gov/mcs/mcs-software-0)
  - [The Brookhaven National Laboratory](https://www.bnl.gov/compsci/software.php)
  - [The Fermi National Laboratory](https://computing.fnal.gov/scientific_software/)
  - [The Idaho National Laboratory](https://github.com/idaholab)
  - [The Los Alamos National Laboratory](https://www.lanl.gov/software/open-source-software.php)
  - [The Oak Ridge National Laboratory](https://www.olcf.ornl.gov/for-users/software/)

- [Software libraries published in SoftwareX journal](https://github.com/ElsevierSoftwareX?page=1)


Other more general and light-weighted software packages:

- [Sponsored projects by NUMFOCUS](https://numfocus.org/sponsored-projects)

- [light-weighted packages](https://joss.theoj.org/)

### By equation type

- [NIST](https://dlmf.nist.gov/software/) maintains an index of math software programs.

#### Linear Algebra

- [BLAS]()
- [LAPACK]()
- [ScaLAPACK]()
- [SuiteSparse]()
- [Eigen]()

#### Ordinary differential equations and dynamic systems

- []


#### Partial differential equations

The following open source computing engines are provided in the test environment: Ubuntu 18.04 WSL on a Win64 VM machine

- [CLAWPACK](http://www.clawpack.org/)
- [FEniCS](https://fenicsproject.org/)
- [Firedrake](https://www.firedrakeproject.org/index.html)
- [FreeFEM](https://freefem.org/)
- [PETSc](https://www.mcs.anl.gov/petsc/index.html)

#### Optimization

- [NEOS](https://neos-guide.org/Optimization-Guide)
- [Automatic differentiation portal](http://www.autodiff.org/?module=Tools)

#### High-performance computing

- [PETSc](https://www.mcs.anl.gov/petsc/index.html)
- [Intel Math Kernel Library](https://software.intel.com/content/www/us/en/develop/tools/math-kernel-library.html)

### By problem domain

#### Computational fluid dynamics

- [This link](https://www.cfd-online.com/Wiki/Codes) contains a long list of software programs for solving CFD problems

- [This link](http://www.cpc.cs.qub.ac.uk/) contains is an archive for physics and physical chemistry algorithms

#### 