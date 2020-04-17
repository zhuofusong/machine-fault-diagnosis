# IO.Swagger.Api.ModelFlowApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelFlowDelete**](ModelFlowApi.md#modelflowdelete) | **DELETE** /modelFlow | delete a list of model flow charts
[**ModelFlowGet**](ModelFlowApi.md#modelflowget) | **GET** /modelFlow | get a list of all model flow charts

<a name="modelflowdelete"></a>
# **ModelFlowDelete**
> Object ModelFlowDelete (string modelFlowSearchString = null)

delete a list of model flow charts

delete a list of model flow charts

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowApi();
            var modelFlowSearchString = modelFlowSearchString_example;  // string | the string for searching for model flow charts (optional) 

            try
            {
                // delete a list of model flow charts
                Object result = apiInstance.ModelFlowDelete(modelFlowSearchString);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowApi.ModelFlowDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowSearchString** | **string**| the string for searching for model flow charts | [optional] 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflowget"></a>
# **ModelFlowGet**
> List<ModelFlowChartMeta> ModelFlowGet (string modelFlowSearchString = null)

get a list of all model flow charts

Get a list of all model flow charts

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowApi();
            var modelFlowSearchString = modelFlowSearchString_example;  // string | the string for searching for model flow charts (optional) 

            try
            {
                // get a list of all model flow charts
                List&lt;ModelFlowChartMeta&gt; result = apiInstance.ModelFlowGet(modelFlowSearchString);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowApi.ModelFlowGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowSearchString** | **string**| the string for searching for model flow charts | [optional] 

### Return type

[**List<ModelFlowChartMeta>**](ModelFlowChartMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
