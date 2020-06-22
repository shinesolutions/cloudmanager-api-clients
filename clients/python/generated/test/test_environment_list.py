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
from pyaemcloudmanagerapi.models.environment_list import EnvironmentList  # noqa: E501
from pyaemcloudmanagerapi.rest import ApiException

class TestEnvironmentList(unittest.TestCase):
    """EnvironmentList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test EnvironmentList
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = pyaemcloudmanagerapi.models.environment_list.EnvironmentList()  # noqa: E501
        if include_optional :
            return EnvironmentList(
                total_number_of_items = 56, 
                embedded = pyaemcloudmanagerapi.models.environment_list__embedded.environmentList__embedded(
                    environments = [
                        pyaemcloudmanagerapi.models.environment.Environment(
                            id = '0', 
                            program_id = '14', 
                            name = 'AcmeCorp Dev1 Environment', 
                            description = 'This is our primary development environment', 
                            type = 'dev', 
                            _links = pyaemcloudmanagerapi.models.environment__links.Environment__links(
                                http://ns/adobe/com/adobecloud/rel/program = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/pipeline = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/author = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/publish = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/developer_console = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/logs = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/variables = pyaemcloudmanagerapi.models.hal_link.HalLink(
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
                                    name = '0', ), ), )
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
            return EnvironmentList(
        )

    def testEnvironmentList(self):
        """Test EnvironmentList"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
