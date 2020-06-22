# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.hal_link import HalLink
from openapi_server import util

from openapi_server.models.hal_link import HalLink  # noqa: E501

class PipelineExecutionLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, http__ns_adobe_com_adobecloud_rel_program=None, http__ns_adobe_com_adobecloud_rel_pipeline=None, _self=None):  # noqa: E501
        """PipelineExecutionLinks - a model defined in OpenAPI

        :param http__ns_adobe_com_adobecloud_rel_program: The http__ns_adobe_com_adobecloud_rel_program of this PipelineExecutionLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_program: HalLink
        :param http__ns_adobe_com_adobecloud_rel_pipeline: The http__ns_adobe_com_adobecloud_rel_pipeline of this PipelineExecutionLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_pipeline: HalLink
        :param _self: The _self of this PipelineExecutionLinks.  # noqa: E501
        :type _self: HalLink
        """
        self.openapi_types = {
            'http__ns_adobe_com_adobecloud_rel_program': HalLink,
            'http__ns_adobe_com_adobecloud_rel_pipeline': HalLink,
            '_self': HalLink
        }

        self.attribute_map = {
            'http__ns_adobe_com_adobecloud_rel_program': 'http://ns.adobe.com/adobecloud/rel/program',
            'http__ns_adobe_com_adobecloud_rel_pipeline': 'http://ns.adobe.com/adobecloud/rel/pipeline',
            '_self': 'self'
        }

        self._http__ns_adobe_com_adobecloud_rel_program = http__ns_adobe_com_adobecloud_rel_program
        self._http__ns_adobe_com_adobecloud_rel_pipeline = http__ns_adobe_com_adobecloud_rel_pipeline
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'PipelineExecutionLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The pipelineExecution__links of this PipelineExecutionLinks.  # noqa: E501
        :rtype: PipelineExecutionLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def http__ns_adobe_com_adobecloud_rel_program(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_program of this PipelineExecutionLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_program of this PipelineExecutionLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_program

    @http__ns_adobe_com_adobecloud_rel_program.setter
    def http__ns_adobe_com_adobecloud_rel_program(self, http__ns_adobe_com_adobecloud_rel_program):
        """Sets the http__ns_adobe_com_adobecloud_rel_program of this PipelineExecutionLinks.


        :param http__ns_adobe_com_adobecloud_rel_program: The http__ns_adobe_com_adobecloud_rel_program of this PipelineExecutionLinks.
        :type http__ns_adobe_com_adobecloud_rel_program: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_program = http__ns_adobe_com_adobecloud_rel_program

    @property
    def http__ns_adobe_com_adobecloud_rel_pipeline(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_pipeline of this PipelineExecutionLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_pipeline of this PipelineExecutionLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_pipeline

    @http__ns_adobe_com_adobecloud_rel_pipeline.setter
    def http__ns_adobe_com_adobecloud_rel_pipeline(self, http__ns_adobe_com_adobecloud_rel_pipeline):
        """Sets the http__ns_adobe_com_adobecloud_rel_pipeline of this PipelineExecutionLinks.


        :param http__ns_adobe_com_adobecloud_rel_pipeline: The http__ns_adobe_com_adobecloud_rel_pipeline of this PipelineExecutionLinks.
        :type http__ns_adobe_com_adobecloud_rel_pipeline: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_pipeline = http__ns_adobe_com_adobecloud_rel_pipeline

    @property
    def _self(self):
        """Gets the _self of this PipelineExecutionLinks.


        :return: The _self of this PipelineExecutionLinks.
        :rtype: HalLink
        """
        return self.__self

    @_self.setter
    def _self(self, _self):
        """Sets the _self of this PipelineExecutionLinks.


        :param _self: The _self of this PipelineExecutionLinks.
        :type _self: HalLink
        """

        self.__self = _self
