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
import io.swagger.client.model.ModelFlowChartMeta;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelFlowApi
 */
@Ignore
public class ModelFlowApiTest {

    private final ModelFlowApi api = new ModelFlowApi();

    /**
     * delete a list of model flow charts
     *
     * delete a list of model flow charts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowDeleteTest() throws ApiException {
        String modelFlowSearchString = null;
        Object response = api.modelFlowDelete(modelFlowSearchString);

        // TODO: test validations
    }
    /**
     * get a list of all model flow charts
     *
     * Get a list of all model flow charts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowGetTest() throws ApiException {
        String modelFlowSearchString = null;
        List<ModelFlowChartMeta> response = api.modelFlowGet(modelFlowSearchString);

        // TODO: test validations
    }
}
