# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.pipeline import Pipeline
from openapi_server import util

from openapi_server.models.pipeline import Pipeline  # noqa: E501

class PipelineListEmbedded(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pipelines=None):  # noqa: E501
        """PipelineListEmbedded - a model defined in OpenAPI

        :param pipelines: The pipelines of this PipelineListEmbedded.  # noqa: E501
        :type pipelines: List[Pipeline]
        """
        self.openapi_types = {
            'pipelines': List[Pipeline]
        }

        self.attribute_map = {
            'pipelines': 'pipelines'
        }

        self._pipelines = pipelines

    @classmethod
    def from_dict(cls, dikt) -> 'PipelineListEmbedded':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The pipelineList__embedded of this PipelineListEmbedded.  # noqa: E501
        :rtype: PipelineListEmbedded
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pipelines(self):
        """Gets the pipelines of this PipelineListEmbedded.


        :return: The pipelines of this PipelineListEmbedded.
        :rtype: List[Pipeline]
        """
        return self._pipelines

    @pipelines.setter
    def pipelines(self, pipelines):
        """Sets the pipelines of this PipelineListEmbedded.


        :param pipelines: The pipelines of this PipelineListEmbedded.
        :type pipelines: List[Pipeline]
        """

        self._pipelines = pipelines
