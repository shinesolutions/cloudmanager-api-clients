# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.bad_request_error import BadRequestError  # noqa: E501
from openapi_server.models.environment import Environment  # noqa: E501
from openapi_server.models.environment_list import EnvironmentList  # noqa: E501
from openapi_server.models.environment_logs import EnvironmentLogs  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEnvironmentsController(BaseTestCase):
    """EnvironmentsController integration test stubs"""

    def test_delete_environment(self):
        """Test case for delete_environment

        DeleteEnvironment
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/environment/{environment_id}'.format(program_id='program_id_example', environment_id='environment_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_download_logs(self):
        """Test case for download_logs

        Download Logs
        """
        query_string = [('service', 'service_example'),
                        ('name', 'name_example'),
                        ('date', 'date_example')]
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
            'accept': 'accept_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/environment/{environment_id}/logs/download'.format(program_id='program_id_example', environment_id='environment_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_environment(self):
        """Test case for get_environment

        Get Environment
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/environment/{environment_id}'.format(program_id='program_id_example', environment_id='environment_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_environment_logs(self):
        """Test case for get_environment_logs

        Get Environment Logs
        """
        query_string = [('service', 'service_example'),
                        ('name', 'name_example'),
                        ('days', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/environment/{environment_id}/logs'.format(program_id='program_id_example', environment_id='environment_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_environments(self):
        """Test case for get_environments

        List Environments
        """
        query_string = [('type', 'type_example')]
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/environments'.format(program_id='program_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
