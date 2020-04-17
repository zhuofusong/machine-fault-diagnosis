'use strict';


/**
 * delete a node's information in a model flow chart
 * delete a node's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * nodeId String node's id in a model flow chart
 * returns Object
 **/
exports.modelFlowNodeModelFlowIdNodeIdDELETE = function(modelFlowId,nodeId) {
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
 * retrieve a node's information in a model flow chart
 * retrieve a node's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * nodeId String node's id in a model flow chart
 * returns List
 **/
exports.modelFlowNodeModelFlowIdNodeIdGET = function(modelFlowId,nodeId) {
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
 * create a node's information in a model flow chart
 * create a node's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * nodeId String node's id in a model flow chart
 * returns List
 **/
exports.modelFlowNodeModelFlowIdNodeIdPOST = function(modelFlowId,nodeId) {
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
 * update a node's information in a model flow chart
 * update a node's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * nodeId String node's id in a model flow chart
 * returns List
 **/
exports.modelFlowNodeModelFlowIdNodeIdPUT = function(modelFlowId,nodeId) {
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

