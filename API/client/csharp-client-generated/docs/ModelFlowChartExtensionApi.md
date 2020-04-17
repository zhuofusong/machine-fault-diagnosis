# IO.Swagger.Api.ModelFlowChartExtensionApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ModelFlowModelFlowIdExtensionDelete**](ModelFlowChartExtensionApi.md#modelflowmodelflowidextensiondelete) | **DELETE** /modelFlow/{modelFlowId}/extension | delete a model flow chart extension
[**ModelFlowModelFlowIdExtensionGet**](ModelFlowChartExtensionApi.md#modelflowmodelflowidextensionget) | **GET** /modelFlow/{modelFlowId}/extension | retrieve a model flow chart extension
[**ModelFlowModelFlowIdExtensionPost**](ModelFlowChartExtensionApi.md#modelflowmodelflowidextensionpost) | **POST** /modelFlow/{modelFlowId}/extension | create a model flow chart extension
[**ModelFlowModelFlowIdExtensionPut**](ModelFlowChartExtensionApi.md#modelflowmodelflowidextensionput) | **PUT** /modelFlow/{modelFlowId}/extension | update a model flow chart extension

<a name="modelflowmodelflowidextensiondelete"></a>
# **ModelFlowModelFlowIdExtensionDelete**
> Object ModelFlowModelFlowIdExtensionDelete (string modelFlowId)

delete a model flow chart extension

delete a model flow chart extension

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdExtensionDeleteExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartExtensionApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id

            try
            {
                // delete a model flow chart extension
                Object result = apiInstance.ModelFlowModelFlowIdExtensionDelete(modelFlowId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartExtensionApi.ModelFlowModelFlowIdExtensionDelete: " + e.Message );
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
<a name="modelflowmodelflowidextensionget"></a>
# **ModelFlowModelFlowIdExtensionGet**
> List<ModelFlowChartExtensionMeta> ModelFlowModelFlowIdExtensionGet (string modelFlowId)

retrieve a model flow chart extension

retrieve a model flow chart extension

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdExtensionGetExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartExtensionApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id

            try
            {
                // retrieve a model flow chart extension
                List&lt;ModelFlowChartExtensionMeta&gt; result = apiInstance.ModelFlowModelFlowIdExtensionGet(modelFlowId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartExtensionApi.ModelFlowModelFlowIdExtensionGet: " + e.Message );
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

[**List<ModelFlowChartExtensionMeta>**](ModelFlowChartExtensionMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflowmodelflowidextensionpost"></a>
# **ModelFlowModelFlowIdExtensionPost**
> Object ModelFlowModelFlowIdExtensionPost (string modelFlowId, ModelFlowChartExtensionMeta modelFlowChartExtension)

create a model flow chart extension

create a model flow chart extension

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdExtensionPostExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartExtensionApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var modelFlowChartExtension = new ModelFlowChartExtensionMeta(); // ModelFlowChartExtensionMeta | model flow chart extension

            try
            {
                // create a model flow chart extension
                Object result = apiInstance.ModelFlowModelFlowIdExtensionPost(modelFlowId, modelFlowChartExtension);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartExtensionApi.ModelFlowModelFlowIdExtensionPost: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **modelFlowChartExtension** | [**ModelFlowChartExtensionMeta**](ModelFlowChartExtensionMeta.md)| model flow chart extension | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="modelflowmodelflowidextensionput"></a>
# **ModelFlowModelFlowIdExtensionPut**
> Object ModelFlowModelFlowIdExtensionPut (string modelFlowId, ModelFlowChartExtensionMeta modelFlowChartExtension)

update a model flow chart extension

update a model flow chart extension

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class ModelFlowModelFlowIdExtensionPutExample
    {
        public void main()
        {
            // Configure OAuth2 access token for authorization: application
            Configuration.Default.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new ModelFlowChartExtensionApi();
            var modelFlowId = modelFlowId_example;  // string | model flow chart id
            var modelFlowChartExtension = new ModelFlowChartExtensionMeta(); // ModelFlowChartExtensionMeta | model flow chart extension

            try
            {
                // update a model flow chart extension
                Object result = apiInstance.ModelFlowModelFlowIdExtensionPut(modelFlowId, modelFlowChartExtension);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ModelFlowChartExtensionApi.ModelFlowModelFlowIdExtensionPut: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelFlowId** | **string**| model flow chart id | 
 **modelFlowChartExtension** | [**ModelFlowChartExtensionMeta**](ModelFlowChartExtensionMeta.md)| model flow chart extension | 

### Return type

**Object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
