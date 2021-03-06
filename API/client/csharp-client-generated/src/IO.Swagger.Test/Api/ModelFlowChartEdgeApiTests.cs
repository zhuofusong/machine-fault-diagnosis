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
    ///  Class for testing ModelFlowChartEdgeApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class ModelFlowChartEdgeApiTests
    {
        private ModelFlowChartEdgeApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new ModelFlowChartEdgeApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of ModelFlowChartEdgeApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' ModelFlowChartEdgeApi
            //Assert.IsInstanceOfType(typeof(ModelFlowChartEdgeApi), instance, "instance is a ModelFlowChartEdgeApi");
        }

        /// <summary>
        /// Test ModelFlowNodeModelFlowIdEdgeIdDelete
        /// </summary>
        [Test]
        public void ModelFlowNodeModelFlowIdEdgeIdDeleteTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //string edgeId = null;
            //var response = instance.ModelFlowNodeModelFlowIdEdgeIdDelete(modelFlowId, edgeId);
            //Assert.IsInstanceOf<Object> (response, "response is Object");
        }
        /// <summary>
        /// Test ModelFlowNodeModelFlowIdEdgeIdGet
        /// </summary>
        [Test]
        public void ModelFlowNodeModelFlowIdEdgeIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //string edgeId = null;
            //var response = instance.ModelFlowNodeModelFlowIdEdgeIdGet(modelFlowId, edgeId);
            //Assert.IsInstanceOf<List<ModelFlowChartEdgeMeta>> (response, "response is List<ModelFlowChartEdgeMeta>");
        }
        /// <summary>
        /// Test ModelFlowNodeModelFlowIdEdgeIdPost
        /// </summary>
        [Test]
        public void ModelFlowNodeModelFlowIdEdgeIdPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //string edgeId = null;
            //var response = instance.ModelFlowNodeModelFlowIdEdgeIdPost(modelFlowId, edgeId);
            //Assert.IsInstanceOf<List<ModelFlowChartEdgeMeta>> (response, "response is List<ModelFlowChartEdgeMeta>");
        }
        /// <summary>
        /// Test ModelFlowNodeModelFlowIdEdgeIdPut
        /// </summary>
        [Test]
        public void ModelFlowNodeModelFlowIdEdgeIdPutTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string modelFlowId = null;
            //string edgeId = null;
            //var response = instance.ModelFlowNodeModelFlowIdEdgeIdPut(modelFlowId, edgeId);
            //Assert.IsInstanceOf<List<ModelFlowChartEdgeMeta>> (response, "response is List<ModelFlowChartEdgeMeta>");
        }
    }

}
