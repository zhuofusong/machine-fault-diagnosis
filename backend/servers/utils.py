""" util functions """

import os
import logging
import pybrake

# all logs go here
logdir = os.path.abspath(os.path.join(os.path.dirname(__file__),"..", "logs"))

# logging level
if os.environ.get("LOG_LEVEL") == "INFO":
    log_level = logging.INFO
else:
    log_level = logging.DEBUG

# import all keys 
with open(os.path.abspath(os.path.join(os.path.dirname(__file__),"../../.env")),'r') as f:
    pybrake_key = f.readlines()[0]
    pybrake_key = pybrake_key.split("=")[1]

# pybrak notifier
notifier = pybrake.Notifier(project_id=267681,project_key=pybrake_key,environment='production')
airbrake_handler = pybrake.LoggingHandler(notifier=notifier,level=logging.ERROR)

def getlog(task = 'learning', dir = '', level = log_level, append=False):
    logger = logging.getLogger(task)
    logger.setLevel(level)        
    if append:
        fileh = logging.FileHandler( dir + '/' + task + '.log', 'a')
    else:
        fileh = logging.FileHandler( dir + '/' + task + '.log', 'w')
    fileh.setFormatter(logging.Formatter('[ %(asctime)-15s %(processName)s %(module)s %(funcName)s %(lineno)d %(levelname)s ] %(message)s '))
    fileh.setLevel(level)
    try:
        logger.removeHandler(fileh)
    except:
        pass
    logger.addHandler(fileh)
    consoleHandler = logging.StreamHandler()
    consoleHandler.setFormatter(logging.Formatter('[ %(asctime)-15s %(processName)s %(module)s %(funcName)s %(lineno)d %(levelname)s ] %(message)s '))
    consoleHandler.setLevel(level)
    logger.addHandler(consoleHandler)
    logger.addHandler(airbrake_handler)
    return(logger)