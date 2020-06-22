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
from pyaemcloudmanagerapi.models.pipeline_execution import PipelineExecution  # noqa: E501
from pyaemcloudmanagerapi.rest import ApiException

class TestPipelineExecution(unittest.TestCase):
    """PipelineExecution unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test PipelineExecution
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = pyaemcloudmanagerapi.models.pipeline_execution.PipelineExecution()  # noqa: E501
        if include_optional :
            return PipelineExecution(
                id = '0', 
                program_id = '14', 
                pipeline_id = '10', 
                artifacts_version = '0', 
                user = '0123456789ABCDE@AdobeID', 
                status = 'NOT_STARTED', 
                trigger = 'ON_COMMIT', 
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                finished_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                embedded = pyaemcloudmanagerapi.models.pipeline_execution__embedded.pipelineExecution__embedded(
                    step_states = [
                        pyaemcloudmanagerapi.models.pipeline_execution_step_state.pipelineExecutionStepState(
                            id = '0', 
                            step_id = '0', 
                            phase_id = '0', 
                            action = 'build', 
                            repository = '0', 
                            branch = '0', 
                            environment = '0', 
                            environment_type = '0', 
                            started_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            finished_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                            details = scheduled time, 
                            status = 'NOT_STARTED', 
                            _links = pyaemcloudmanagerapi.models.pipeline_execution_step_state__links.pipelineExecutionStepState__links(
                                http://ns/adobe/com/adobecloud/rel/execution = pyaemcloudmanagerapi.models.hal_link.HalLink(
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
                                http://ns/adobe/com/adobecloud/rel/pipeline/logs = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/pipeline/metrics = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/pipeline/advance = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/pipeline/cancel = pyaemcloudmanagerapi.models.hal_link.HalLink(
                                    href = '0', 
                                    templated = True, 
                                    type = '0', 
                                    deprecation = '0', 
                                    profile = '0', 
                                    title = '0', 
                                    hreflang = '0', 
                                    name = '0', ), 
                                http://ns/adobe/com/adobecloud/rel/program = pyaemcloudmanagerapi.models.hal_link.HalLink(
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
                links = pyaemcloudmanagerapi.models.pipeline_execution__links.pipelineExecution__links(
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
            return PipelineExecution(
        )

    def testPipelineExecution(self):
        """Test PipelineExecution"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
