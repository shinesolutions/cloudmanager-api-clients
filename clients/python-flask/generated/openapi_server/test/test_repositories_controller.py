# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.repository import Repository  # noqa: E501
from openapi_server.models.repository_list import RepositoryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRepositoriesController(BaseTestCase):
    """RepositoriesController integration test stubs"""

    def test_get_repositories(self):
        """Test case for get_repositories

        Lists Repositories
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/repositories'.format(program_id='program_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_repository(self):
        """Test case for get_repository

        Get Repository
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/repository/{repository_id}'.format(program_id='program_id_example', repository_id='repository_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
