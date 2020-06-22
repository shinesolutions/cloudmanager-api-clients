# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.pipeline_execution import PipelineExecution  # noqa: E501
from openapi_server.models.pipeline_execution_list_representation import PipelineExecutionListRepresentation  # noqa: E501
from openapi_server.models.pipeline_execution_step_state import PipelineExecutionStepState  # noqa: E501
from openapi_server.models.pipeline_step_metrics import PipelineStepMetrics  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPipelineExecutionController(BaseTestCase):
    """PipelineExecutionController integration test stubs"""

    def test_advance_pipeline_execution(self):
        """Test case for advance_pipeline_execution

        Advance
        """
        body = None
        headers = { 
            'Content-Type': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
            'content_type': 'content_type_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/advance'.format(program_id='program_id_example', pipeline_id='pipeline_id_example', execution_id='execution_id_example', phase_id='phase_id_example', step_id='step_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_cancel_pipeline_execution_step(self):
        """Test case for cancel_pipeline_execution_step

        Cancel
        """
        body = None
        headers = { 
            'Content-Type': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
            'content_type': 'content_type_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/cancel'.format(program_id='program_id_example', pipeline_id='pipeline_id_example', execution_id='execution_id_example', phase_id='phase_id_example', step_id='step_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_current_execution(self):
        """Test case for get_current_execution

        Get current pipeline execution
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution'.format(program_id='program_id_example', pipeline_id='pipeline_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_execution(self):
        """Test case for get_execution

        Get pipeline execution
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}'.format(program_id='program_id_example', pipeline_id='pipeline_id_example', execution_id='execution_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_executions(self):
        """Test case for get_executions

        List Executions
        """
        query_string = [('start', 'start_example'),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/executions'.format(program_id='program_id_example', pipeline_id='pipeline_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_step_logs(self):
        """Test case for get_step_logs

        Get logs
        """
        query_string = [('file', 'file_example')]
        headers = { 
            'accept': 'accept_example',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/logs'.format(program_id='program_id_example', pipeline_id='pipeline_id_example', execution_id='execution_id_example', phase_id='phase_id_example', step_id='step_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_start_pipeline(self):
        """Test case for start_pipeline

        Start the pipeline
        """
        headers = { 
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
            'content_type': 'content_type_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution'.format(program_id='program_id_example', pipeline_id='pipeline_id_example'),
            method='PUT',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_step_metric(self):
        """Test case for step_metric

        Get step metrics
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}/metrics'.format(program_id='program_id_example', pipeline_id='pipeline_id_example', execution_id='execution_id_example', phase_id='phase_id_example', step_id='step_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_step_state(self):
        """Test case for step_state

        Get step state
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}/execution/{execution_id}/phase/{phase_id}/step/{step_id}'.format(program_id='program_id_example', pipeline_id='pipeline_id_example', execution_id='execution_id_example', phase_id='phase_id_example', step_id='step_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
