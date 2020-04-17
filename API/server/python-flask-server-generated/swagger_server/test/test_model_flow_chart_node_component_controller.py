# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.model_flow_chart_node_component_meta import ModelFlowChartNodeComponentMeta  # noqa: E501
from swagger_server.test import BaseTestCase


class TestModelFlowChartNodeComponentController(BaseTestCase):
    """ModelFlowChartNodeComponentController integration test stubs"""

    def test_model_flow_node_model_flow_id_node_id_component_delete(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_delete

        delete a node's components information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{nodeId}/component'.format(model_flow_id='model_flow_id_example', node_id='node_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_node_model_flow_id_node_id_component_get(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_get

        retrieve a node's components information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{nodeId}/component'.format(model_flow_id='model_flow_id_example', node_id='node_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_node_model_flow_id_node_id_component_post(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_post

        create a node's components information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{nodeId}/component'.format(model_flow_id='model_flow_id_example', node_id='node_id_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_node_model_flow_id_node_id_component_put(self):
        """Test case for model_flow_node_model_flow_id_node_id_component_put

        update a node's components information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{nodeId}/component'.format(model_flow_id='model_flow_id_example', node_id='node_id_example'),
            method='PUT')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
