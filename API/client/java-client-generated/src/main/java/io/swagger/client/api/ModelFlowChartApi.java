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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ModelFlowChart;
import io.swagger.client.model.ModelFlowChartMeta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelFlowChartApi {
    private ApiClient apiClient;

    public ModelFlowChartApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModelFlowChartApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for modelFlowModelFlowIdDelete
     * @param modelFlowId model flow chart id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdDeleteCall(String modelFlowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/{modelFlowId}"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modelFlowModelFlowIdDeleteValidateBeforeCall(String modelFlowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowModelFlowIdDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowModelFlowIdDeleteCall(modelFlowId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * delete a model flow chart
     * delete a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object modelFlowModelFlowIdDelete(String modelFlowId) throws ApiException {
        ApiResponse<Object> resp = modelFlowModelFlowIdDeleteWithHttpInfo(modelFlowId);
        return resp.getData();
    }

    /**
     * delete a model flow chart
     * delete a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> modelFlowModelFlowIdDeleteWithHttpInfo(String modelFlowId) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowModelFlowIdDeleteValidateBeforeCall(modelFlowId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * delete a model flow chart (asynchronously)
     * delete a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdDeleteAsync(String modelFlowId, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modelFlowModelFlowIdDeleteValidateBeforeCall(modelFlowId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modelFlowModelFlowIdGet
     * @param modelFlowId model flow chart id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdGetCall(String modelFlowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/{modelFlowId}"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modelFlowModelFlowIdGetValidateBeforeCall(String modelFlowId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowModelFlowIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowModelFlowIdGetCall(modelFlowId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * retrieve a model flow chart
     * retrieve a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @return List&lt;ModelFlowChartMeta&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ModelFlowChartMeta> modelFlowModelFlowIdGet(String modelFlowId) throws ApiException {
        ApiResponse<List<ModelFlowChartMeta>> resp = modelFlowModelFlowIdGetWithHttpInfo(modelFlowId);
        return resp.getData();
    }

    /**
     * retrieve a model flow chart
     * retrieve a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @return ApiResponse&lt;List&lt;ModelFlowChartMeta&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ModelFlowChartMeta>> modelFlowModelFlowIdGetWithHttpInfo(String modelFlowId) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowModelFlowIdGetValidateBeforeCall(modelFlowId, null, null);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartMeta>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * retrieve a model flow chart (asynchronously)
     * retrieve a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdGetAsync(String modelFlowId, final ApiCallback<List<ModelFlowChartMeta>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modelFlowModelFlowIdGetValidateBeforeCall(modelFlowId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartMeta>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modelFlowModelFlowIdPost
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdPostCall(String modelFlowId, ModelFlowChart modelFlowChart, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/{modelFlowId}"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelFlowChart != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("modelFlowChart", modelFlowChart));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modelFlowModelFlowIdPostValidateBeforeCall(String modelFlowId, ModelFlowChart modelFlowChart, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowModelFlowIdPost(Async)");
        }
        // verify the required parameter 'modelFlowChart' is set
        if (modelFlowChart == null) {
            throw new ApiException("Missing the required parameter 'modelFlowChart' when calling modelFlowModelFlowIdPost(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowModelFlowIdPostCall(modelFlowId, modelFlowChart, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * create a model flow chart
     * create a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object modelFlowModelFlowIdPost(String modelFlowId, ModelFlowChart modelFlowChart) throws ApiException {
        ApiResponse<Object> resp = modelFlowModelFlowIdPostWithHttpInfo(modelFlowId, modelFlowChart);
        return resp.getData();
    }

    /**
     * create a model flow chart
     * create a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> modelFlowModelFlowIdPostWithHttpInfo(String modelFlowId, ModelFlowChart modelFlowChart) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowModelFlowIdPostValidateBeforeCall(modelFlowId, modelFlowChart, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create a model flow chart (asynchronously)
     * create a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdPostAsync(String modelFlowId, ModelFlowChart modelFlowChart, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modelFlowModelFlowIdPostValidateBeforeCall(modelFlowId, modelFlowChart, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modelFlowModelFlowIdPut
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdPutCall(String modelFlowId, ModelFlowChart modelFlowChart, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/{modelFlowId}"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelFlowChart != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("modelFlowChart", modelFlowChart));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "application" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modelFlowModelFlowIdPutValidateBeforeCall(String modelFlowId, ModelFlowChart modelFlowChart, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowModelFlowIdPut(Async)");
        }
        // verify the required parameter 'modelFlowChart' is set
        if (modelFlowChart == null) {
            throw new ApiException("Missing the required parameter 'modelFlowChart' when calling modelFlowModelFlowIdPut(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowModelFlowIdPutCall(modelFlowId, modelFlowChart, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * update a model flow chart
     * update a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object modelFlowModelFlowIdPut(String modelFlowId, ModelFlowChart modelFlowChart) throws ApiException {
        ApiResponse<Object> resp = modelFlowModelFlowIdPutWithHttpInfo(modelFlowId, modelFlowChart);
        return resp.getData();
    }

    /**
     * update a model flow chart
     * update a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> modelFlowModelFlowIdPutWithHttpInfo(String modelFlowId, ModelFlowChart modelFlowChart) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowModelFlowIdPutValidateBeforeCall(modelFlowId, modelFlowChart, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update a model flow chart (asynchronously)
     * update a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param modelFlowChart model flow chart (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowModelFlowIdPutAsync(String modelFlowId, ModelFlowChart modelFlowChart, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = modelFlowModelFlowIdPutValidateBeforeCall(modelFlowId, modelFlowChart, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}