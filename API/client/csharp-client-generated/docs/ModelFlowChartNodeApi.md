# IO.Swagger.Api.ModelFlowChartNodeApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelFlowNodeModelFlowIdNodeIdDelete**](ModelFlowChartNodeApi.md#modelflownodemodelflowidnodeiddelete) | **DELETE** /modelFlow/node/{modelFlowId}/{nodeId} | delete a node&#x27;s information in a model flow chart
[**ModelFlowNodeModelFlowIdNodeIdGet**](ModelFlowChartNodeApi.md#modelflownodemodelflowidnodeidget) | **GET** /modelFlow/node/{modelFlowId}/{nodeId} | retrieve a node&#x27;s information in a model flow chart
[**ModelFlowNodeModelFlowIdNodeIdPost**](ModelFlowChartNodeApi.md#modelflownodemodelflowidnodeidpost) | **POST** /modelFlow/node/{modelFlowId}/{nodeId} | create a node&#x27;s information in a model flow chart
[**ModelFlowNodeModelFlowIdNodeIdPut**](ModelFlowChartNodeApi.md#modelflownodemodelflowidnodeidput) | **PUT** /modelFlow/node/{modelFlowId}/{nodeId} | update a node&#x27;s information in a model flow chart

<a name="modelflownodemodelflowidnodeiddelete"></a>
# **ModelFlowNodeModelFlowIdNodeIdDelete**
> Object ModelFlowNodeModelFlowIdNodeIdDelete (string modelFlowId, string nodeId)

delete a node's information in a model flow chart

delete a node's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdNodeIdDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // delete a node's information in a model flow chart
                Object result = apiInstance.ModelFlowNodeModelFlowIdNodeIdDelete(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeApi.ModelFlowNodeModelFlowIdNodeIdDelete: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **nodeId** | **string**| node&#x27;s id in a model flow chart | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidnodeidget"></a>
# **ModelFlowNodeModelFlowIdNodeIdGet**
> List<ModelFlowChartNodeMeta> ModelFlowNodeModelFlowIdNodeIdGet (string modelFlowId, string nodeId)

retrieve a node's information in a model flow chart

retrieve a node's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdNodeIdGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // retrieve a node's information in a model flow chart
                List&lt;ModelFlowChartNodeMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdNodeIdGet(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeApi.ModelFlowNodeModelFlowIdNodeIdGet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **nodeId** | **string**| node&#x27;s id in a model flow chart | 

### Return type

[**List<ModelFlowChartNodeMeta>**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidnodeidpost"></a>
# **ModelFlowNodeModelFlowIdNodeIdPost**
> List<ModelFlowChartNodeMeta> ModelFlowNodeModelFlowIdNodeIdPost (string modelFlowId, string nodeId)

create a node's information in a model flow chart

create a node's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdNodeIdPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // create a node's information in a model flow chart
                List&lt;ModelFlowChartNodeMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdNodeIdPost(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeApi.ModelFlowNodeModelFlowIdNodeIdPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **nodeId** | **string**| node&#x27;s id in a model flow chart | 

### Return type

[**List<ModelFlowChartNodeMeta>**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidnodeidput"></a>
# **ModelFlowNodeModelFlowIdNodeIdPut**
> List<ModelFlowChartNodeMeta> ModelFlowNodeModelFlowIdNodeIdPut (string modelFlowId, string nodeId)

update a node's information in a model flow chart

update a node's information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdNodeIdPutExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // update a node's information in a model flow chart
                List&lt;ModelFlowChartNodeMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdNodeIdPut(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeApi.ModelFlowNodeModelFlowIdNodeIdPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **nodeId** | **string**| node&#x27;s id in a model flow chart | 

### Return type

[**List<ModelFlowChartNodeMeta>**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
