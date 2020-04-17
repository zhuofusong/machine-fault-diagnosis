'use strict';

var utils = require('../utils/writer.js');
var ModelFlow = require('../service/ModelFlowService');

module.exports.modelFlowDELETE = function modelFlowDELETE (req, res, next, modelFlowSearchString) {
  ModelFlow.modelFlowDELETE(modelFlowSearchString)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowGET = function modelFlowGET (req, res, next, modelFlowSearchString) {
  ModelFlow.modelFlowGET(modelFlowSearchString)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
