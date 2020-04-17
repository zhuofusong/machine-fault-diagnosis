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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ModelFlowChartValidationApi
 */
@Ignore
public class ModelFlowChartValidationApiTest {

    private final ModelFlowChartValidationApi api = new ModelFlowChartValidationApi();

    /**
     * validation of all kinds of objects
     *
     * validation of all kinds of objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelFlowValidationKindIdPostTest() throws ApiException {
        String kind = null;
        String id = null;
        Object response = api.modelFlowValidationKindIdPost(kind, id);

        // TODO: test validations
    }
}
