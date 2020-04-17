/*
 * Machine fault diagnosis
 * List of top level server APIs
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ModelFlowChartNodeMeta;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelFlowChartNodeApi
 */
@Ignore
public class ModelFlowChartNodeApiTest {

    private final ModelFlowChartNodeApi api = new ModelFlowChartNodeApi();

    /**
     * delete a node&#x27;s information in a model flow chart
     *
     * delete a node&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdNodeIdDeleteTest() throws ApiException {
        String modelFlowId = null;
        String nodeId = null;
        Object response = api.modelFlowNodeModelFlowIdNodeIdDelete(modelFlowId, nodeId);

        // TODO: test validations
    }
    /**
     * retrieve a node&#x27;s information in a model flow chart
     *
     * retrieve a node&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdNodeIdGetTest() throws ApiException {
        String modelFlowId = null;
        String nodeId = null;
        List<ModelFlowChartNodeMeta> response = api.modelFlowNodeModelFlowIdNodeIdGet(modelFlowId, nodeId);

        // TODO: test validations
    }
    /**
     * create a node&#x27;s information in a model flow chart
     *
     * create a node&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdNodeIdPostTest() throws ApiException {
        String modelFlowId = null;
        String nodeId = null;
        List<ModelFlowChartNodeMeta> response = api.modelFlowNodeModelFlowIdNodeIdPost(modelFlowId, nodeId);

        // TODO: test validations
    }
    /**
     * update a node&#x27;s information in a model flow chart
     *
     * update a node&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdNodeIdPutTest() throws ApiException {
        String modelFlowId = null;
        String nodeId = null;
        List<ModelFlowChartNodeMeta> response = api.modelFlowNodeModelFlowIdNodeIdPut(modelFlowId, nodeId);

        // TODO: test validations
    }
}
