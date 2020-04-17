'use strict';


/**
 * delete an edge's information in a model flow chart
 * delete an edge's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * edgeId String edge's id in a model flow chart
 * returns Object
 **/
exports.modelFlowNodeModelFlowIdEdgeIdDELETE = function(modelFlowId,edgeId) {
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
 * retrieve an edge's information in a model flow chart
 * retrieve an edge's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * edgeId String edge's id in a model flow chart
 * returns List
 **/
exports.modelFlowNodeModelFlowIdEdgeIdGET = function(modelFlowId,edgeId) {
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
 * create an edge's information in a model flow chart
 * create an edge's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * edgeId String edge's id in a model flow chart
 * returns List
 **/
exports.modelFlowNodeModelFlowIdEdgeIdPOST = function(modelFlowId,edgeId) {
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
 * update an edge's information in a model flow chart
 * update an edge's information in a model flow chart
 *
 * modelFlowId String model flow chart id
 * edgeId String edge's id in a model flow chart
 * returns List
 **/
exports.modelFlowNodeModelFlowIdEdgeIdPUT = function(modelFlowId,edgeId) {
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

