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


import io.swagger.client.model.ModelFlowChartNodeComponentMeta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelFlowChartNodeComponentApi {
    private ApiClient apiClient;

    public ModelFlowChartNodeComponentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ModelFlowChartNodeComponentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for modelFlowNodeModelFlowIdNodeIdComponentDelete
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentDeleteCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/node/{modelFlowId}/{nodeId}/component"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()))
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()));

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
    private com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentDeleteValidateBeforeCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowNodeModelFlowIdNodeIdComponentDelete(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling modelFlowNodeModelFlowIdNodeIdComponentDelete(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentDeleteCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * delete a node&#x27;s components information in a model flow chart
     * delete a node&#x27;s components information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object modelFlowNodeModelFlowIdNodeIdComponentDelete(String modelFlowId, String nodeId) throws ApiException {
        ApiResponse<Object> resp = modelFlowNodeModelFlowIdNodeIdComponentDeleteWithHttpInfo(modelFlowId, nodeId);
        return resp.getData();
    }

    /**
     * delete a node&#x27;s components information in a model flow chart
     * delete a node&#x27;s components information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> modelFlowNodeModelFlowIdNodeIdComponentDeleteWithHttpInfo(String modelFlowId, String nodeId) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentDeleteValidateBeforeCall(modelFlowId, nodeId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * delete a node&#x27;s components information in a model flow chart (asynchronously)
     * delete a node&#x27;s components information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentDeleteAsync(String modelFlowId, String nodeId, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentDeleteValidateBeforeCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modelFlowNodeModelFlowIdNodeIdComponentGet
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentGetCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/node/{modelFlowId}/{nodeId}/component"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()))
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()));

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
    private com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentGetValidateBeforeCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowNodeModelFlowIdNodeIdComponentGet(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling modelFlowNodeModelFlowIdNodeIdComponentGet(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentGetCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * retrieve a node&#x27;s components information in a model flow chart
     * retrieve a node&#x27;s components information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return List&lt;ModelFlowChartNodeComponentMeta&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ModelFlowChartNodeComponentMeta> modelFlowNodeModelFlowIdNodeIdComponentGet(String modelFlowId, String nodeId) throws ApiException {
        ApiResponse<List<ModelFlowChartNodeComponentMeta>> resp = modelFlowNodeModelFlowIdNodeIdComponentGetWithHttpInfo(modelFlowId, nodeId);
        return resp.getData();
    }

    /**
     * retrieve a node&#x27;s components information in a model flow chart
     * retrieve a node&#x27;s components information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return ApiResponse&lt;List&lt;ModelFlowChartNodeComponentMeta&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ModelFlowChartNodeComponentMeta>> modelFlowNodeModelFlowIdNodeIdComponentGetWithHttpInfo(String modelFlowId, String nodeId) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentGetValidateBeforeCall(modelFlowId, nodeId, null, null);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartNodeComponentMeta>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * retrieve a node&#x27;s components information in a model flow chart (asynchronously)
     * retrieve a node&#x27;s components information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentGetAsync(String modelFlowId, String nodeId, final ApiCallback<List<ModelFlowChartNodeComponentMeta>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentGetValidateBeforeCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartNodeComponentMeta>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modelFlowNodeModelFlowIdNodeIdComponentPost
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentPostCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/node/{modelFlowId}/{nodeId}/component"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()))
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentPostValidateBeforeCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowNodeModelFlowIdNodeIdComponentPost(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling modelFlowNodeModelFlowIdNodeIdComponentPost(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentPostCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * create a node&#x27;s components information in a model flow chart
     * create a node&#x27;s information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return List&lt;ModelFlowChartNodeComponentMeta&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ModelFlowChartNodeComponentMeta> modelFlowNodeModelFlowIdNodeIdComponentPost(String modelFlowId, String nodeId) throws ApiException {
        ApiResponse<List<ModelFlowChartNodeComponentMeta>> resp = modelFlowNodeModelFlowIdNodeIdComponentPostWithHttpInfo(modelFlowId, nodeId);
        return resp.getData();
    }

    /**
     * create a node&#x27;s components information in a model flow chart
     * create a node&#x27;s information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return ApiResponse&lt;List&lt;ModelFlowChartNodeComponentMeta&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ModelFlowChartNodeComponentMeta>> modelFlowNodeModelFlowIdNodeIdComponentPostWithHttpInfo(String modelFlowId, String nodeId) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentPostValidateBeforeCall(modelFlowId, nodeId, null, null);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartNodeComponentMeta>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * create a node&#x27;s components information in a model flow chart (asynchronously)
     * create a node&#x27;s information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentPostAsync(String modelFlowId, String nodeId, final ApiCallback<List<ModelFlowChartNodeComponentMeta>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentPostValidateBeforeCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartNodeComponentMeta>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for modelFlowNodeModelFlowIdNodeIdComponentPut
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentPutCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/modelFlow/node/{modelFlowId}/{nodeId}/component"
            .replaceAll("\\{" + "modelFlowId" + "\\}", apiClient.escapeString(modelFlowId.toString()))
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentPutValidateBeforeCall(String modelFlowId, String nodeId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'modelFlowId' is set
        if (modelFlowId == null) {
            throw new ApiException("Missing the required parameter 'modelFlowId' when calling modelFlowNodeModelFlowIdNodeIdComponentPut(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling modelFlowNodeModelFlowIdNodeIdComponentPut(Async)");
        }
        
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentPutCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * update a node&#x27;s components information in a model flow chart
     * update a node&#x27;s information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return List&lt;ModelFlowChartNodeComponentMeta&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ModelFlowChartNodeComponentMeta> modelFlowNodeModelFlowIdNodeIdComponentPut(String modelFlowId, String nodeId) throws ApiException {
        ApiResponse<List<ModelFlowChartNodeComponentMeta>> resp = modelFlowNodeModelFlowIdNodeIdComponentPutWithHttpInfo(modelFlowId, nodeId);
        return resp.getData();
    }

    /**
     * update a node&#x27;s components information in a model flow chart
     * update a node&#x27;s information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @return ApiResponse&lt;List&lt;ModelFlowChartNodeComponentMeta&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ModelFlowChartNodeComponentMeta>> modelFlowNodeModelFlowIdNodeIdComponentPutWithHttpInfo(String modelFlowId, String nodeId) throws ApiException {
        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentPutValidateBeforeCall(modelFlowId, nodeId, null, null);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartNodeComponentMeta>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * update a node&#x27;s components information in a model flow chart (asynchronously)
     * update a node&#x27;s information in a model flow chart
     * @param modelFlowId model flow chart id (required)
     * @param nodeId node&#x27;s id in a model flow chart (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call modelFlowNodeModelFlowIdNodeIdComponentPutAsync(String modelFlowId, String nodeId, final ApiCallback<List<ModelFlowChartNodeComponentMeta>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = modelFlowNodeModelFlowIdNodeIdComponentPutValidateBeforeCall(modelFlowId, nodeId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ModelFlowChartNodeComponentMeta>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
