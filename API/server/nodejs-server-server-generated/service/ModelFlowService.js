'use strict';


/**
 * delete a list of model flow charts
 * delete a list of model flow charts
 *
 * modelFlowSearchString String the string for searching for model flow charts (optional)
 * returns Object
 **/
exports.modelFlowDELETE = function(modelFlowSearchString) {
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
 * get a list of all model flow charts
 * Get a list of all model flow charts
 *
 * modelFlowSearchString String the string for searching for model flow charts (optional)
 * returns List
 **/
exports.modelFlowGET = function(modelFlowSearchString) {
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

