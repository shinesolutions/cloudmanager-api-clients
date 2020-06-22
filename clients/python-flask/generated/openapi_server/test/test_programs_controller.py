# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.program import Program  # noqa: E501
from openapi_server.models.program_list import ProgramList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProgramsController(BaseTestCase):
    """ProgramsController integration test stubs"""

    def test_delete_program(self):
        """Test case for delete_program

        Delete Program
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}'.format(program_id='program_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_program(self):
        """Test case for get_program

        Get Program
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}'.format(program_id='program_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_programs(self):
        """Test case for get_programs

        Lists Programs
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/programs',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
