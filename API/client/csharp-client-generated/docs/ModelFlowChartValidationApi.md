# IO.Swagger.Api.ModelFlowChartValidationApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelFlowValidationKindIdPost**](ModelFlowChartValidationApi.md#modelflowvalidationkindidpost) | **POST** /modelFlow/validation/{kind}/{id} | validation of all kinds of objects

<a name="modelflowvalidationkindidpost"></a>
# **ModelFlowValidationKindIdPost**
> Object ModelFlowValidationKindIdPost (string kind, string id)

validation of all kinds of objects

validation of all kinds of objects

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowValidationKindIdPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartValidationApi();
            var kind = kind_example;  // string | what kind of object to validate
            var id = id_example;  // string | id of the object to be validated

            try
            {
                // validation of all kinds of objects
                Object result = apiInstance.ModelFlowValidationKindIdPost(kind, id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartValidationApi.ModelFlowValidationKindIdPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **string**| what kind of object to validate | 
 **id** | **string**| id of the object to be validated | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
