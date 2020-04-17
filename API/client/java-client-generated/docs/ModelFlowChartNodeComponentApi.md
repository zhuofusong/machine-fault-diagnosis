# ModelFlowChartNodeComponentApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelFlowNodeModelFlowIdNodeIdComponentDelete**](ModelFlowChartNodeComponentApi.md#modelFlowNodeModelFlowIdNodeIdComponentDelete) | **DELETE** /modelFlow/node/{modelFlowId}/{nodeId}/component | delete a node&#x27;s components information in a model flow chart
[**modelFlowNodeModelFlowIdNodeIdComponentGet**](ModelFlowChartNodeComponentApi.md#modelFlowNodeModelFlowIdNodeIdComponentGet) | **GET** /modelFlow/node/{modelFlowId}/{nodeId}/component | retrieve a node&#x27;s components information in a model flow chart
[**modelFlowNodeModelFlowIdNodeIdComponentPost**](ModelFlowChartNodeComponentApi.md#modelFlowNodeModelFlowIdNodeIdComponentPost) | **POST** /modelFlow/node/{modelFlowId}/{nodeId}/component | create a node&#x27;s components information in a model flow chart
[**modelFlowNodeModelFlowIdNodeIdComponentPut**](ModelFlowChartNodeComponentApi.md#modelFlowNodeModelFlowIdNodeIdComponentPut) | **PUT** /modelFlow/node/{modelFlowId}/{nodeId}/component | update a node&#x27;s components information in a model flow chart

<a name="modelFlowNodeModelFlowIdNodeIdComponentDelete"></a>
# **modelFlowNodeModelFlowIdNodeIdComponentDelete**
> Object modelFlowNodeModelFlowIdNodeIdComponentDelete(modelFlowId, nodeId)

delete a node&#x27;s components information in a model flow chart

delete a node&#x27;s components information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeComponentApi apiInstance = new ModelFlowChartNodeComponentApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    Object result = apiInstance.modelFlowNodeModelFlowIdNodeIdComponentDelete(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeComponentApi#modelFlowNodeModelFlowIdNodeIdComponentDelete");
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

<a name="modelFlowNodeModelFlowIdNodeIdComponentGet"></a>
# **modelFlowNodeModelFlowIdNodeIdComponentGet**
> List&lt;ModelFlowChartNodeComponentMeta&gt; modelFlowNodeModelFlowIdNodeIdComponentGet(modelFlowId, nodeId)

retrieve a node&#x27;s components information in a model flow chart

retrieve a node&#x27;s components information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeComponentApi apiInstance = new ModelFlowChartNodeComponentApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    List<ModelFlowChartNodeComponentMeta> result = apiInstance.modelFlowNodeModelFlowIdNodeIdComponentGet(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeComponentApi#modelFlowNodeModelFlowIdNodeIdComponentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **nodeId** | **String**| node&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartNodeComponentMeta&gt;**](ModelFlowChartNodeComponentMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdNodeIdComponentPost"></a>
# **modelFlowNodeModelFlowIdNodeIdComponentPost**
> List&lt;ModelFlowChartNodeComponentMeta&gt; modelFlowNodeModelFlowIdNodeIdComponentPost(modelFlowId, nodeId)

create a node&#x27;s components information in a model flow chart

create a node&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeComponentApi apiInstance = new ModelFlowChartNodeComponentApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    List<ModelFlowChartNodeComponentMeta> result = apiInstance.modelFlowNodeModelFlowIdNodeIdComponentPost(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeComponentApi#modelFlowNodeModelFlowIdNodeIdComponentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **nodeId** | **String**| node&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartNodeComponentMeta&gt;**](ModelFlowChartNodeComponentMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowNodeModelFlowIdNodeIdComponentPut"></a>
# **modelFlowNodeModelFlowIdNodeIdComponentPut**
> List&lt;ModelFlowChartNodeComponentMeta&gt; modelFlowNodeModelFlowIdNodeIdComponentPut(modelFlowId, nodeId)

update a node&#x27;s components information in a model flow chart

update a node&#x27;s information in a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartNodeComponentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartNodeComponentApi apiInstance = new ModelFlowChartNodeComponentApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
String nodeId = "nodeId_example"; // String | node's id in a model flow chart
try {
    List<ModelFlowChartNodeComponentMeta> result = apiInstance.modelFlowNodeModelFlowIdNodeIdComponentPut(modelFlowId, nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartNodeComponentApi#modelFlowNodeModelFlowIdNodeIdComponentPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **nodeId** | **String**| node&#x27;s id in a model flow chart |

### Return type

[**List&lt;ModelFlowChartNodeComponentMeta&gt;**](ModelFlowChartNodeComponentMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

