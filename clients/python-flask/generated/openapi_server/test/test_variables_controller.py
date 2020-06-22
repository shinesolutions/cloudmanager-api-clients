# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.variable import Variable  # noqa: E501
from openapi_server.models.variable_list import VariableList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestVariablesController(BaseTestCase):
    """VariablesController integration test stubs"""

    def test_get_environment_variables(self):
        """Test case for get_environment_variables

        List User Environment Variables
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/environment/{environment_id}/variables'.format(program_id=2351, environment_id=128),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_environment_variables(self):
        """Test case for patch_environment_variables

        Patch User Environment Variables
        """
        body = {
  "name" : "MY_VAR1",
  "type" : "string",
  "value" : "myValue"
}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
            'content_type': 'content_type_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/environment/{environment_id}/variables'.format(program_id='program_id_example', environment_id='environment_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
