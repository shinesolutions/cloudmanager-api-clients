# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.repository import Repository
from openapi_server import util

from openapi_server.models.repository import Repository  # noqa: E501

class RepositoryListEmbedded(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, repositories=None):  # noqa: E501
        """RepositoryListEmbedded - a model defined in OpenAPI

        :param repositories: The repositories of this RepositoryListEmbedded.  # noqa: E501
        :type repositories: List[Repository]
        """
        self.openapi_types = {
            'repositories': List[Repository]
        }

        self.attribute_map = {
            'repositories': 'repositories'
        }

        self._repositories = repositories

    @classmethod
    def from_dict(cls, dikt) -> 'RepositoryListEmbedded':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The repositoryList__embedded of this RepositoryListEmbedded.  # noqa: E501
        :rtype: RepositoryListEmbedded
        """
        return util.deserialize_model(dikt, cls)

    @property
    def repositories(self):
        """Gets the repositories of this RepositoryListEmbedded.


        :return: The repositories of this RepositoryListEmbedded.
        :rtype: List[Repository]
        """
        return self._repositories

    @repositories.setter
    def repositories(self, repositories):
        """Sets the repositories of this RepositoryListEmbedded.


        :param repositories: The repositories of this RepositoryListEmbedded.
        :type repositories: List[Repository]
        """

        self._repositories = repositories
