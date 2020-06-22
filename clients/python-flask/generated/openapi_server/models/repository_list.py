# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.program_list_links import ProgramListLinks
from openapi_server.models.repository_list_embedded import RepositoryListEmbedded
from openapi_server import util

from openapi_server.models.program_list_links import ProgramListLinks  # noqa: E501
from openapi_server.models.repository_list_embedded import RepositoryListEmbedded  # noqa: E501

class RepositoryList(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_number_of_items=None, embedded=None, links=None):  # noqa: E501
        """RepositoryList - a model defined in OpenAPI

        :param total_number_of_items: The total_number_of_items of this RepositoryList.  # noqa: E501
        :type total_number_of_items: int
        :param embedded: The embedded of this RepositoryList.  # noqa: E501
        :type embedded: RepositoryListEmbedded
        :param links: The links of this RepositoryList.  # noqa: E501
        :type links: ProgramListLinks
        """
        self.openapi_types = {
            'total_number_of_items': int,
            'embedded': RepositoryListEmbedded,
            'links': ProgramListLinks
        }

        self.attribute_map = {
            'total_number_of_items': '_totalNumberOfItems',
            'embedded': '_embedded',
            'links': '_links'
        }

        self._total_number_of_items = total_number_of_items
        self._embedded = embedded
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'RepositoryList':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The repositoryList of this RepositoryList.  # noqa: E501
        :rtype: RepositoryList
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_number_of_items(self):
        """Gets the total_number_of_items of this RepositoryList.


        :return: The total_number_of_items of this RepositoryList.
        :rtype: int
        """
        return self._total_number_of_items

    @total_number_of_items.setter
    def total_number_of_items(self, total_number_of_items):
        """Sets the total_number_of_items of this RepositoryList.


        :param total_number_of_items: The total_number_of_items of this RepositoryList.
        :type total_number_of_items: int
        """

        self._total_number_of_items = total_number_of_items

    @property
    def embedded(self):
        """Gets the embedded of this RepositoryList.


        :return: The embedded of this RepositoryList.
        :rtype: RepositoryListEmbedded
        """
        return self._embedded

    @embedded.setter
    def embedded(self, embedded):
        """Sets the embedded of this RepositoryList.


        :param embedded: The embedded of this RepositoryList.
        :type embedded: RepositoryListEmbedded
        """

        self._embedded = embedded

    @property
    def links(self):
        """Gets the links of this RepositoryList.


        :return: The links of this RepositoryList.
        :rtype: ProgramListLinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this RepositoryList.


        :param links: The links of this RepositoryList.
        :type links: ProgramListLinks
        """

        self._links = links
