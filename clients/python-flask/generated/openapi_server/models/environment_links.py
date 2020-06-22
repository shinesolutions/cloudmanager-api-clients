# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.hal_link import HalLink
from openapi_server import util

from openapi_server.models.hal_link import HalLink  # noqa: E501

class EnvironmentLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, http__ns_adobe_com_adobecloud_rel_program=None, http__ns_adobe_com_adobecloud_rel_pipeline=None, http__ns_adobe_com_adobecloud_rel_author=None, http__ns_adobe_com_adobecloud_rel_publish=None, http__ns_adobe_com_adobecloud_rel_developer_console=None, http__ns_adobe_com_adobecloud_rel_logs=None, http__ns_adobe_com_adobecloud_rel_variables=None, _self=None):  # noqa: E501
        """EnvironmentLinks - a model defined in OpenAPI

        :param http__ns_adobe_com_adobecloud_rel_program: The http__ns_adobe_com_adobecloud_rel_program of this EnvironmentLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_program: HalLink
        :param http__ns_adobe_com_adobecloud_rel_pipeline: The http__ns_adobe_com_adobecloud_rel_pipeline of this EnvironmentLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_pipeline: HalLink
        :param http__ns_adobe_com_adobecloud_rel_author: The http__ns_adobe_com_adobecloud_rel_author of this EnvironmentLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_author: HalLink
        :param http__ns_adobe_com_adobecloud_rel_publish: The http__ns_adobe_com_adobecloud_rel_publish of this EnvironmentLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_publish: HalLink
        :param http__ns_adobe_com_adobecloud_rel_developer_console: The http__ns_adobe_com_adobecloud_rel_developer_console of this EnvironmentLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_developer_console: HalLink
        :param http__ns_adobe_com_adobecloud_rel_logs: The http__ns_adobe_com_adobecloud_rel_logs of this EnvironmentLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_logs: HalLink
        :param http__ns_adobe_com_adobecloud_rel_variables: The http__ns_adobe_com_adobecloud_rel_variables of this EnvironmentLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_variables: HalLink
        :param _self: The _self of this EnvironmentLinks.  # noqa: E501
        :type _self: HalLink
        """
        self.openapi_types = {
            'http__ns_adobe_com_adobecloud_rel_program': HalLink,
            'http__ns_adobe_com_adobecloud_rel_pipeline': HalLink,
            'http__ns_adobe_com_adobecloud_rel_author': HalLink,
            'http__ns_adobe_com_adobecloud_rel_publish': HalLink,
            'http__ns_adobe_com_adobecloud_rel_developer_console': HalLink,
            'http__ns_adobe_com_adobecloud_rel_logs': HalLink,
            'http__ns_adobe_com_adobecloud_rel_variables': HalLink,
            '_self': HalLink
        }

        self.attribute_map = {
            'http__ns_adobe_com_adobecloud_rel_program': 'http://ns.adobe.com/adobecloud/rel/program',
            'http__ns_adobe_com_adobecloud_rel_pipeline': 'http://ns.adobe.com/adobecloud/rel/pipeline',
            'http__ns_adobe_com_adobecloud_rel_author': 'http://ns.adobe.com/adobecloud/rel/author',
            'http__ns_adobe_com_adobecloud_rel_publish': 'http://ns.adobe.com/adobecloud/rel/publish',
            'http__ns_adobe_com_adobecloud_rel_developer_console': 'http://ns.adobe.com/adobecloud/rel/developerConsole',
            'http__ns_adobe_com_adobecloud_rel_logs': 'http://ns.adobe.com/adobecloud/rel/logs',
            'http__ns_adobe_com_adobecloud_rel_variables': 'http://ns.adobe.com/adobecloud/rel/variables',
            '_self': 'self'
        }

        self._http__ns_adobe_com_adobecloud_rel_program = http__ns_adobe_com_adobecloud_rel_program
        self._http__ns_adobe_com_adobecloud_rel_pipeline = http__ns_adobe_com_adobecloud_rel_pipeline
        self._http__ns_adobe_com_adobecloud_rel_author = http__ns_adobe_com_adobecloud_rel_author
        self._http__ns_adobe_com_adobecloud_rel_publish = http__ns_adobe_com_adobecloud_rel_publish
        self._http__ns_adobe_com_adobecloud_rel_developer_console = http__ns_adobe_com_adobecloud_rel_developer_console
        self._http__ns_adobe_com_adobecloud_rel_logs = http__ns_adobe_com_adobecloud_rel_logs
        self._http__ns_adobe_com_adobecloud_rel_variables = http__ns_adobe_com_adobecloud_rel_variables
        self.__self = _self

    @classmethod
    def from_dict(cls, dikt) -> 'EnvironmentLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Environment__links of this EnvironmentLinks.  # noqa: E501
        :rtype: EnvironmentLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def http__ns_adobe_com_adobecloud_rel_program(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_program of this EnvironmentLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_program of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_program

    @http__ns_adobe_com_adobecloud_rel_program.setter
    def http__ns_adobe_com_adobecloud_rel_program(self, http__ns_adobe_com_adobecloud_rel_program):
        """Sets the http__ns_adobe_com_adobecloud_rel_program of this EnvironmentLinks.


        :param http__ns_adobe_com_adobecloud_rel_program: The http__ns_adobe_com_adobecloud_rel_program of this EnvironmentLinks.
        :type http__ns_adobe_com_adobecloud_rel_program: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_program = http__ns_adobe_com_adobecloud_rel_program

    @property
    def http__ns_adobe_com_adobecloud_rel_pipeline(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_pipeline of this EnvironmentLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_pipeline of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_pipeline

    @http__ns_adobe_com_adobecloud_rel_pipeline.setter
    def http__ns_adobe_com_adobecloud_rel_pipeline(self, http__ns_adobe_com_adobecloud_rel_pipeline):
        """Sets the http__ns_adobe_com_adobecloud_rel_pipeline of this EnvironmentLinks.


        :param http__ns_adobe_com_adobecloud_rel_pipeline: The http__ns_adobe_com_adobecloud_rel_pipeline of this EnvironmentLinks.
        :type http__ns_adobe_com_adobecloud_rel_pipeline: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_pipeline = http__ns_adobe_com_adobecloud_rel_pipeline

    @property
    def http__ns_adobe_com_adobecloud_rel_author(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_author of this EnvironmentLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_author of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_author

    @http__ns_adobe_com_adobecloud_rel_author.setter
    def http__ns_adobe_com_adobecloud_rel_author(self, http__ns_adobe_com_adobecloud_rel_author):
        """Sets the http__ns_adobe_com_adobecloud_rel_author of this EnvironmentLinks.


        :param http__ns_adobe_com_adobecloud_rel_author: The http__ns_adobe_com_adobecloud_rel_author of this EnvironmentLinks.
        :type http__ns_adobe_com_adobecloud_rel_author: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_author = http__ns_adobe_com_adobecloud_rel_author

    @property
    def http__ns_adobe_com_adobecloud_rel_publish(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_publish of this EnvironmentLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_publish of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_publish

    @http__ns_adobe_com_adobecloud_rel_publish.setter
    def http__ns_adobe_com_adobecloud_rel_publish(self, http__ns_adobe_com_adobecloud_rel_publish):
        """Sets the http__ns_adobe_com_adobecloud_rel_publish of this EnvironmentLinks.


        :param http__ns_adobe_com_adobecloud_rel_publish: The http__ns_adobe_com_adobecloud_rel_publish of this EnvironmentLinks.
        :type http__ns_adobe_com_adobecloud_rel_publish: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_publish = http__ns_adobe_com_adobecloud_rel_publish

    @property
    def http__ns_adobe_com_adobecloud_rel_developer_console(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_developer_console of this EnvironmentLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_developer_console of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_developer_console

    @http__ns_adobe_com_adobecloud_rel_developer_console.setter
    def http__ns_adobe_com_adobecloud_rel_developer_console(self, http__ns_adobe_com_adobecloud_rel_developer_console):
        """Sets the http__ns_adobe_com_adobecloud_rel_developer_console of this EnvironmentLinks.


        :param http__ns_adobe_com_adobecloud_rel_developer_console: The http__ns_adobe_com_adobecloud_rel_developer_console of this EnvironmentLinks.
        :type http__ns_adobe_com_adobecloud_rel_developer_console: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_developer_console = http__ns_adobe_com_adobecloud_rel_developer_console

    @property
    def http__ns_adobe_com_adobecloud_rel_logs(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_logs of this EnvironmentLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_logs of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_logs

    @http__ns_adobe_com_adobecloud_rel_logs.setter
    def http__ns_adobe_com_adobecloud_rel_logs(self, http__ns_adobe_com_adobecloud_rel_logs):
        """Sets the http__ns_adobe_com_adobecloud_rel_logs of this EnvironmentLinks.


        :param http__ns_adobe_com_adobecloud_rel_logs: The http__ns_adobe_com_adobecloud_rel_logs of this EnvironmentLinks.
        :type http__ns_adobe_com_adobecloud_rel_logs: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_logs = http__ns_adobe_com_adobecloud_rel_logs

    @property
    def http__ns_adobe_com_adobecloud_rel_variables(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_variables of this EnvironmentLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_variables of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_variables

    @http__ns_adobe_com_adobecloud_rel_variables.setter
    def http__ns_adobe_com_adobecloud_rel_variables(self, http__ns_adobe_com_adobecloud_rel_variables):
        """Sets the http__ns_adobe_com_adobecloud_rel_variables of this EnvironmentLinks.


        :param http__ns_adobe_com_adobecloud_rel_variables: The http__ns_adobe_com_adobecloud_rel_variables of this EnvironmentLinks.
        :type http__ns_adobe_com_adobecloud_rel_variables: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_variables = http__ns_adobe_com_adobecloud_rel_variables

    @property
    def _self(self):
        """Gets the _self of this EnvironmentLinks.


        :return: The _self of this EnvironmentLinks.
        :rtype: HalLink
        """
        return self.__self

    @_self.setter
    def _self(self, _self):
        """Sets the _self of this EnvironmentLinks.


        :param _self: The _self of this EnvironmentLinks.
        :type _self: HalLink
        """

        self.__self = _self
