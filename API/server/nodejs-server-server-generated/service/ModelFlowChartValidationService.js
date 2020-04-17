'use strict';


/**
 * validation of all kinds of objects
 * validation of all kinds of objects
 *
 * kind String what kind of object to validate
 * id String id of the object to be validated
 * returns Object
 **/
exports.modelFlowValidationKindIdPOST = function(kind,id) {
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

