# swagger_client.ModelFlowChartNodeApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**model_flow_node_model_flow_id_node_id_delete**](ModelFlowChartNodeApi.md#model_flow_node_model_flow_id_node_id_delete) | **DELETE** /modelFlow/node/{modelFlowId}/{nodeId} | delete a node&#x27;s information in a model flow chart
[**model_flow_node_model_flow_id_node_id_get**](ModelFlowChartNodeApi.md#model_flow_node_model_flow_id_node_id_get) | **GET** /modelFlow/node/{modelFlowId}/{nodeId} | retrieve a node&#x27;s information in a model flow chart
[**model_flow_node_model_flow_id_node_id_post**](ModelFlowChartNodeApi.md#model_flow_node_model_flow_id_node_id_post) | **POST** /modelFlow/node/{modelFlowId}/{nodeId} | create a node&#x27;s information in a model flow chart
[**model_flow_node_model_flow_id_node_id_put**](ModelFlowChartNodeApi.md#model_flow_node_model_flow_id_node_id_put) | **PUT** /modelFlow/node/{modelFlowId}/{nodeId} | update a node&#x27;s information in a model flow chart

# **model_flow_node_model_flow_id_node_id_delete**
> object model_flow_node_model_flow_id_node_id_delete(model_flow_id, node_id)

delete a node's information in a model flow chart

delete a node's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartNodeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
node_id = 'node_id_example' # str | node's id in a model flow chart

try:
    # delete a node's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_node_id_delete(model_flow_id, node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartNodeApi->model_flow_node_model_flow_id_node_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **node_id** | **str**| node&#x27;s id in a model flow chart | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_node_model_flow_id_node_id_get**
> list[ModelFlowChartNodeMeta] model_flow_node_model_flow_id_node_id_get(model_flow_id, node_id)

retrieve a node's information in a model flow chart

retrieve a node's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartNodeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
node_id = 'node_id_example' # str | node's id in a model flow chart

try:
    # retrieve a node's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_node_id_get(model_flow_id, node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartNodeApi->model_flow_node_model_flow_id_node_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **node_id** | **str**| node&#x27;s id in a model flow chart | 

### Return type

[**list[ModelFlowChartNodeMeta]**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_node_model_flow_id_node_id_post**
> list[ModelFlowChartNodeMeta] model_flow_node_model_flow_id_node_id_post(model_flow_id, node_id)

create a node's information in a model flow chart

create a node's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartNodeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
node_id = 'node_id_example' # str | node's id in a model flow chart

try:
    # create a node's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_node_id_post(model_flow_id, node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartNodeApi->model_flow_node_model_flow_id_node_id_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **node_id** | **str**| node&#x27;s id in a model flow chart | 

### Return type

[**list[ModelFlowChartNodeMeta]**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_node_model_flow_id_node_id_put**
> list[ModelFlowChartNodeMeta] model_flow_node_model_flow_id_node_id_put(model_flow_id, node_id)

update a node's information in a model flow chart

update a node's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartNodeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
node_id = 'node_id_example' # str | node's id in a model flow chart

try:
    # update a node's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_node_id_put(model_flow_id, node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartNodeApi->model_flow_node_model_flow_id_node_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **node_id** | **str**| node&#x27;s id in a model flow chart | 

### Return type

[**list[ModelFlowChartNodeMeta]**](ModelFlowChartNodeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

