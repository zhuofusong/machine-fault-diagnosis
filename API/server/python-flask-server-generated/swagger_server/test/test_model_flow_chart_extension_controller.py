# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.model_flow_chart_extension_meta import ModelFlowChartExtensionMeta  # noqa: E501
from swagger_server.test import BaseTestCase


class TestModelFlowChartExtensionController(BaseTestCase):
    """ModelFlowChartExtensionController integration test stubs"""

    def test_model_flow_model_flow_id_extension_delete(self):
        """Test case for model_flow_model_flow_id_extension_delete

        delete a model flow chart extension
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}/extension'.format(model_flow_id='model_flow_id_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_model_flow_id_extension_get(self):
        """Test case for model_flow_model_flow_id_extension_get

        retrieve a model flow chart extension
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}/extension'.format(model_flow_id='model_flow_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_model_flow_id_extension_post(self):
        """Test case for model_flow_model_flow_id_extension_post

        create a model flow chart extension
        """
        query_string = [('model_flow_chart_extension', ModelFlowChartExtensionMeta())]
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}/extension'.format(model_flow_id='model_flow_id_example'),
            method='POST',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_model_flow_id_extension_put(self):
        """Test case for model_flow_model_flow_id_extension_put

        update a model flow chart extension
        """
        query_string = [('model_flow_chart_extension', ModelFlowChartExtensionMeta())]
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/{modelFlowId}/extension'.format(model_flow_id='model_flow_id_example'),
            method='PUT',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
