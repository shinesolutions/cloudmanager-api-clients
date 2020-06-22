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

from pyaem_cloudmanager_api_client.configuration import Configuration


class PipelineExecutionStepState(object):
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
        'step_id': 'str',
        'phase_id': 'str',
        'action': 'str',
        'repository': 'str',
        'branch': 'str',
        'environment': 'str',
        'environment_type': 'str',
        'started_at': 'datetime',
        'finished_at': 'datetime',
        'details': 'dict(str, object)',
        'status': 'str',
        'links': 'PipelineExecutionStepStateLinks'
    }

    attribute_map = {
        'id': 'id',
        'step_id': 'stepId',
        'phase_id': 'phaseId',
        'action': 'action',
        'repository': 'repository',
        'branch': 'branch',
        'environment': 'environment',
        'environment_type': 'environmentType',
        'started_at': 'startedAt',
        'finished_at': 'finishedAt',
        'details': 'details',
        'status': 'status',
        'links': '_links'
    }

    def __init__(self, id=None, step_id=None, phase_id=None, action=None, repository=None, branch=None, environment=None, environment_type=None, started_at=None, finished_at=None, details=None, status=None, links=None, local_vars_configuration=None):  # noqa: E501
        """PipelineExecutionStepState - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._id = None
        self._step_id = None
        self._phase_id = None
        self._action = None
        self._repository = None
        self._branch = None
        self._environment = None
        self._environment_type = None
        self._started_at = None
        self._finished_at = None
        self._details = None
        self._status = None
        self._links = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if step_id is not None:
            self.step_id = step_id
        if phase_id is not None:
            self.phase_id = phase_id
        if action is not None:
            self.action = action
        if repository is not None:
            self.repository = repository
        if branch is not None:
            self.branch = branch
        if environment is not None:
            self.environment = environment
        if environment_type is not None:
            self.environment_type = environment_type
        if started_at is not None:
            self.started_at = started_at
        if finished_at is not None:
            self.finished_at = finished_at
        if details is not None:
            self.details = details
        if status is not None:
            self.status = status
        if links is not None:
            self.links = links

    @property
    def id(self):
        """Gets the id of this PipelineExecutionStepState.  # noqa: E501


        :return: The id of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this PipelineExecutionStepState.


        :param id: The id of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def step_id(self):
        """Gets the step_id of this PipelineExecutionStepState.  # noqa: E501


        :return: The step_id of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._step_id

    @step_id.setter
    def step_id(self, step_id):
        """Sets the step_id of this PipelineExecutionStepState.


        :param step_id: The step_id of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._step_id = step_id

    @property
    def phase_id(self):
        """Gets the phase_id of this PipelineExecutionStepState.  # noqa: E501


        :return: The phase_id of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._phase_id

    @phase_id.setter
    def phase_id(self, phase_id):
        """Sets the phase_id of this PipelineExecutionStepState.


        :param phase_id: The phase_id of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._phase_id = phase_id

    @property
    def action(self):
        """Gets the action of this PipelineExecutionStepState.  # noqa: E501

        Name of the action  # noqa: E501

        :return: The action of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._action

    @action.setter
    def action(self, action):
        """Sets the action of this PipelineExecutionStepState.

        Name of the action  # noqa: E501

        :param action: The action of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._action = action

    @property
    def repository(self):
        """Gets the repository of this PipelineExecutionStepState.  # noqa: E501

        Target repository  # noqa: E501

        :return: The repository of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._repository

    @repository.setter
    def repository(self, repository):
        """Sets the repository of this PipelineExecutionStepState.

        Target repository  # noqa: E501

        :param repository: The repository of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._repository = repository

    @property
    def branch(self):
        """Gets the branch of this PipelineExecutionStepState.  # noqa: E501

        Target branch  # noqa: E501

        :return: The branch of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._branch

    @branch.setter
    def branch(self, branch):
        """Sets the branch of this PipelineExecutionStepState.

        Target branch  # noqa: E501

        :param branch: The branch of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._branch = branch

    @property
    def environment(self):
        """Gets the environment of this PipelineExecutionStepState.  # noqa: E501

        Target environment  # noqa: E501

        :return: The environment of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._environment

    @environment.setter
    def environment(self, environment):
        """Sets the environment of this PipelineExecutionStepState.

        Target environment  # noqa: E501

        :param environment: The environment of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._environment = environment

    @property
    def environment_type(self):
        """Gets the environment_type of this PipelineExecutionStepState.  # noqa: E501

        Target environment type  # noqa: E501

        :return: The environment_type of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._environment_type

    @environment_type.setter
    def environment_type(self, environment_type):
        """Sets the environment_type of this PipelineExecutionStepState.

        Target environment type  # noqa: E501

        :param environment_type: The environment_type of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """

        self._environment_type = environment_type

    @property
    def started_at(self):
        """Gets the started_at of this PipelineExecutionStepState.  # noqa: E501

        Start time  # noqa: E501

        :return: The started_at of this PipelineExecutionStepState.  # noqa: E501
        :rtype: datetime
        """
        return self._started_at

    @started_at.setter
    def started_at(self, started_at):
        """Sets the started_at of this PipelineExecutionStepState.

        Start time  # noqa: E501

        :param started_at: The started_at of this PipelineExecutionStepState.  # noqa: E501
        :type: datetime
        """

        self._started_at = started_at

    @property
    def finished_at(self):
        """Gets the finished_at of this PipelineExecutionStepState.  # noqa: E501

        Date the execution reached a final state  # noqa: E501

        :return: The finished_at of this PipelineExecutionStepState.  # noqa: E501
        :rtype: datetime
        """
        return self._finished_at

    @finished_at.setter
    def finished_at(self, finished_at):
        """Sets the finished_at of this PipelineExecutionStepState.

        Date the execution reached a final state  # noqa: E501

        :param finished_at: The finished_at of this PipelineExecutionStepState.  # noqa: E501
        :type: datetime
        """

        self._finished_at = finished_at

    @property
    def details(self):
        """Gets the details of this PipelineExecutionStepState.  # noqa: E501

        Information about step result  # noqa: E501

        :return: The details of this PipelineExecutionStepState.  # noqa: E501
        :rtype: dict(str, object)
        """
        return self._details

    @details.setter
    def details(self, details):
        """Sets the details of this PipelineExecutionStepState.

        Information about step result  # noqa: E501

        :param details: The details of this PipelineExecutionStepState.  # noqa: E501
        :type: dict(str, object)
        """

        self._details = details

    @property
    def status(self):
        """Gets the status of this PipelineExecutionStepState.  # noqa: E501

        Action status  # noqa: E501

        :return: The status of this PipelineExecutionStepState.  # noqa: E501
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """Sets the status of this PipelineExecutionStepState.

        Action status  # noqa: E501

        :param status: The status of this PipelineExecutionStepState.  # noqa: E501
        :type: str
        """
        allowed_values = ["NOT_STARTED", "RUNNING", "FINISHED", "ERROR", "ROLLING_BACK", "ROLLED_BACK", "WAITING", "CANCELLED", "FAILED"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and status not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `status` ({0}), must be one of {1}"  # noqa: E501
                .format(status, allowed_values)
            )

        self._status = status

    @property
    def links(self):
        """Gets the links of this PipelineExecutionStepState.  # noqa: E501


        :return: The links of this PipelineExecutionStepState.  # noqa: E501
        :rtype: PipelineExecutionStepStateLinks
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this PipelineExecutionStepState.


        :param links: The links of this PipelineExecutionStepState.  # noqa: E501
        :type: PipelineExecutionStepStateLinks
        """

        self._links = links

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
        if not isinstance(other, PipelineExecutionStepState):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PipelineExecutionStepState):
            return True

        return self.to_dict() != other.to_dict()
