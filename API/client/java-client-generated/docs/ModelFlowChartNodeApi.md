# ModelFlowChartNodeApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelFlowNodeModelFlowIdNodeIdDelete**](ModelFlowChartNodeApi.md#modelFlowNodeModelFlowIdNodeIdDelete) | **DELETE** /modelFlow/node/{modelFlowId}/{nodeId} | delete a node&#x27;s information in a model flow chart
[**modelFlowNodeModelFlowIdNodeIdGet**](ModelFlowChartNodeApi.md#modelFlowNodeModelFlowIdNodeIdGet) | **GET** /modelFlow/node/{modelFlowId}/{nodeId} | retrieve a node&#x27;s information in a model flow chart
[**modelFlowNodeModelFlowIdNodeIdPost**](ModelFlowChartNodeApi.md#modelFlowNodeModelFlowIdNodeIdPost) | **POST** /modelFlow/node/{modelFlowId}/{nodeId} | create a node&#x27;s information in a model flow chart
[**modelFlowNodeModelFlowIdNodeIdPut**](ModelFlowChartNodeApi.md#modelFlowNodeModelFlowIdNodeIdPut) | **PUT** /modelFlow/node/{modelFlowId}/{nodeId} | update a node&#x27;s information in a model flow chart

<a name="modelFlowNodeModelFlowIdNodeIdDelete"></a>
# **modelFlowNodeModelFlowIdNodeIdDelete**
> Object modelFlowNodeModelFlowIdNodeIdDelete(modelFlowId, nodeId)

delete a node&#x27;s information in a model flow chart

delete a node&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeApi apiInstance = new ModelFlowChartNodeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    Object result = apiInstance.modelFlowNodeModelFlowIdNodeIdDelete(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeApi#modelFlowNodeModelFlowIdNodeIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **nodeId** | **String**| node&#x27;s id in a model flow chart |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdNodeIdGet"></a>
# **modelFlowNodeModelFlowIdNodeIdGet**
> List&lt;ModelFlowChartNodeMeta&gt; modelFlowNodeModelFlowIdNodeIdGet(modelFlowId, nodeId)

retrieve a node&#x27;s information in a model flow chart

retrieve a node&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeApi apiInstance = new ModelFlowChartNodeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    List<ModelFlowChartNodeMeta> result = apiInstance.modelFlowNodeModelFlowIdNodeIdGet(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeApi#modelFlowNodeModelFlowIdNodeIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **nodeId** | **String**| node&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartNodeMeta&gt;**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdNodeIdPost"></a>
# **modelFlowNodeModelFlowIdNodeIdPost**
> List&lt;ModelFlowChartNodeMeta&gt; modelFlowNodeModelFlowIdNodeIdPost(modelFlowId, nodeId)

create a node&#x27;s information in a model flow chart

create a node&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeApi apiInstance = new ModelFlowChartNodeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    List<ModelFlowChartNodeMeta> result = apiInstance.modelFlowNodeModelFlowIdNodeIdPost(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeApi#modelFlowNodeModelFlowIdNodeIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **nodeId** | **String**| node&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartNodeMeta&gt;**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdNodeIdPut"></a>
# **modelFlowNodeModelFlowIdNodeIdPut**
> List&lt;ModelFlowChartNodeMeta&gt; modelFlowNodeModelFlowIdNodeIdPut(modelFlowId, nodeId)

update a node&#x27;s information in a model flow chart

update a node&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeApi apiInstance = new ModelFlowChartNodeApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    List<ModelFlowChartNodeMeta> result = apiInstance.modelFlowNodeModelFlowIdNodeIdPut(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeApi#modelFlowNodeModelFlowIdNodeIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **nodeId** | **String**| node&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartNodeMeta&gt;**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

