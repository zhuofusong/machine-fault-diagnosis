# ModelFlowChartApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelFlowModelFlowIdDelete**](ModelFlowChartApi.md#modelFlowModelFlowIdDelete) | **DELETE** /modelFlow/{modelFlowId} | delete a model flow chart
[**modelFlowModelFlowIdGet**](ModelFlowChartApi.md#modelFlowModelFlowIdGet) | **GET** /modelFlow/{modelFlowId} | retrieve a model flow chart
[**modelFlowModelFlowIdPost**](ModelFlowChartApi.md#modelFlowModelFlowIdPost) | **POST** /modelFlow/{modelFlowId} | create a model flow chart
[**modelFlowModelFlowIdPut**](ModelFlowChartApi.md#modelFlowModelFlowIdPut) | **PUT** /modelFlow/{modelFlowId} | update a model flow chart

<a name="modelFlowModelFlowIdDelete"></a>
# **modelFlowModelFlowIdDelete**
> Object modelFlowModelFlowIdDelete(modelFlowId)

delete a model flow chart

delete a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartApi apiInstance = new ModelFlowChartApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
try {
    Object result = apiInstance.modelFlowModelFlowIdDelete(modelFlowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartApi#modelFlowModelFlowIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowModelFlowIdGet"></a>
# **modelFlowModelFlowIdGet**
> List&lt;ModelFlowChartMeta&gt; modelFlowModelFlowIdGet(modelFlowId)

retrieve a model flow chart

retrieve a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartApi apiInstance = new ModelFlowChartApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
try {
    List<ModelFlowChartMeta> result = apiInstance.modelFlowModelFlowIdGet(modelFlowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartApi#modelFlowModelFlowIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |

### Return type

[**List&lt;ModelFlowChartMeta&gt;**](ModelFlowChartMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowModelFlowIdPost"></a>
# **modelFlowModelFlowIdPost**
> Object modelFlowModelFlowIdPost(modelFlowId, modelFlowChart)

create a model flow chart

create a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartApi apiInstance = new ModelFlowChartApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
ModelFlowChart modelFlowChart = new ModelFlowChart(); // ModelFlowChart | model flow chart
try {
    Object result = apiInstance.modelFlowModelFlowIdPost(modelFlowId, modelFlowChart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartApi#modelFlowModelFlowIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **modelFlowChart** | [**ModelFlowChart**](.md)| model flow chart |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowModelFlowIdPut"></a>
# **modelFlowModelFlowIdPut**
> Object modelFlowModelFlowIdPut(modelFlowId, modelFlowChart)

update a model flow chart

update a model flow chart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartApi apiInstance = new ModelFlowChartApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
ModelFlowChart modelFlowChart = new ModelFlowChart(); // ModelFlowChart | model flow chart
try {
    Object result = apiInstance.modelFlowModelFlowIdPut(modelFlowId, modelFlowChart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartApi#modelFlowModelFlowIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **modelFlowChart** | [**ModelFlowChart**](.md)| model flow chart |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

