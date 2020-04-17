# ModelFlowChartValidationApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modelFlowValidationKindIdPost**](ModelFlowChartValidationApi.md#modelFlowValidationKindIdPost) | **POST** /modelFlow/validation/{kind}/{id} | validation of all kinds of objects

<a name="modelFlowValidationKindIdPost"></a>
# **modelFlowValidationKindIdPost**
> Object modelFlowValidationKindIdPost(kind, id)

validation of all kinds of objects

validation of all kinds of objects

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ModelFlowChartValidationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: application
OAuth application = (OAuth) defaultClient.getAuthentication("application");
application.setAccessToken("YOUR ACCESS TOKEN");

ModelFlowChartValidationApi apiInstance = new ModelFlowChartValidationApi();
String kind = "kind_example"; // String | what kind of object to validate
String id = "id_example"; // String | id of the object to be validated
try {
    Object result = apiInstance.modelFlowValidationKindIdPost(kind, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelFlowChartValidationApi#modelFlowValidationKindIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **String**| what kind of object to validate |
 **id** | **String**| id of the object to be validated |

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

