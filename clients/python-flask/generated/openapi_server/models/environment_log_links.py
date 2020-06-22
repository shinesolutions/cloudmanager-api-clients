# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.hal_link import HalLink
from openapi_server import util

from openapi_server.models.hal_link import HalLink  # noqa: E501

class EnvironmentLogLinks(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, http__ns_adobe_com_adobecloud_rel_logs_download=None, http__ns_adobe_com_adobecloud_rel_logs_tail=None):  # noqa: E501
        """EnvironmentLogLinks - a model defined in OpenAPI

        :param http__ns_adobe_com_adobecloud_rel_logs_download: The http__ns_adobe_com_adobecloud_rel_logs_download of this EnvironmentLogLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_logs_download: HalLink
        :param http__ns_adobe_com_adobecloud_rel_logs_tail: The http__ns_adobe_com_adobecloud_rel_logs_tail of this EnvironmentLogLinks.  # noqa: E501
        :type http__ns_adobe_com_adobecloud_rel_logs_tail: HalLink
        """
        self.openapi_types = {
            'http__ns_adobe_com_adobecloud_rel_logs_download': HalLink,
            'http__ns_adobe_com_adobecloud_rel_logs_tail': HalLink
        }

        self.attribute_map = {
            'http__ns_adobe_com_adobecloud_rel_logs_download': 'http://ns.adobe.com/adobecloud/rel/logs/download',
            'http__ns_adobe_com_adobecloud_rel_logs_tail': 'http://ns.adobe.com/adobecloud/rel/logs/tail'
        }

        self._http__ns_adobe_com_adobecloud_rel_logs_download = http__ns_adobe_com_adobecloud_rel_logs_download
        self._http__ns_adobe_com_adobecloud_rel_logs_tail = http__ns_adobe_com_adobecloud_rel_logs_tail

    @classmethod
    def from_dict(cls, dikt) -> 'EnvironmentLogLinks':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnvironmentLog__links of this EnvironmentLogLinks.  # noqa: E501
        :rtype: EnvironmentLogLinks
        """
        return util.deserialize_model(dikt, cls)

    @property
    def http__ns_adobe_com_adobecloud_rel_logs_download(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_logs_download of this EnvironmentLogLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_logs_download of this EnvironmentLogLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_logs_download

    @http__ns_adobe_com_adobecloud_rel_logs_download.setter
    def http__ns_adobe_com_adobecloud_rel_logs_download(self, http__ns_adobe_com_adobecloud_rel_logs_download):
        """Sets the http__ns_adobe_com_adobecloud_rel_logs_download of this EnvironmentLogLinks.


        :param http__ns_adobe_com_adobecloud_rel_logs_download: The http__ns_adobe_com_adobecloud_rel_logs_download of this EnvironmentLogLinks.
        :type http__ns_adobe_com_adobecloud_rel_logs_download: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_logs_download = http__ns_adobe_com_adobecloud_rel_logs_download

    @property
    def http__ns_adobe_com_adobecloud_rel_logs_tail(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_logs_tail of this EnvironmentLogLinks.


        :return: The http__ns_adobe_com_adobecloud_rel_logs_tail of this EnvironmentLogLinks.
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_logs_tail

    @http__ns_adobe_com_adobecloud_rel_logs_tail.setter
    def http__ns_adobe_com_adobecloud_rel_logs_tail(self, http__ns_adobe_com_adobecloud_rel_logs_tail):
        """Sets the http__ns_adobe_com_adobecloud_rel_logs_tail of this EnvironmentLogLinks.


        :param http__ns_adobe_com_adobecloud_rel_logs_tail: The http__ns_adobe_com_adobecloud_rel_logs_tail of this EnvironmentLogLinks.
        :type http__ns_adobe_com_adobecloud_rel_logs_tail: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_logs_tail = http__ns_adobe_com_adobecloud_rel_logs_tail
