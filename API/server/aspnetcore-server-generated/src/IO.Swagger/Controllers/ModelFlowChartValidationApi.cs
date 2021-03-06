/*
 * Machine fault diagnosis
 *
 * List of top level server APIs
 *
 * OpenAPI spec version: 1.0.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using IO.Swagger.Attributes;
using IO.Swagger.Security;
using Microsoft.AspNetCore.Authorization;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class ModelFlowChartValidationApiController : ControllerBase
    { 
        /// <summary>
        /// validation of all kinds of objects
        /// </summary>
        /// <remarks>validation of all kinds of objects</remarks>
        /// <param name="kind">what kind of object to validate</param>
        /// <param name="id">id of the object to be validated</param>
        /// <response code="200">passed validation</response>
        /// <response code="400">object is not valid</response>
        /// <response code="500">internal server error</response>
        [HttpPost]
        [Route("/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/validation/{kind}/{id}")]
        [ValidateModelState]
        [SwaggerOperation("ModelFlowValidationKindIdPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "passed validation")]
        public virtual IActionResult ModelFlowValidationKindIdPost([FromRoute][Required]string kind, [FromRoute][Required]string id)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{ }";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<Object>(exampleJson)
                        : default(Object);            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
