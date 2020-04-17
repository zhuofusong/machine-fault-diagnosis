'use strict';

var utils = require('../utils/writer.js');
var ModelFlowChartNode = require('../service/ModelFlowChartNodeService');

module.exports.modelFlowNodeModelFlowIdNodeIdDELETE = function modelFlowNodeModelFlowIdNodeIdDELETE (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNode.modelFlowNodeModelFlowIdNodeIdDELETE(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdNodeIdGET = function modelFlowNodeModelFlowIdNodeIdGET (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNode.modelFlowNodeModelFlowIdNodeIdGET(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdNodeIdPOST = function modelFlowNodeModelFlowIdNodeIdPOST (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNode.modelFlowNodeModelFlowIdNodeIdPOST(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdNodeIdPUT = function modelFlowNodeModelFlowIdNodeIdPUT (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNode.modelFlowNodeModelFlowIdNodeIdPUT(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
