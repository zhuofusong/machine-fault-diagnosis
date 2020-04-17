'use strict';


/**
 * delete a model flow chart
 * delete a model flow chart
 *
 * modelFlowId String model flow chart id
 * returns Object
 **/
exports.modelFlowModelFlowIdDELETE = function(modelFlowId) {
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
 * retrieve a model flow chart
 * retrieve a model flow chart
 *
 * modelFlowId String model flow chart id
 * returns List
 **/
exports.modelFlowModelFlowIdGET = function(modelFlowId) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    examples['application/json'] = [ {
  "lastModifiedTime" : 6.027456183070403,
  "comments" : "comments",
  "kind" : "kind",
  "author" : "author",
  "editMode" : "editMode",
  "createdTime" : 0.8008281904610115,
  "id" : "id",
  "config" : { }
}, {
  "lastModifiedTime" : 6.027456183070403,
  "comments" : "comments",
  "kind" : "kind",
  "author" : "author",
  "editMode" : "editMode",
  "createdTime" : 0.8008281904610115,
  "id" : "id",
  "config" : { }
} ];
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}


/**
 * create a model flow chart
 * create a model flow chart
 *
 * modelFlowId String model flow chart id
 * modelFlowChart modelFlowChart model flow chart
 * returns Object
 **/
exports.modelFlowModelFlowIdPOST = function(modelFlowId,modelFlowChart) {
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
 * update a model flow chart
 * update a model flow chart
 *
 * modelFlowId String model flow chart id
 * modelFlowChart modelFlowChart model flow chart
 * returns Object
 **/
exports.modelFlowModelFlowIdPUT = function(modelFlowId,modelFlowChart) {
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

