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

import pyaem_cloudmanager_api_client
from pyaem_cloudmanager_api_client.api.variables_api import VariablesApi  # noqa: E501
from pyaem_cloudmanager_api_client.rest import ApiException


class TestVariablesApi(unittest.TestCase):
    """VariablesApi unit test stubs"""

    def setUp(self):
        self.api = pyaem_cloudmanager_api_client.api.variables_api.VariablesApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_environment_variables(self):
        """Test case for get_environment_variables

        List User Environment Variables  # noqa: E501
        """
        pass

    def test_patch_environment_variables(self):
        """Test case for patch_environment_variables

        Patch User Environment Variables  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
