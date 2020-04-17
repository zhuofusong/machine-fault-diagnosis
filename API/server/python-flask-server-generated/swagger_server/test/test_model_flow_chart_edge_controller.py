# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.model_flow_chart_edge_meta import ModelFlowChartEdgeMeta  # noqa: E501
from swagger_server.test import BaseTestCase


class TestModelFlowChartEdgeController(BaseTestCase):
    """ModelFlowChartEdgeController integration test stubs"""

    def test_model_flow_node_model_flow_id_edge_id_delete(self):
        """Test case for model_flow_node_model_flow_id_edge_id_delete

        delete an edge's information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{edgeId}'.format(model_flow_id='model_flow_id_example', edge_id='edge_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_node_model_flow_id_edge_id_get(self):
        """Test case for model_flow_node_model_flow_id_edge_id_get

        retrieve an edge's information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{edgeId}'.format(model_flow_id='model_flow_id_example', edge_id='edge_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_node_model_flow_id_edge_id_post(self):
        """Test case for model_flow_node_model_flow_id_edge_id_post

        create an edge's information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{edgeId}'.format(model_flow_id='model_flow_id_example', edge_id='edge_id_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_node_model_flow_id_edge_id_put(self):
        """Test case for model_flow_node_model_flow_id_edge_id_put

        update an edge's information in a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/node/{modelFlowId}/{edgeId}'.format(model_flow_id='model_flow_id_example', edge_id='edge_id_example'),
            method='PUT')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
