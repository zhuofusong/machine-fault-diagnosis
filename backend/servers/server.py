import os
import logging
import pybrake

# import all keys 
with open(".env",'r') as f:
    pybrake_key = f.readlines()[0]
    pybrake_key = pybrake_key.split("=")[1]

# pybrak notifier
notifier = pybrake.Notifier(project_id=267681,project_key=pybrake_key,environment='production')
airbrake_handler = pybrake.LoggingHandler(notifier=notifier,level=logging.INFO)

logger = logging.getLogger('test')
logger.addHandler(airbrake_handler)

logger.error('something bad happened')