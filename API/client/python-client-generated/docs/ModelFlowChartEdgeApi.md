# swagger_client.ModelFlowChartEdgeApi

All URIs are relative to *https://virtserver.swaggerhub.com/zhuofusong/machine-fault-diagnosis/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**model_flow_node_model_flow_id_edge_id_delete**](ModelFlowChartEdgeApi.md#model_flow_node_model_flow_id_edge_id_delete) | **DELETE** /modelFlow/node/{modelFlowId}/{edgeId} | delete an edge&#x27;s information in a model flow chart
[**model_flow_node_model_flow_id_edge_id_get**](ModelFlowChartEdgeApi.md#model_flow_node_model_flow_id_edge_id_get) | **GET** /modelFlow/node/{modelFlowId}/{edgeId} | retrieve an edge&#x27;s information in a model flow chart
[**model_flow_node_model_flow_id_edge_id_post**](ModelFlowChartEdgeApi.md#model_flow_node_model_flow_id_edge_id_post) | **POST** /modelFlow/node/{modelFlowId}/{edgeId} | create an edge&#x27;s information in a model flow chart
[**model_flow_node_model_flow_id_edge_id_put**](ModelFlowChartEdgeApi.md#model_flow_node_model_flow_id_edge_id_put) | **PUT** /modelFlow/node/{modelFlowId}/{edgeId} | update an edge&#x27;s information in a model flow chart

# **model_flow_node_model_flow_id_edge_id_delete**
> object model_flow_node_model_flow_id_edge_id_delete(model_flow_id, edge_id)

delete an edge's information in a model flow chart

delete an edge's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartEdgeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
edge_id = 'edge_id_example' # str | edge's id in a model flow chart

try:
    # delete an edge's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_edge_id_delete(model_flow_id, edge_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartEdgeApi->model_flow_node_model_flow_id_edge_id_delete: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **edge_id** | **str**| edge&#x27;s id in a model flow chart | 

### Return type

**object**

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_node_model_flow_id_edge_id_get**
> list[ModelFlowChartEdgeMeta] model_flow_node_model_flow_id_edge_id_get(model_flow_id, edge_id)

retrieve an edge's information in a model flow chart

retrieve an edge's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartEdgeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
edge_id = 'edge_id_example' # str | edge's id in a model flow chart

try:
    # retrieve an edge's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_edge_id_get(model_flow_id, edge_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartEdgeApi->model_flow_node_model_flow_id_edge_id_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **edge_id** | **str**| edge&#x27;s id in a model flow chart | 

### Return type

[**list[ModelFlowChartEdgeMeta]**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_node_model_flow_id_edge_id_post**
> list[ModelFlowChartEdgeMeta] model_flow_node_model_flow_id_edge_id_post(model_flow_id, edge_id)

create an edge's information in a model flow chart

create an edge's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartEdgeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
edge_id = 'edge_id_example' # str | edge's id in a model flow chart

try:
    # create an edge's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_edge_id_post(model_flow_id, edge_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartEdgeApi->model_flow_node_model_flow_id_edge_id_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **edge_id** | **str**| edge&#x27;s id in a model flow chart | 

### Return type

[**list[ModelFlowChartEdgeMeta]**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **model_flow_node_model_flow_id_edge_id_put**
> list[ModelFlowChartEdgeMeta] model_flow_node_model_flow_id_edge_id_put(model_flow_id, edge_id)

update an edge's information in a model flow chart

update an edge's information in a model flow chart

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
api_instance = swagger_client.ModelFlowChartEdgeApi(swagger_client.ApiClient(configuration))
model_flow_id = 'model_flow_id_example' # str | model flow chart id
edge_id = 'edge_id_example' # str | edge's id in a model flow chart

try:
    # update an edge's information in a model flow chart
    api_response = api_instance.model_flow_node_model_flow_id_edge_id_put(model_flow_id, edge_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ModelFlowChartEdgeApi->model_flow_node_model_flow_id_edge_id_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model_flow_id** | **str**| model flow chart id | 
 **edge_id** | **str**| edge&#x27;s id in a model flow chart | 

### Return type

[**list[ModelFlowChartEdgeMeta]**](ModelFlowChartEdgeMeta.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

