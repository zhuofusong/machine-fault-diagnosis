#!/bin/bash

#################################
# install openmodelica
#################################
# follow the instruction at https://www.openmodelica.org/download/download-linux
printf "==========================\nBegin the installation of openmodelica\n"
for deb in deb deb-src; do echo "$deb http://build.openmodelica.org/apt `lsb_release -cs` release"; done | sudo tee /etc/apt/sources.list.d/openmodelica.list
wget -q http://build.openmodelica.org/apt/openmodelica.asc -O- | sudo apt-key add - 
# To verify that your key is installed correctly
apt-key fingerprint
# Gives output:
# pub   2048R/64970947 2010-06-22
#      Key fingerprint = D229 AF1C E5AE D74E 5F59  DF30 3A59 B536 6497 0947
# uid                  OpenModelica Build System 
# install openmodelica
sudo apt update
sudo apt install openmodelica
# install optional packages
for PKG in `apt-cache search "omlib-.*" | cut -d" " -f1`; do sudo apt-get install -y "$PKG"; done # Installs optional Modelica libraries (most have not been tested with OpenModelica)
printf "End of the installation of openmodelica\n==========================\n"

#################################
# install PyFMI and all its dependencies to run FMU-based simulation using a python wrapper from command line
#################################
printf "==========================\nBegin the installation of PyFMI, Sundials and other dependencies\n"
# 1. install dependency: 

printf "End of the installation of PyFMI, Sundials and other dependencies\n==========================\n"


#################################
# install PESTc to run simulation related 
#################################
printf "==========================\nBegin the installation of PESTc\n"
# download source code of PESTc
wget http://ftp.mcs.anl.gov/pub/petsc/release-snapshots/petsc-lite-3.13.1.tar.gz
tar -xvf petsc-lite-3.13.1.tar.gz
cd petsc-3.13.1/
# configuration of installation
./configure --with-cc=gcc --with-cxx=g++ --with-fc=gfortran --download-mpich --download-fblaslapack
# install
sudo make PETSC_DIR=/mnt/c/Users/Administrator/Documents/Computing_engines/petsc-3.13.1 PETSC_ARCH=arch-linux2-c-debug all
# check if installation is correct
sudo make PETSC_DIR=/mnt/c/Users/Administrator/Documents/Computing_engines/petsc-3.13.1 PETSC_ARCH=arch-linux2-c-debug check
# When you see the following outputs, it means the installation is successful
# C/C++ example src/snes/tutorials/ex19 run successfully with 1 MPI process
# C/C++ example src/snes/tutorials/ex19 run successfully with 2 MPI processes
# Fortran example src/snes/tutorials/ex5f run successfully with 1 MPI process
# Completed test examples
printf "End of the installation of PESTc\n==========================\n"

#################################
# install FEniCS
#################################
sudo apt-get install software-properties-common
sudo add-apt-repository ppa:fenics-packages/fenics
sudo apt-get update
sudo apt-get install --no-install-recommends fenics

