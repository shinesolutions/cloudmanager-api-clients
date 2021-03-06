# coding: utf-8

"""
    Cloud Manager API

    This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from pyaemcloudmanagerapi.configuration import Configuration


class RepositoryLinks(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'http__ns_adobe_com_adobecloud_rel_program': 'HalLink',
        'http__ns_adobe_com_adobecloud_rel_branches': 'HalLink',
        '_self': 'HalLink'
    }

    attribute_map = {
        'http__ns_adobe_com_adobecloud_rel_program': 'http://ns.adobe.com/adobecloud/rel/program',
        'http__ns_adobe_com_adobecloud_rel_branches': 'http://ns.adobe.com/adobecloud/rel/branches',
        '_self': 'self'
    }

    def __init__(self, http__ns_adobe_com_adobecloud_rel_program=None, http__ns_adobe_com_adobecloud_rel_branches=None, _self=None, local_vars_configuration=None):  # noqa: E501
        """RepositoryLinks - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._http__ns_adobe_com_adobecloud_rel_program = None
        self._http__ns_adobe_com_adobecloud_rel_branches = None
        self.__self = None
        self.discriminator = None

        if http__ns_adobe_com_adobecloud_rel_program is not None:
            self.http__ns_adobe_com_adobecloud_rel_program = http__ns_adobe_com_adobecloud_rel_program
        if http__ns_adobe_com_adobecloud_rel_branches is not None:
            self.http__ns_adobe_com_adobecloud_rel_branches = http__ns_adobe_com_adobecloud_rel_branches
        if _self is not None:
            self._self = _self

    @property
    def http__ns_adobe_com_adobecloud_rel_program(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_program of this RepositoryLinks.  # noqa: E501


        :return: The http__ns_adobe_com_adobecloud_rel_program of this RepositoryLinks.  # noqa: E501
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_program

    @http__ns_adobe_com_adobecloud_rel_program.setter
    def http__ns_adobe_com_adobecloud_rel_program(self, http__ns_adobe_com_adobecloud_rel_program):
        """Sets the http__ns_adobe_com_adobecloud_rel_program of this RepositoryLinks.


        :param http__ns_adobe_com_adobecloud_rel_program: The http__ns_adobe_com_adobecloud_rel_program of this RepositoryLinks.  # noqa: E501
        :type: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_program = http__ns_adobe_com_adobecloud_rel_program

    @property
    def http__ns_adobe_com_adobecloud_rel_branches(self):
        """Gets the http__ns_adobe_com_adobecloud_rel_branches of this RepositoryLinks.  # noqa: E501


        :return: The http__ns_adobe_com_adobecloud_rel_branches of this RepositoryLinks.  # noqa: E501
        :rtype: HalLink
        """
        return self._http__ns_adobe_com_adobecloud_rel_branches

    @http__ns_adobe_com_adobecloud_rel_branches.setter
    def http__ns_adobe_com_adobecloud_rel_branches(self, http__ns_adobe_com_adobecloud_rel_branches):
        """Sets the http__ns_adobe_com_adobecloud_rel_branches of this RepositoryLinks.


        :param http__ns_adobe_com_adobecloud_rel_branches: The http__ns_adobe_com_adobecloud_rel_branches of this RepositoryLinks.  # noqa: E501
        :type: HalLink
        """

        self._http__ns_adobe_com_adobecloud_rel_branches = http__ns_adobe_com_adobecloud_rel_branches

    @property
    def _self(self):
        """Gets the _self of this RepositoryLinks.  # noqa: E501


        :return: The _self of this RepositoryLinks.  # noqa: E501
        :rtype: HalLink
        """
        return self.__self

    @_self.setter
    def _self(self, _self):
        """Sets the _self of this RepositoryLinks.


        :param _self: The _self of this RepositoryLinks.  # noqa: E501
        :type: HalLink
        """

        self.__self = _self

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, RepositoryLinks):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, RepositoryLinks):
            return True

        return self.to_dict() != other.to_dict()
