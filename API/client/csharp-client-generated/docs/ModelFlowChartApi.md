# IO.Swagger.Api.ModelFlowChartApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelFlowModelFlowIdDelete**](ModelFlowChartApi.md#modelflowmodelflowiddelete) | **DELETE** /modelFlow/{modelFlowId} | delete a model flow chart
[**ModelFlowModelFlowIdGet**](ModelFlowChartApi.md#modelflowmodelflowidget) | **GET** /modelFlow/{modelFlowId} | retrieve a model flow chart
[**ModelFlowModelFlowIdPost**](ModelFlowChartApi.md#modelflowmodelflowidpost) | **POST** /modelFlow/{modelFlowId} | create a model flow chart
[**ModelFlowModelFlowIdPut**](ModelFlowChartApi.md#modelflowmodelflowidput) | **PUT** /modelFlow/{modelFlowId} | update a model flow chart

<a name="modelflowmodelflowiddelete"></a>
# **ModelFlowModelFlowIdDelete**
> Object ModelFlowModelFlowIdDelete (string modelFlowId)

delete a model flow chart

delete a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id

            try
            {
                // delete a model flow chart
                Object result = apiInstance.ModelFlowModelFlowIdDelete(modelFlowId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartApi.ModelFlowModelFlowIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflowmodelflowidget"></a>
# **ModelFlowModelFlowIdGet**
> List<ModelFlowChartMeta> ModelFlowModelFlowIdGet (string modelFlowId)

retrieve a model flow chart

retrieve a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id

            try
            {
                // retrieve a model flow chart
                List&lt;ModelFlowChartMeta&gt; result = apiInstance.ModelFlowModelFlowIdGet(modelFlowId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartApi.ModelFlowModelFlowIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 

### Return type

[**List<ModelFlowChartMeta>**](ModelFlowChartMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflowmodelflowidpost"></a>
# **ModelFlowModelFlowIdPost**
> Object ModelFlowModelFlowIdPost (string modelFlowId, ModelFlowChart modelFlowChart)

create a model flow chart

create a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var modelFlowChart = new ModelFlowChart(); // ModelFlowChart | model flow chart

            try
            {
                // create a model flow chart
                Object result = apiInstance.ModelFlowModelFlowIdPost(modelFlowId, modelFlowChart);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartApi.ModelFlowModelFlowIdPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **modelFlowChart** | [**ModelFlowChart**](ModelFlowChart.md)| model flow chart | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflowmodelflowidput"></a>
# **ModelFlowModelFlowIdPut**
> Object ModelFlowModelFlowIdPut (string modelFlowId, ModelFlowChart modelFlowChart)

update a model flow chart

update a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdPutExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var modelFlowChart = new ModelFlowChart(); // ModelFlowChart | model flow chart

            try
            {
                // update a model flow chart
                Object result = apiInstance.ModelFlowModelFlowIdPut(modelFlowId, modelFlowChart);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartApi.ModelFlowModelFlowIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **modelFlowChart** | [**ModelFlowChart**](ModelFlowChart.md)| model flow chart | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
