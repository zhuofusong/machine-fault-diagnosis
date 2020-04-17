# ModelFlowChartExtensionApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelFlowModelFlowIdExtensionDelete**](ModelFlowChartExtensionApi.md#modelFlowModelFlowIdExtensionDelete) | **DELETE** /modelFlow/{modelFlowId}/extension | delete a model flow chart extension
[**modelFlowModelFlowIdExtensionGet**](ModelFlowChartExtensionApi.md#modelFlowModelFlowIdExtensionGet) | **GET** /modelFlow/{modelFlowId}/extension | retrieve a model flow chart extension
[**modelFlowModelFlowIdExtensionPost**](ModelFlowChartExtensionApi.md#modelFlowModelFlowIdExtensionPost) | **POST** /modelFlow/{modelFlowId}/extension | create a model flow chart extension
[**modelFlowModelFlowIdExtensionPut**](ModelFlowChartExtensionApi.md#modelFlowModelFlowIdExtensionPut) | **PUT** /modelFlow/{modelFlowId}/extension | update a model flow chart extension

<a name="modelFlowModelFlowIdExtensionDelete"></a>
# **modelFlowModelFlowIdExtensionDelete**
> Object modelFlowModelFlowIdExtensionDelete(modelFlowId)

delete a model flow chart extension

delete a model flow chart extension

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartExtensionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartExtensionApi apiInstance = new ModelFlowChartExtensionApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
try {
    Object result = apiInstance.modelFlowModelFlowIdExtensionDelete(modelFlowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartExtensionApi#modelFlowModelFlowIdExtensionDelete");
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

<a name="modelFlowModelFlowIdExtensionGet"></a>
# **modelFlowModelFlowIdExtensionGet**
> List&lt;ModelFlowChartExtensionMeta&gt; modelFlowModelFlowIdExtensionGet(modelFlowId)

retrieve a model flow chart extension

retrieve a model flow chart extension

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartExtensionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartExtensionApi apiInstance = new ModelFlowChartExtensionApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
try {
    List<ModelFlowChartExtensionMeta> result = apiInstance.modelFlowModelFlowIdExtensionGet(modelFlowId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartExtensionApi#modelFlowModelFlowIdExtensionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |

### Return type

[**List&lt;ModelFlowChartExtensionMeta&gt;**](ModelFlowChartExtensionMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowModelFlowIdExtensionPost"></a>
# **modelFlowModelFlowIdExtensionPost**
> Object modelFlowModelFlowIdExtensionPost(modelFlowId, modelFlowChartExtension)

create a model flow chart extension

create a model flow chart extension

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartExtensionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartExtensionApi apiInstance = new ModelFlowChartExtensionApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
ModelFlowChartExtensionMeta modelFlowChartExtension = new ModelFlowChartExtensionMeta(); // ModelFlowChartExtensionMeta | model flow chart extension
try {
    Object result = apiInstance.modelFlowModelFlowIdExtensionPost(modelFlowId, modelFlowChartExtension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartExtensionApi#modelFlowModelFlowIdExtensionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **modelFlowChartExtension** | [**ModelFlowChartExtensionMeta**](.md)| model flow chart extension |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowModelFlowIdExtensionPut"></a>
# **modelFlowModelFlowIdExtensionPut**
> Object modelFlowModelFlowIdExtensionPut(modelFlowId, modelFlowChartExtension)

update a model flow chart extension

update a model flow chart extension

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartExtensionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartExtensionApi apiInstance = new ModelFlowChartExtensionApi();
String modelFlowId = "modelFlowId_example"; // String | model flow chart id
ModelFlowChartExtensionMeta modelFlowChartExtension = new ModelFlowChartExtensionMeta(); // ModelFlowChartExtensionMeta | model flow chart extension
try {
    Object result = apiInstance.modelFlowModelFlowIdExtensionPut(modelFlowId, modelFlowChartExtension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartExtensionApi#modelFlowModelFlowIdExtensionPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **String**| model flow chart id |
 **modelFlowChartExtension** | [**ModelFlowChartExtensionMeta**](.md)| model flow chart extension |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

