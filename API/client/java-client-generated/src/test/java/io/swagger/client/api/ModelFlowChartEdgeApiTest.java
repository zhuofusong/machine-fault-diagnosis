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
import io.swagger.client.model.ModelFlowChartEdgeMeta;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelFlowChartEdgeApi
 */
@Ignore
public class ModelFlowChartEdgeApiTest {

    private final ModelFlowChartEdgeApi api = new ModelFlowChartEdgeApi();

    /**
     * delete an edge&#x27;s information in a model flow chart
     *
     * delete an edge&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdEdgeIdDeleteTest() throws ApiException {
        String modelFlowId = null;
        String edgeId = null;
        Object response = api.modelFlowNodeModelFlowIdEdgeIdDelete(modelFlowId, edgeId);

        // TODO: test validations
    }
    /**
     * retrieve an edge&#x27;s information in a model flow chart
     *
     * retrieve an edge&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdEdgeIdGetTest() throws ApiException {
        String modelFlowId = null;
        String edgeId = null;
        List<ModelFlowChartEdgeMeta> response = api.modelFlowNodeModelFlowIdEdgeIdGet(modelFlowId, edgeId);

        // TODO: test validations
    }
    /**
     * create an edge&#x27;s information in a model flow chart
     *
     * create an edge&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdEdgeIdPostTest() throws ApiException {
        String modelFlowId = null;
        String edgeId = null;
        List<ModelFlowChartEdgeMeta> response = api.modelFlowNodeModelFlowIdEdgeIdPost(modelFlowId, edgeId);

        // TODO: test validations
    }
    /**
     * update an edge&#x27;s information in a model flow chart
     *
     * update an edge&#x27;s information in a model flow chart
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowNodeModelFlowIdEdgeIdPutTest() throws ApiException {
        String modelFlowId = null;
        String edgeId = null;
        List<ModelFlowChartEdgeMeta> response = api.modelFlowNodeModelFlowIdEdgeIdPut(modelFlowId, edgeId);

        // TODO: test validations
    }
}
