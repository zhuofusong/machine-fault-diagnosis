# swagger_client.ModelFlowChartApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**model_flow_model_flow_id_delete**](ModelFlowChartApi.md#model_flow_model_flow_id_delete) | **DELETE** /modelFlow/{modelFlowId} | delete a model flow chart
[**model_flow_model_flow_id_get**](ModelFlowChartApi.md#model_flow_model_flow_id_get) | **GET** /modelFlow/{modelFlowId} | retrieve a model flow chart
[**model_flow_model_flow_id_post**](ModelFlowChartApi.md#model_flow_model_flow_id_post) | **POST** /modelFlow/{modelFlowId} | create a model flow chart
[**model_flow_model_flow_id_put**](ModelFlowChartApi.md#model_flow_model_flow_id_put) | **PUT** /modelFlow/{modelFlowId} | update a model flow chart

# **model_flow_model_flow_id_delete**
> object model_flow_model_flow_id_delete(model_flow_id)

delete a model flow chart

delete a model flow chart

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
api_instance = swagger_client.ModelFlowChartApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id

try:
    # delete a model flow chart
    api_response = api_instance.model_flow_model_flow_id_delete(model_flow_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartApi->model_flow_model_flow_id_delete: %s\n" % e)
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

# **model_flow_model_flow_id_get**
> list[ModelFlowChartMeta] model_flow_model_flow_id_get(model_flow_id)

retrieve a model flow chart

retrieve a model flow chart

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
api_instance = swagger_client.ModelFlowChartApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id

try:
    # retrieve a model flow chart
    api_response = api_instance.model_flow_model_flow_id_get(model_flow_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartApi->model_flow_model_flow_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 

### Return type

[**list[ModelFlowChartMeta]**](ModelFlowChartMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_model_flow_id_post**
> object model_flow_model_flow_id_post(model_flow_id, model_flow_chart)

create a model flow chart

create a model flow chart

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
api_instance = swagger_client.ModelFlowChartApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
model_flow_chart = swagger_client.ModelFlowChart() # ModelFlowChart | model flow chart

try:
    # create a model flow chart
    api_response = api_instance.model_flow_model_flow_id_post(model_flow_id, model_flow_chart)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartApi->model_flow_model_flow_id_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **model_flow_chart** | [**ModelFlowChart**](.md)| model flow chart | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_model_flow_id_put**
> object model_flow_model_flow_id_put(model_flow_id, model_flow_chart)

update a model flow chart

update a model flow chart

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
api_instance = swagger_client.ModelFlowChartApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
model_flow_chart = swagger_client.ModelFlowChart() # ModelFlowChart | model flow chart

try:
    # update a model flow chart
    api_response = api_instance.model_flow_model_flow_id_put(model_flow_id, model_flow_chart)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartApi->model_flow_model_flow_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **model_flow_chart** | [**ModelFlowChart**](.md)| model flow chart | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

