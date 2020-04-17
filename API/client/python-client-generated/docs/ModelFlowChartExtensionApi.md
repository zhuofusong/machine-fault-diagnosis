# swagger_client.ModelFlowChartExtensionApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**model_flow_model_flow_id_extension_delete**](ModelFlowChartExtensionApi.md#model_flow_model_flow_id_extension_delete) | **DELETE** /modelFlow/{modelFlowId}/extension | delete a model flow chart extension
[**model_flow_model_flow_id_extension_get**](ModelFlowChartExtensionApi.md#model_flow_model_flow_id_extension_get) | **GET** /modelFlow/{modelFlowId}/extension | retrieve a model flow chart extension
[**model_flow_model_flow_id_extension_post**](ModelFlowChartExtensionApi.md#model_flow_model_flow_id_extension_post) | **POST** /modelFlow/{modelFlowId}/extension | create a model flow chart extension
[**model_flow_model_flow_id_extension_put**](ModelFlowChartExtensionApi.md#model_flow_model_flow_id_extension_put) | **PUT** /modelFlow/{modelFlowId}/extension | update a model flow chart extension

# **model_flow_model_flow_id_extension_delete**
> object model_flow_model_flow_id_extension_delete(model_flow_id)

delete a model flow chart extension

delete a model flow chart extension

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: application
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ModelFlowChartExtensionApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id

try:
    # delete a model flow chart extension
    api_response = api_instance.model_flow_model_flow_id_extension_delete(model_flow_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartExtensionApi->model_flow_model_flow_id_extension_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_model_flow_id_extension_get**
> list[ModelFlowChartExtensionMeta] model_flow_model_flow_id_extension_get(model_flow_id)

retrieve a model flow chart extension

retrieve a model flow chart extension

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: application
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ModelFlowChartExtensionApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id

try:
    # retrieve a model flow chart extension
    api_response = api_instance.model_flow_model_flow_id_extension_get(model_flow_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartExtensionApi->model_flow_model_flow_id_extension_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 

### Return type

[**list[ModelFlowChartExtensionMeta]**](ModelFlowChartExtensionMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_model_flow_id_extension_post**
> object model_flow_model_flow_id_extension_post(model_flow_id, model_flow_chart_extension)

create a model flow chart extension

create a model flow chart extension

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: application
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ModelFlowChartExtensionApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
model_flow_chart_extension = swagger_client.ModelFlowChartExtensionMeta() # ModelFlowChartExtensionMeta | model flow chart extension

try:
    # create a model flow chart extension
    api_response = api_instance.model_flow_model_flow_id_extension_post(model_flow_id, model_flow_chart_extension)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartExtensionApi->model_flow_model_flow_id_extension_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **model_flow_chart_extension** | [**ModelFlowChartExtensionMeta**](.md)| model flow chart extension | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_model_flow_id_extension_put**
> object model_flow_model_flow_id_extension_put(model_flow_id, model_flow_chart_extension)

update a model flow chart extension

update a model flow chart extension

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure OAuth2 access token for authorization: application
configuration = swagger_client.Configuration()
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# create an instance of the API class
api_instance = swagger_client.ModelFlowChartExtensionApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
model_flow_chart_extension = swagger_client.ModelFlowChartExtensionMeta() # ModelFlowChartExtensionMeta | model flow chart extension

try:
    # update a model flow chart extension
    api_response = api_instance.model_flow_model_flow_id_extension_put(model_flow_id, model_flow_chart_extension)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartExtensionApi->model_flow_model_flow_id_extension_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **model_flow_chart_extension** | [**ModelFlowChartExtensionMeta**](.md)| model flow chart extension | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

