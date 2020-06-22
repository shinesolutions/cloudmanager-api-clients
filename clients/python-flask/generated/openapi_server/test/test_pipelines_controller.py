# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.pipeline import Pipeline  # noqa: E501
from openapi_server.models.pipeline_list import PipelineList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPipelinesController(BaseTestCase):
    """PipelinesController integration test stubs"""

    def test_delete_pipeline(self):
        """Test case for delete_pipeline

        Delete a Pipeline
        """
        headers = { 
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}'.format(program_id='program_id_example', pipeline_id='pipeline_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_pipeline(self):
        """Test case for get_pipeline

        Get Pipeline
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipeline/{pipeline_id}'.format(program_id='program_id_example', pipeline_id='pipeline_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_pipelines(self):
        """Test case for get_pipelines

        List Pipelines
        """
        headers = { 
            'Accept': 'application/json',
            'x_gw_ims_org_id': 'x_gw_ims_org_id_example',
            'authorization': 'authorization_example',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/api/program/{program_id}/pipelines'.format(program_id='program_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_patch_pipeline(self):
        """Test case for patch_pipeline

        Patches Pipeline
        """
        body = {
  "createdAt" : "2000-01-23T04:56:07.000+00:00",
  "_links" : {
    "http://ns.adobe.com/adobecloud/rel/program" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "self" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/executions" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/rollbackLastSuccessfulExecution" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    },
    "http://ns.adobe.com/adobecloud/rel/execution" : {
      "hreflang" : "hreflang",
      "templated" : false,
      "profile" : "profile",
      "name" : "name",
      "href" : "href",
      "type" : "type",
      "deprecation" : "deprecation",
      "title" : "title"
    }
  },
  "lastStartedAt" : "2000-01-23T04:56:07.000+00:00",
  "name" : "AcmeCorp Main Pipeline",
  "lastFinishedAt" : "2000-01-23T04:56:07.000+00:00",
  "id" : "29",
  "trigger" : "MANUAL",
  "programId" : "14",
  "phases" : [ {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  }, {
    "environmentId" : "environmentId",
    "name" : "DEV Build",
    "repositoryId" : "repositoryId",
    "type" : "DEPLOY",
    "branch" : "branch"
  } ],
  "status" : "RUNNING,FAILED",
  "updatedAt" : "2000-01-23T04:56:07.000+00:00"
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
            '/api/program/{program_id}/pipeline/{pipeline_id}'.format(program_id='program_id_example', pipeline_id='pipeline_id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
