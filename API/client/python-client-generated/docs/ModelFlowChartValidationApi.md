# swagger_client.ModelFlowChartValidationApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**model_flow_validation_kind_id_post**](ModelFlowChartValidationApi.md#model_flow_validation_kind_id_post) | **POST** /modelFlow/validation/{kind}/{id} | validation of all kinds of objects

# **model_flow_validation_kind_id_post**
> object model_flow_validation_kind_id_post(kind, id)

validation of all kinds of objects

validation of all kinds of objects

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
api_instance = swagger_client.ModelFlowChartValidationApi(swagger_client.ApiClient(configuration))
kind = 'kind_example' # str | what kind of object to validate
id = 'id_example' # str | id of the object to be validated

try:
    # validation of all kinds of objects
    api_response = api_instance.model_flow_validation_kind_id_post(kind, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartValidationApi->model_flow_validation_kind_id_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **kind** | **str**| what kind of object to validate | 
 **id** | **str**| id of the object to be validated | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

