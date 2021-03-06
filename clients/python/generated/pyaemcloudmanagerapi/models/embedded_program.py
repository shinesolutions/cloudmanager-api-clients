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


class EmbeddedProgram(object):
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
        'id': 'str',
        'name': 'str',
        'enabled': 'bool',
        'tenant_id': 'str'
    }

    attribute_map = {
        'id': 'id',
        'name': 'name',
        'enabled': 'enabled',
        'tenant_id': 'tenantId'
    }

    def __init__(self, id=None, name=None, enabled=False, tenant_id=None, local_vars_configuration=None):  # noqa: E501
        """EmbeddedProgram - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._name = None
        self._enabled = None
        self._tenant_id = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if name is not None:
            self.name = name
        if enabled is not None:
            self.enabled = enabled
        if tenant_id is not None:
            self.tenant_id = tenant_id

    @property
    def id(self):
        """Gets the id of this EmbeddedProgram.  # noqa: E501

        Identifier of the program. Unique within the space.  # noqa: E501

        :return: The id of this EmbeddedProgram.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this EmbeddedProgram.

        Identifier of the program. Unique within the space.  # noqa: E501

        :param id: The id of this EmbeddedProgram.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this EmbeddedProgram.  # noqa: E501

        Name of the program  # noqa: E501

        :return: The name of this EmbeddedProgram.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this EmbeddedProgram.

        Name of the program  # noqa: E501

        :param name: The name of this EmbeddedProgram.  # noqa: E501
        :type: str
        """

        self._name = name

    @property
    def enabled(self):
        """Gets the enabled of this EmbeddedProgram.  # noqa: E501

        Whether this Program has been enabled for Cloud Manager usage  # noqa: E501

        :return: The enabled of this EmbeddedProgram.  # noqa: E501
        :rtype: bool
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this EmbeddedProgram.

        Whether this Program has been enabled for Cloud Manager usage  # noqa: E501

        :param enabled: The enabled of this EmbeddedProgram.  # noqa: E501
        :type: bool
        """

        self._enabled = enabled

    @property
    def tenant_id(self):
        """Gets the tenant_id of this EmbeddedProgram.  # noqa: E501

        Tenant Id  # noqa: E501

        :return: The tenant_id of this EmbeddedProgram.  # noqa: E501
        :rtype: str
        """
        return self._tenant_id

    @tenant_id.setter
    def tenant_id(self, tenant_id):
        """Sets the tenant_id of this EmbeddedProgram.

        Tenant Id  # noqa: E501

        :param tenant_id: The tenant_id of this EmbeddedProgram.  # noqa: E501
        :type: str
        """

        self._tenant_id = tenant_id

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
        if not isinstance(other, EmbeddedProgram):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, EmbeddedProgram):
            return True

        return self.to_dict() != other.to_dict()
