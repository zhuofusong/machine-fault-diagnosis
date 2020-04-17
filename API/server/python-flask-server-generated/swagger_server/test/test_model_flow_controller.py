# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.model_flow_chart_meta import ModelFlowChartMeta  # noqa: E501
from swagger_server.test import BaseTestCase


class TestModelFlowController(BaseTestCase):
    """ModelFlowController integration test stubs"""

    def test_model_flow_delete(self):
        """Test case for model_flow_delete

        delete a list of model flow charts
        """
        query_string = [('model_flow_search_string', 'model_flow_search_string_example')]
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow',
            method='DELETE',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_model_flow_get(self):
        """Test case for model_flow_get

        get a list of all model flow charts
        """
        query_string = [('model_flow_search_string', 'model_flow_search_string_example')]
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
