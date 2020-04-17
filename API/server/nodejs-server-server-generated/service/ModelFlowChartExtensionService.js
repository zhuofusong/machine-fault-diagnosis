'use strict';


/**
 * delete a model flow chart extension
 * delete a model flow chart extension
 *
 * modelFlowId String model flow chart id
 * returns Object
 **/
exports.modelFlowModelFlowIdExtensionDELETE = function(modelFlowId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * retrieve a model flow chart extension
 * retrieve a model flow chart extension
 *
 * modelFlowId String model flow chart id
 * returns List
 **/
exports.modelFlowModelFlowIdExtensionGET = function(modelFlowId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "modifiedTime" : 6.027456183070403,
  "comments" : "comments",
  "kind" : "kind",
  "author" : "author",
  "createdTime" : 0.8008281904610115,
  "id" : "id"
}, {
  "modifiedTime" : 6.027456183070403,
  "comments" : "comments",
  "kind" : "kind",
  "author" : "author",
  "createdTime" : 0.8008281904610115,
  "id" : "id"
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * create a model flow chart extension
 * create a model flow chart extension
 *
 * modelFlowId String model flow chart id
 * modelFlowChartExtension modelFlowChartExtensionMeta model flow chart extension
 * returns Object
 **/
exports.modelFlowModelFlowIdExtensionPOST = function(modelFlowId,modelFlowChartExtension) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * update a model flow chart extension
 * update a model flow chart extension
 *
 * modelFlowId String model flow chart id
 * modelFlowChartExtension modelFlowChartExtensionMeta model flow chart extension
 * returns Object
 **/
exports.modelFlowModelFlowIdExtensionPUT = function(modelFlowId,modelFlowChartExtension) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = { };
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

