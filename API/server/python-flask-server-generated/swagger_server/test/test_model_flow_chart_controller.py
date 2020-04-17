# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.model_flow_chart import ModelFlowChart  # noqa: E501
from swagger_server.models.model_flow_chart_meta import ModelFlowChartMeta  # noqa: E501
from swagger_server.test import BaseTestCase


class TestModelFlowChartController(BaseTestCase):
    """ModelFlowChartController integration test stubs"""

    def test_model_flow_model_flow_id_delete(self):
        """Test case for model_flow_model_flow_id_delete

        delete a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}'.format(model_flow_id='model_flow_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_model_flow_id_get(self):
        """Test case for model_flow_model_flow_id_get

        retrieve a model flow chart
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}'.format(model_flow_id='model_flow_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_model_flow_id_post(self):
        """Test case for model_flow_model_flow_id_post

        create a model flow chart
        """
        query_string = [('model_flow_chart', ModelFlowChart())]
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}'.format(model_flow_id='model_flow_id_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_model_flow_id_put(self):
        """Test case for model_flow_model_flow_id_put

        update a model flow chart
        """
        query_string = [('model_flow_chart', ModelFlowChart())]
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}'.format(model_flow_id='model_flow_id_example'),
            method='PUT',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
