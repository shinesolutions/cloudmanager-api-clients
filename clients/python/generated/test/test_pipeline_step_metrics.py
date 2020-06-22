# coding: utf-8

"""
    Cloud Manager API

    This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.models.pipeline_step_metrics import PipelineStepMetrics  # noqa: E501
from pyaem_cloudmanager_api_client.rest import ApiException

class TestPipelineStepMetrics(unittest.TestCase):
    """PipelineStepMetrics unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test PipelineStepMetrics
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = pyaem_cloudmanager_api_client.models.pipeline_step_metrics.PipelineStepMetrics()  # noqa: E501
        if include_optional :
            return PipelineStepMetrics(
                metrics = [
                    pyaem_cloudmanager_api_client.models.metric.Metric(
                        id = '0', 
                        severity = 'critical', 
                        passed = True, 
                        override = True, 
                        actual_value = '0', 
                        expected_value = '0', 
                        comparator = 'GT', 
                        kpi = '0', )
                    ]
            )
        else :
            return PipelineStepMetrics(
        )

    def testPipelineStepMetrics(self):
        """Test PipelineStepMetrics"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
