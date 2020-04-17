'use strict';

var utils = require('../utils/writer.js');
var ModelFlowChartEdge = require('../service/ModelFlowChartEdgeService');

module.exports.modelFlowNodeModelFlowIdEdgeIdDELETE = function modelFlowNodeModelFlowIdEdgeIdDELETE (req, res, next, modelFlowId, edgeId) {
  ModelFlowChartEdge.modelFlowNodeModelFlowIdEdgeIdDELETE(modelFlowId, edgeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdEdgeIdGET = function modelFlowNodeModelFlowIdEdgeIdGET (req, res, next, modelFlowId, edgeId) {
  ModelFlowChartEdge.modelFlowNodeModelFlowIdEdgeIdGET(modelFlowId, edgeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdEdgeIdPOST = function modelFlowNodeModelFlowIdEdgeIdPOST (req, res, next, modelFlowId, edgeId) {
  ModelFlowChartEdge.modelFlowNodeModelFlowIdEdgeIdPOST(modelFlowId, edgeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};

module.exports.modelFlowNodeModelFlowIdEdgeIdPUT = function modelFlowNodeModelFlowIdEdgeIdPUT (req, res, next, modelFlowId, edgeId) {
  ModelFlowChartEdge.modelFlowNodeModelFlowIdEdgeIdPUT(modelFlowId, edgeId)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
