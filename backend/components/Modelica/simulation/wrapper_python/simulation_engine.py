import os
import logging
import argparse
import copy
import time
import json
from pyfmi import load_fmu
import fmpy

import sys
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__),"../../../../servers/")))
from utils import getlog

if os.environ.get("LOG_LEVEL") == "INFO":
    log_level = logging.INFO
else:
    log_level = logging.DEBUG
logdir = os.path.abspath(os.path.join(os.path.dirname(__file__),"../../../../logs/"))

parser = argparse.ArgumentParser()
parser.add_argument("-l","--pythonLibrary", help="which python library to use (pyfmi or fmpy)", type=str, default='pyfmi')
parser.add_argument("-t","--simulationEndTime", help="simulation ending time", type=float)
parser.add_argument("-f","--modelFile",help="FMU model file path", type=str)
args = parser.parse_args()

if __name__ == "__main__":
    try:
        fmufile = args.modelFile
        fmpy.dump(fmufile)  # print model info
        fmufilename = fmufile.split("/")
        fmufilename = fmufilename[len(fmufilename)-1]
        simulationEndTime = args.simulationEndTime
        pythonLibrary = args.pythonLibrary
        cont = True
    except Exception as e:
        print("Please use --help to get information regarding necessary command line arguments")
        print(e)
        cont = False
    if cont:
        log = getlog(task = 'modelica_simulation', dir = logdir, level = log_level, append=False)
        try:
            stime = time.time()
            model = load_fmu(fmufile)
            opts = model.simulate_options()
            log.info("Model simulation options is as below. ")
            log.info(opts)
            opts1 = input("Please enter your new options in the same format, if any. Enter () to skip this:")
            if opts == "()":
                log.info("Use default simulation options")
            else:
                confirm = "No"
                while confirm == "No":
                    if type(opts)==dict:
                        opts = copy.deepcopy(opts1)
                    log.info("Please confirm your updated simulation options as below")
                    log.info(opts)
                    confirm = input("Please enter Yes or No: ")
            res = model.simulate(final_time=simulationEndTime, options=opts)
            log.info("Simulation succeeded. Save results in the simulation results folder")
            with open(os.path.abspath(os.path.join(os.path.dirname(__file__),"simulation_results", pythonLibrary + '_' + fmufilename + '_' + str(int(stime)))), 'w') as f:
                json.dump(res)
            etime = time.time()
            log.info("Simulation costs " + str(int(etime - stime)) + ' seconds')
        except Exception as e:
            log.error("Error happened and simulation stopped. Error message is ")
            log.error(e)
            log.info("Please refer to the log files in logs folder for details")
    
            
    
    