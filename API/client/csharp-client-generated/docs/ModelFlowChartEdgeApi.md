# IO.Swagger.Api.ModelFlowChartEdgeApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelFlowNodeModelFlowIdEdgeIdDelete**](ModelFlowChartEdgeApi.md#modelflownodemodelflowidedgeiddelete) | **DELETE** /modelFlow/node/{modelFlowId}/{edgeId} | delete an edge&#x27;s information in a model flow chart
[**ModelFlowNodeModelFlowIdEdgeIdGet**](ModelFlowChartEdgeApi.md#modelflownodemodelflowidedgeidget) | **GET** /modelFlow/node/{modelFlowId}/{edgeId} | retrieve an edge&#x27;s information in a model flow chart
[**ModelFlowNodeModelFlowIdEdgeIdPost**](ModelFlowChartEdgeApi.md#modelflownodemodelflowidedgeidpost) | **POST** /modelFlow/node/{modelFlowId}/{edgeId} | create an edge&#x27;s information in a model flow chart
[**ModelFlowNodeModelFlowIdEdgeIdPut**](ModelFlowChartEdgeApi.md#modelflownodemodelflowidedgeidput) | **PUT** /modelFlow/node/{modelFlowId}/{edgeId} | update an edge&#x27;s information in a model flow chart

<a name="modelflownodemodelflowidedgeiddelete"></a>
# **ModelFlowNodeModelFlowIdEdgeIdDelete**
> Object ModelFlowNodeModelFlowIdEdgeIdDelete (string modelFlowId, string edgeId)

delete an edge's information in a model flow chart

delete an edge's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdEdgeIdDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartEdgeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var edgeId = edgeId_example;  // string | edge's id in a model flow chart

            try
            {
                // delete an edge's information in a model flow chart
                Object result = apiInstance.ModelFlowNodeModelFlowIdEdgeIdDelete(modelFlowId, edgeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartEdgeApi.ModelFlowNodeModelFlowIdEdgeIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **edgeId** | **string**| edge&#x27;s id in a model flow chart | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidedgeidget"></a>
# **ModelFlowNodeModelFlowIdEdgeIdGet**
> List<ModelFlowChartEdgeMeta> ModelFlowNodeModelFlowIdEdgeIdGet (string modelFlowId, string edgeId)

retrieve an edge's information in a model flow chart

retrieve an edge's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdEdgeIdGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartEdgeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var edgeId = edgeId_example;  // string | edge's id in a model flow chart

            try
            {
                // retrieve an edge's information in a model flow chart
                List&lt;ModelFlowChartEdgeMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdEdgeIdGet(modelFlowId, edgeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartEdgeApi.ModelFlowNodeModelFlowIdEdgeIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **edgeId** | **string**| edge&#x27;s id in a model flow chart | 

### Return type

[**List<ModelFlowChartEdgeMeta>**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidedgeidpost"></a>
# **ModelFlowNodeModelFlowIdEdgeIdPost**
> List<ModelFlowChartEdgeMeta> ModelFlowNodeModelFlowIdEdgeIdPost (string modelFlowId, string edgeId)

create an edge's information in a model flow chart

create an edge's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdEdgeIdPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartEdgeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var edgeId = edgeId_example;  // string | edge's id in a model flow chart

            try
            {
                // create an edge's information in a model flow chart
                List&lt;ModelFlowChartEdgeMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdEdgeIdPost(modelFlowId, edgeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartEdgeApi.ModelFlowNodeModelFlowIdEdgeIdPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **edgeId** | **string**| edge&#x27;s id in a model flow chart | 

### Return type

[**List<ModelFlowChartEdgeMeta>**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidedgeidput"></a>
# **ModelFlowNodeModelFlowIdEdgeIdPut**
> List<ModelFlowChartEdgeMeta> ModelFlowNodeModelFlowIdEdgeIdPut (string modelFlowId, string edgeId)

update an edge's information in a model flow chart

update an edge's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdEdgeIdPutExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartEdgeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var edgeId = edgeId_example;  // string | edge's id in a model flow chart

            try
            {
                // update an edge's information in a model flow chart
                List&lt;ModelFlowChartEdgeMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdEdgeIdPut(modelFlowId, edgeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartEdgeApi.ModelFlowNodeModelFlowIdEdgeIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **edgeId** | **string**| edge&#x27;s id in a model flow chart | 

### Return type

[**List<ModelFlowChartEdgeMeta>**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
