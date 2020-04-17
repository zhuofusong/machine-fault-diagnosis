# coding: utf-8

"""
    Machine fault diagnosis

    List of top level server APIs  # noqa: E501

    OpenAPI spec version: 1.0.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from __future__ import absolute_import

import unittest

import swagger_client
from api.model_flow_chart_node_component_api import ModelFlowChartNodeComponentApi  # noqa: E501
from swagger_client.rest import ApiException


class TestModelFlowChartNodeComponentApi(unittest.TestCase):
    """ModelFlowChartNodeComponentApi unit test stubs"""

    def setUp(self):
        self.api = api.model_flow_chart_node_component_api.ModelFlowChartNodeComponentApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_model_flow_node_model_flow_id_node_id_component_delete(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_delete

        delete a node's components information in a model flow chart  # noqa: E501
        """
        pass

    def test_model_flow_node_model_flow_id_node_id_component_get(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_get

        retrieve a node's components information in a model flow chart  # noqa: E501
        """
        pass

    def test_model_flow_node_model_flow_id_node_id_component_post(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_post

        create a node's components information in a model flow chart  # noqa: E501
        """
        pass

    def test_model_flow_node_model_flow_id_node_id_component_put(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_put

        update a node's components information in a model flow chart  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
