# swagger_client.ModelFlowApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**model_flow_delete**](ModelFlowApi.md#model_flow_delete) | **DELETE** /modelFlow | delete a list of model flow charts
[**model_flow_get**](ModelFlowApi.md#model_flow_get) | **GET** /modelFlow | get a list of all model flow charts

# **model_flow_delete**
> object model_flow_delete(model_flow_search_string=model_flow_search_string)

delete a list of model flow charts

delete a list of model flow charts

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
api_instance = swagger_client.ModelFlowApi(swagger_client.ApiClient(configuration))
model_flow_search_string = 'model_flow_search_string_example' # str | the string for searching for model flow charts (optional)

try:
    # delete a list of model flow charts
    api_response = api_instance.model_flow_delete(model_flow_search_string=model_flow_search_string)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowApi->model_flow_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_search_string** | **str**| the string for searching for model flow charts | [optional] 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_get**
> list[ModelFlowChartMeta] model_flow_get(model_flow_search_string=model_flow_search_string)

get a list of all model flow charts

Get a list of all model flow charts

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
api_instance = swagger_client.ModelFlowApi(swagger_client.ApiClient(configuration))
model_flow_search_string = 'model_flow_search_string_example' # str | the string for searching for model flow charts (optional)

try:
    # get a list of all model flow charts
    api_response = api_instance.model_flow_get(model_flow_search_string=model_flow_search_string)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowApi->model_flow_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_search_string** | **str**| the string for searching for model flow charts | [optional] 

### Return type

[**list[ModelFlowChartMeta]**](ModelFlowChartMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

