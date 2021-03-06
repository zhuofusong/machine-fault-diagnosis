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
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing ModelFlowChartExtensionApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ModelFlowChartExtensionApiTests
    {
        private ModelFlowChartExtensionApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ModelFlowChartExtensionApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ModelFlowChartExtensionApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ModelFlowChartExtensionApi
            //Assert.IsInstanceOfType(typeof(ModelFlowChartExtensionApi), instance, "instance is a ModelFlowChartExtensionApi");
        }

        /// <summary>
        /// Test ModelFlowModelFlowIdExtensionDelete
        /// </summary>
        [Test]
        public void ModelFlowModelFlowIdExtensionDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //var response = instance.ModelFlowModelFlowIdExtensionDelete(modelFlowId);
            //Assert.IsInstanceOf<Object> (response, "response is Object");
        }
        /// <summary>
        /// Test ModelFlowModelFlowIdExtensionGet
        /// </summary>
        [Test]
        public void ModelFlowModelFlowIdExtensionGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //var response = instance.ModelFlowModelFlowIdExtensionGet(modelFlowId);
            //Assert.IsInstanceOf<List<ModelFlowChartExtensionMeta>> (response, "response is List<ModelFlowChartExtensionMeta>");
        }
        /// <summary>
        /// Test ModelFlowModelFlowIdExtensionPost
        /// </summary>
        [Test]
        public void ModelFlowModelFlowIdExtensionPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //ModelFlowChartExtensionMeta modelFlowChartExtension = null;
            //var response = instance.ModelFlowModelFlowIdExtensionPost(modelFlowId, modelFlowChartExtension);
            //Assert.IsInstanceOf<Object> (response, "response is Object");
        }
        /// <summary>
        /// Test ModelFlowModelFlowIdExtensionPut
        /// </summary>
        [Test]
        public void ModelFlowModelFlowIdExtensionPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //ModelFlowChartExtensionMeta modelFlowChartExtension = null;
            //var response = instance.ModelFlowModelFlowIdExtensionPut(modelFlowId, modelFlowChartExtension);
            //Assert.IsInstanceOf<Object> (response, "response is Object");
        }
    }

}
