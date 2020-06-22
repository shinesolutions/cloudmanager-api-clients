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
from pyaemcloudmanagerapi.models.program_list import ProgramList  # noqa: E501
from pyaemcloudmanagerapi.rest import ApiException

class TestProgramList(unittest.TestCase):
    """ProgramList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ProgramList
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = pyaemcloudmanagerapi.models.program_list.ProgramList()  # noqa: E501
        if include_optional :
            return ProgramList(
                total_number_of_items = 56, 
                embedded = pyaemcloudmanagerapi.models.program_list__embedded.programList__embedded(
                    programs = [
                        pyaemcloudmanagerapi.models.embedded_program.embeddedProgram(
                            id = '14', 
                            name = 'AcmeCorp Main Site', 
                            enabled = True, 
                            tenant_id = 'acmeCorp', )
                        ], ), 
                links = pyaemcloudmanagerapi.models.program_list__links.programList__links(
                    next = pyaemcloudmanagerapi.models.hal_link.HalLink(
                        href = '0', 
                        templated = True, 
                        type = '0', 
                        deprecation = '0', 
                        profile = '0', 
                        title = '0', 
                        hreflang = '0', 
                        name = '0', ), 
                    prev = pyaemcloudmanagerapi.models.hal_link.HalLink(
                        href = '0', 
                        templated = True, 
                        type = '0', 
                        deprecation = '0', 
                        profile = '0', 
                        title = '0', 
                        hreflang = '0', 
                        name = '0', ), 
                    self = pyaemcloudmanagerapi.models.hal_link.HalLink(
                        href = '0', 
                        templated = True, 
                        type = '0', 
                        deprecation = '0', 
                        profile = '0', 
                        title = '0', 
                        hreflang = '0', 
                        name = '0', ), )
            )
        else :
            return ProgramList(
        )

    def testProgramList(self):
        """Test ProgramList"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
