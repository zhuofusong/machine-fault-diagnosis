# IO.Swagger.Api.ModelFlowChartNodeComponentApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelFlowNodeModelFlowIdNodeIdComponentDelete**](ModelFlowChartNodeComponentApi.md#modelflownodemodelflowidnodeidcomponentdelete) | **DELETE** /modelFlow/node/{modelFlowId}/{nodeId}/component | delete a node&#x27;s components information in a model flow chart
[**ModelFlowNodeModelFlowIdNodeIdComponentGet**](ModelFlowChartNodeComponentApi.md#modelflownodemodelflowidnodeidcomponentget) | **GET** /modelFlow/node/{modelFlowId}/{nodeId}/component | retrieve a node&#x27;s components information in a model flow chart
[**ModelFlowNodeModelFlowIdNodeIdComponentPost**](ModelFlowChartNodeComponentApi.md#modelflownodemodelflowidnodeidcomponentpost) | **POST** /modelFlow/node/{modelFlowId}/{nodeId}/component | create a node&#x27;s components information in a model flow chart
[**ModelFlowNodeModelFlowIdNodeIdComponentPut**](ModelFlowChartNodeComponentApi.md#modelflownodemodelflowidnodeidcomponentput) | **PUT** /modelFlow/node/{modelFlowId}/{nodeId}/component | update a node&#x27;s components information in a model flow chart

<a name="modelflownodemodelflowidnodeidcomponentdelete"></a>
# **ModelFlowNodeModelFlowIdNodeIdComponentDelete**
> Object ModelFlowNodeModelFlowIdNodeIdComponentDelete (string modelFlowId, string nodeId)

delete a node's components information in a model flow chart

delete a node's components information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdNodeIdComponentDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeComponentApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // delete a node's components information in a model flow chart
                Object result = apiInstance.ModelFlowNodeModelFlowIdNodeIdComponentDelete(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeComponentApi.ModelFlowNodeModelFlowIdNodeIdComponentDelete: " + e.Message );
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
<a name="modelflownodemodelflowidnodeidcomponentget"></a>
# **ModelFlowNodeModelFlowIdNodeIdComponentGet**
> List<ModelFlowChartNodeComponentMeta> ModelFlowNodeModelFlowIdNodeIdComponentGet (string modelFlowId, string nodeId)

retrieve a node's components information in a model flow chart

retrieve a node's components information in a model flow chart

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowNodeModelFlowIdNodeIdComponentGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeComponentApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // retrieve a node's components information in a model flow chart
                List&lt;ModelFlowChartNodeComponentMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdNodeIdComponentGet(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeComponentApi.ModelFlowNodeModelFlowIdNodeIdComponentGet: " + e.Message );
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

[**List<ModelFlowChartNodeComponentMeta>**](ModelFlowChartNodeComponentMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidnodeidcomponentpost"></a>
# **ModelFlowNodeModelFlowIdNodeIdComponentPost**
> List<ModelFlowChartNodeComponentMeta> ModelFlowNodeModelFlowIdNodeIdComponentPost (string modelFlowId, string nodeId)

create a node's components information in a model flow chart

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
    public class ModelFlowNodeModelFlowIdNodeIdComponentPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeComponentApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // create a node's components information in a model flow chart
                List&lt;ModelFlowChartNodeComponentMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdNodeIdComponentPost(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeComponentApi.ModelFlowNodeModelFlowIdNodeIdComponentPost: " + e.Message );
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

[**List<ModelFlowChartNodeComponentMeta>**](ModelFlowChartNodeComponentMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflownodemodelflowidnodeidcomponentput"></a>
# **ModelFlowNodeModelFlowIdNodeIdComponentPut**
> List<ModelFlowChartNodeComponentMeta> ModelFlowNodeModelFlowIdNodeIdComponentPut (string modelFlowId, string nodeId)

update a node's components information in a model flow chart

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
    public class ModelFlowNodeModelFlowIdNodeIdComponentPutExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartNodeComponentApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var nodeId = nodeId_example;  // string | node's id in a model flow chart

            try
            {
                // update a node's components information in a model flow chart
                List&lt;ModelFlowChartNodeComponentMeta&gt; result = apiInstance.ModelFlowNodeModelFlowIdNodeIdComponentPut(modelFlowId, nodeId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartNodeComponentApi.ModelFlowNodeModelFlowIdNodeIdComponentPut: " + e.Message );
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

[**List<ModelFlowChartNodeComponentMeta>**](ModelFlowChartNodeComponentMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
