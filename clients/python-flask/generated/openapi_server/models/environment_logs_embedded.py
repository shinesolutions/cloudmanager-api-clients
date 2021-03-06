# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.environment_log import EnvironmentLog
from openapi_server import util

from openapi_server.models.environment_log import EnvironmentLog  # noqa: E501

class EnvironmentLogsEmbedded(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, downloads=None):  # noqa: E501
        """EnvironmentLogsEmbedded - a model defined in OpenAPI

        :param downloads: The downloads of this EnvironmentLogsEmbedded.  # noqa: E501
        :type downloads: List[EnvironmentLog]
        """
        self.openapi_types = {
            'downloads': List[EnvironmentLog]
        }

        self.attribute_map = {
            'downloads': 'downloads'
        }

        self._downloads = downloads

    @classmethod
    def from_dict(cls, dikt) -> 'EnvironmentLogsEmbedded':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EnvironmentLogs__embedded of this EnvironmentLogsEmbedded.  # noqa: E501
        :rtype: EnvironmentLogsEmbedded
        """
        return util.deserialize_model(dikt, cls)

    @property
    def downloads(self):
        """Gets the downloads of this EnvironmentLogsEmbedded.

        Links to logs  # noqa: E501

        :return: The downloads of this EnvironmentLogsEmbedded.
        :rtype: List[EnvironmentLog]
        """
        return self._downloads

    @downloads.setter
    def downloads(self, downloads):
        """Sets the downloads of this EnvironmentLogsEmbedded.

        Links to logs  # noqa: E501

        :param downloads: The downloads of this EnvironmentLogsEmbedded.
        :type downloads: List[EnvironmentLog]
        """

        self._downloads = downloads
