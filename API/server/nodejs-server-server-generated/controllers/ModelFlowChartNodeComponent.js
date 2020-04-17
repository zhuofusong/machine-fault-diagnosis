'use strict';

var utils = require('../utils/writer.js');
var ModelFlowChartNodeComponent = require('../service/ModelFlowChartNodeComponentService');

module.exports.modelFlowNodeModelFlowIdNodeIdComponentDELETE = function modelFlowNodeModelFlowIdNodeIdComponentDELETE (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNodeComponent.modelFlowNodeModelFlowIdNodeIdComponentDELETE(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdNodeIdComponentGET = function modelFlowNodeModelFlowIdNodeIdComponentGET (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNodeComponent.modelFlowNodeModelFlowIdNodeIdComponentGET(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdNodeIdComponentPOST = function modelFlowNodeModelFlowIdNodeIdComponentPOST (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNodeComponent.modelFlowNodeModelFlowIdNodeIdComponentPOST(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdNodeIdComponentPUT = function modelFlowNodeModelFlowIdNodeIdComponentPUT (req, res, next, modelFlowId, nodeId) {
  ModelFlowChartNodeComponent.modelFlowNodeModelFlowIdNodeIdComponentPUT(modelFlowId, nodeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
