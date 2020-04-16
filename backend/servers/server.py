""" This is the main flask server entrance for the backend service """

import os
import logging
import json
import pybrake
from utils import getlog
from flask import Flask
from flasgger import Swagger, swag_from

app = Flask(__name__)

yml_dir = os.path.abspath(os.path.join(os.path.dirname(__file__),"../../API"))

swag = Swagger(app)

##################################################
# API implementation
##################################################

@app.route('/modelFlow')
@swag_from(os.path.join(yml_dir, 'swagger_backend_server.yml'))
def modelFlow():
    """list all model flow charts"""
    


if __name__ == '__main__':
    app.run(debug=True)

