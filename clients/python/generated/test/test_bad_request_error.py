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

import pyaemcloudmanagerapi
from pyaemcloudmanagerapi.models.bad_request_error import BadRequestError  # noqa: E501
from pyaemcloudmanagerapi.rest import ApiException

class TestBadRequestError(unittest.TestCase):
    """BadRequestError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test BadRequestError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = pyaemcloudmanagerapi.models.bad_request_error.BadRequestError()  # noqa: E501
        if include_optional :
            return BadRequestError(
                status = 56, 
                type = 'http://ns.adobe.com/adobecloud/error', 
                title = 'Validation failed', 
                missing_params = [
                    pyaemcloudmanagerapi.models.missing_parameter.MissingParameter(
                        name = 'paramName', 
                        type = 'string', )
                    ], 
                invalid_params = [
                    pyaemcloudmanagerapi.models.invalid_parameter.InvalidParameter(
                        name = 'paramName', 
                        reason = 'value must be a positive number', )
                    ]
            )
        else :
            return BadRequestError(
        )

    def testBadRequestError(self):
        """Test BadRequestError"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
