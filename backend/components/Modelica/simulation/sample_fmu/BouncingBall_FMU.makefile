# FIXME: before you push into master...
RUNTIMEDIR=C:/Program Files/OpenModelica1.14.1-64bit//include/omc/c/
#COPY_RUNTIMEFILES=$(FMI_ME_OBJS:%= && (OMCFILE=% && cp $(RUNTIMEDIR)/$$OMCFILE.c $$OMCFILE.c))

fmu:
	rm -f BouncingBall.fmutmp/sources/BouncingBall_init.xml
	cp -a "C:/Program Files/OpenModelica1.14.1-64bit//share/omc/runtime/c/fmi/buildproject/"* BouncingBall.fmutmp/sources
	cp -a BouncingBall_FMU.libs BouncingBall.fmutmp/sources/

