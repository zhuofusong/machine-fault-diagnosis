# ModelFlowChartEdgeApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelFlowNodeModelFlowIdEdgeIdDelete**](ModelFlowChartEdgeApi.md#modelFlowNodeModelFlowIdEdgeIdDelete) | **DELETE** /modelFlow/node/{modelFlowId}/{edgeId} | delete an edge&#x27;s information in a model flow chart
[**modelFlowNodeModelFlowIdEdgeIdGet**](ModelFlowChartEdgeApi.md#modelFlowNodeModelFlowIdEdgeIdGet) | **GET** /modelFlow/node/{modelFlowId}/{edgeId} | retrieve an edge&#x27;s information in a model flow chart
[**modelFlowNodeModelFlowIdEdgeIdPost**](ModelFlowChartEdgeApi.md#modelFlowNodeModelFlowIdEdgeIdPost) | **POST** /modelFlow/node/{modelFlowId}/{edgeId} | create an edge&#x27;s information in a model flow chart
[**modelFlowNodeModelFlowIdEdgeIdPut**](ModelFlowChartEdgeApi.md#modelFlowNodeModelFlowIdEdgeIdPut) | **PUT** /modelFlow/node/{modelFlowId}/{edgeId} | update an edge&#x27;s information in a model flow chart

<a name="modelFlowNodeModelFlowIdEdgeIdDelete"></a>
# **modelFlowNodeModelFlowIdEdgeIdDelete**
> Object modelFlowNodeModelFlowIdEdgeIdDelete(modelFlowId, edgeId)

delete an edge&#x27;s information in a model flow chart

delete an edge&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartEdgeApi apiInstance = new ModelFlowChartEdgeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String edgeId = "edgeId_example"; // String | edge's id in a model flow chart
try {
    Object result = apiInstance.modelFlowNodeModelFlowIdEdgeIdDelete(modelFlowId, edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartEdgeApi#modelFlowNodeModelFlowIdEdgeIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **edgeId** | **String**| edge&#x27;s id in a model flow chart |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdEdgeIdGet"></a>
# **modelFlowNodeModelFlowIdEdgeIdGet**
> List&lt;ModelFlowChartEdgeMeta&gt; modelFlowNodeModelFlowIdEdgeIdGet(modelFlowId, edgeId)

retrieve an edge&#x27;s information in a model flow chart

retrieve an edge&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartEdgeApi apiInstance = new ModelFlowChartEdgeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String edgeId = "edgeId_example"; // String | edge's id in a model flow chart
try {
    List<ModelFlowChartEdgeMeta> result = apiInstance.modelFlowNodeModelFlowIdEdgeIdGet(modelFlowId, edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartEdgeApi#modelFlowNodeModelFlowIdEdgeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **edgeId** | **String**| edge&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartEdgeMeta&gt;**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdEdgeIdPost"></a>
# **modelFlowNodeModelFlowIdEdgeIdPost**
> List&lt;ModelFlowChartEdgeMeta&gt; modelFlowNodeModelFlowIdEdgeIdPost(modelFlowId, edgeId)

create an edge&#x27;s information in a model flow chart

create an edge&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartEdgeApi apiInstance = new ModelFlowChartEdgeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String edgeId = "edgeId_example"; // String | edge's id in a model flow chart
try {
    List<ModelFlowChartEdgeMeta> result = apiInstance.modelFlowNodeModelFlowIdEdgeIdPost(modelFlowId, edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartEdgeApi#modelFlowNodeModelFlowIdEdgeIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **edgeId** | **String**| edge&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartEdgeMeta&gt;**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdEdgeIdPut"></a>
# **modelFlowNodeModelFlowIdEdgeIdPut**
> List&lt;ModelFlowChartEdgeMeta&gt; modelFlowNodeModelFlowIdEdgeIdPut(modelFlowId, edgeId)

update an edge&#x27;s information in a model flow chart

update an edge&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartEdgeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartEdgeApi apiInstance = new ModelFlowChartEdgeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String edgeId = "edgeId_example"; // String | edge's id in a model flow chart
try {
    List<ModelFlowChartEdgeMeta> result = apiInstance.modelFlowNodeModelFlowIdEdgeIdPut(modelFlowId, edgeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartEdgeApi#modelFlowNodeModelFlowIdEdgeIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **edgeId** | **String**| edge&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartEdgeMeta&gt;**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

