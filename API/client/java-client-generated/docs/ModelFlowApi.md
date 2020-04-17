# ModelFlowApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelFlowDelete**](ModelFlowApi.md#modelFlowDelete) | **DELETE** /modelFlow | delete a list of model flow charts
[**modelFlowGet**](ModelFlowApi.md#modelFlowGet) | **GET** /modelFlow | get a list of all model flow charts

<a name="modelFlowDelete"></a>
# **modelFlowDelete**
> Object modelFlowDelete(modelFlowSearchString)

delete a list of model flow charts

delete a list of model flow charts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowApi apiInstance = new ModelFlowApi();
String modelFlowSearchString = "modelFlowSearchString_example"; // String | the string for searching for model flow charts
try {
    Object result = apiInstance.modelFlowDelete(modelFlowSearchString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowApi#modelFlowDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowSearchString** | **String**| the string for searching for model flow charts | [optional]

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="modelFlowGet"></a>
# **modelFlowGet**
> List&lt;ModelFlowChartMeta&gt; modelFlowGet(modelFlowSearchString)

get a list of all model flow charts

Get a list of all model flow charts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowApi apiInstance = new ModelFlowApi();
String modelFlowSearchString = "modelFlowSearchString_example"; // String | the string for searching for model flow charts
try {
    List<ModelFlowChartMeta> result = apiInstance.modelFlowGet(modelFlowSearchString);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowApi#modelFlowGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowSearchString** | **String**| the string for searching for model flow charts | [optional]

### Return type

[**List&lt;ModelFlowChartMeta&gt;**](ModelFlowChartMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

