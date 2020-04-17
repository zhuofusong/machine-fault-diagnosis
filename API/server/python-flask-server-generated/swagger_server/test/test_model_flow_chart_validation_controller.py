# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.test import BaseTestCase


class TestModelFlowChartValidationController(BaseTestCase):
    """ModelFlowChartValidationController integration test stubs"""

    def test_model_flow_validation_kind_id_post(self):
        """Test case for model_flow_validation_kind_id_post

        validation of all kinds of objects
        """
        response = self.client.open(
            '/zhuofusong/machine-fault-diagnosis/1.0.0/modelFlow/validation/{kind}/{id}'.format(kind='kind_example', id='id_example'),
            method='POST')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
