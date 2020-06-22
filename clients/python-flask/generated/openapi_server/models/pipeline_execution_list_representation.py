# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.pipeline_execution_list_representation_embedded import PipelineExecutionListRepresentationEmbedded
from openapi_server.models.pipeline_execution_list_representation_links import PipelineExecutionListRepresentationLinks
from openapi_server.models.requested_page_details import RequestedPageDetails
from openapi_server import util

from openapi_server.models.pipeline_execution_list_representation_embedded import PipelineExecutionListRepresentationEmbedded  # noqa: E501
from openapi_server.models.pipeline_execution_list_representation_links import PipelineExecutionListRepresentationLinks  # noqa: E501
from openapi_server.models.requested_page_details import RequestedPageDetails  # noqa: E501

class PipelineExecutionListRepresentation(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_number_of_items=None, page=None, embedded=None, links=None):  # noqa: E501
        """PipelineExecutionListRepresentation - a model defined in OpenAPI

        :param total_number_of_items: The total_number_of_items of this PipelineExecutionListRepresentation.  # noqa: E501
        :type total_number_of_items: int
        :param page: The page of this PipelineExecutionListRepresentation.  # noqa: E501
        :type page: RequestedPageDetails
        :param embedded: The embedded of this PipelineExecutionListRepresentation.  # noqa: E501
        :type embedded: PipelineExecutionListRepresentationEmbedded
        :param links: The links of this PipelineExecutionListRepresentation.  # noqa: E501
        :type links: PipelineExecutionListRepresentationLinks
        """
        self.openapi_types = {
            'total_number_of_items': int,
            'page': RequestedPageDetails,
            'embedded': PipelineExecutionListRepresentationEmbedded,
            'links': PipelineExecutionListRepresentationLinks
        }

        self.attribute_map = {
            'total_number_of_items': '_totalNumberOfItems',
            'page': '_page',
            'embedded': '_embedded',
            'links': '_links'
        }

        self._total_number_of_items = total_number_of_items
        self._page = page
        self._embedded = embedded
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'PipelineExecutionListRepresentation':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PipelineExecutionListRepresentation of this PipelineExecutionListRepresentation.  # noqa: E501
        :rtype: PipelineExecutionListRepresentation
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_number_of_items(self):
        """Gets the total_number_of_items of this PipelineExecutionListRepresentation.


        :return: The total_number_of_items of this PipelineExecutionListRepresentation.
        :rtype: int
        """
        return self._total_number_of_items

    @total_number_of_items.setter
    def total_number_of_items(self, total_number_of_items):
        """Sets the total_number_of_items of this PipelineExecutionListRepresentation.


        :param total_number_of_items: The total_number_of_items of this PipelineExecutionListRepresentation.
        :type total_number_of_items: int
        """

        self._total_number_of_items = total_number_of_items

    @property
    def page(self):
        """Gets the page of this PipelineExecutionListRepresentation.


        :return: The page of this PipelineExecutionListRepresentation.
        :rtype: RequestedPageDetails
        """
        return self._page

    @page.setter
    def page(self, page):
        """Sets the page of this PipelineExecutionListRepresentation.


        :param page: The page of this PipelineExecutionListRepresentation.
        :type page: RequestedPageDetails
        """

        self._page = page

    @property
    def embedded(self):
        """Gets the embedded of this PipelineExecutionListRepresentation.


        :return: The embedded of this PipelineExecutionListRepresentation.
        :rtype: PipelineExecutionListRepresentationEmbedded
        """
        return self._embedded

    @embedded.setter
    def embedded(self, embedded):
        """Sets the embedded of this PipelineExecutionListRepresentation.


        :param embedded: The embedded of this PipelineExecutionListRepresentation.
        :type embedded: PipelineExecutionListRepresentationEmbedded
        """

        self._embedded = embedded

    @property
    def links(self):
        """Gets the links of this PipelineExecutionListRepresentation.


        :return: The links of this PipelineExecutionListRepresentation.
        :rtype: PipelineExecutionListRepresentationLinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this PipelineExecutionListRepresentation.


        :param links: The links of this PipelineExecutionListRepresentation.
        :type links: PipelineExecutionListRepresentationLinks
        """

        self._links = links
