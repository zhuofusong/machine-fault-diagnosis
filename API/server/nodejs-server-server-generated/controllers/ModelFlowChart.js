'use strict';

var utils = require('../utils/writer.js');
var ModelFlowChart = require('../service/ModelFlowChartService');

module.exports.modelFlowModelFlowIdDELETE = function modelFlowModelFlowIdDELETE (req, res, next, modelFlowId) {
  ModelFlowChart.modelFlowModelFlowIdDELETE(modelFlowId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowModelFlowIdGET = function modelFlowModelFlowIdGET (req, res, next, modelFlowId) {
  ModelFlowChart.modelFlowModelFlowIdGET(modelFlowId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowModelFlowIdPOST = function modelFlowModelFlowIdPOST (req, res, next, modelFlowId, modelFlowChart) {
  ModelFlowChart.modelFlowModelFlowIdPOST(modelFlowId, modelFlowChart)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowModelFlowIdPUT = function modelFlowModelFlowIdPUT (req, res, next, modelFlowId, modelFlowChart) {
  ModelFlowChart.modelFlowModelFlowIdPUT(modelFlowId, modelFlowChart)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
