'use strict';

var utils = require('../utils/writer.js');
var ModelFlowChartValidation = require('../service/ModelFlowChartValidationService');

module.exports.modelFlowValidationKindIdPOST = function modelFlowValidationKindIdPOST (req, res, next, kind, id) {
  ModelFlowChartValidation.modelFlowValidationKindIdPOST(kind, id)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
