'use strict';

var utils = require('../utils/writer.js');
var ModelFlowChartExtension = require('../service/ModelFlowChartExtensionService');

module.exports.modelFlowModelFlowIdExtensionDELETE = function modelFlowModelFlowIdExtensionDELETE (req, res, next, modelFlowId) {
  ModelFlowChartExtension.modelFlowModelFlowIdExtensionDELETE(modelFlowId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowModelFlowIdExtensionGET = function modelFlowModelFlowIdExtensionGET (req, res, next, modelFlowId) {
  ModelFlowChartExtension.modelFlowModelFlowIdExtensionGET(modelFlowId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowModelFlowIdExtensionPOST = function modelFlowModelFlowIdExtensionPOST (req, res, next, modelFlowId, modelFlowChartExtension) {
  ModelFlowChartExtension.modelFlowModelFlowIdExtensionPOST(modelFlowId, modelFlowChartExtension)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowModelFlowIdExtensionPUT = function modelFlowModelFlowIdExtensionPUT (req, res, next, modelFlowId, modelFlowChartExtension) {
  ModelFlowChartExtension.modelFlowModelFlowIdExtensionPUT(modelFlowId, modelFlowChartExtension)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
