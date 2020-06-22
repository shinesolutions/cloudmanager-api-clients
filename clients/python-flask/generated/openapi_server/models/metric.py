# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server import util


class Metric(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, severity=None, passed=False, override=False, actual_value=None, expected_value=None, comparator=None, kpi=None):  # noqa: E501
        """Metric - a model defined in OpenAPI

        :param id: The id of this Metric.  # noqa: E501
        :type id: str
        :param severity: The severity of this Metric.  # noqa: E501
        :type severity: str
        :param passed: The passed of this Metric.  # noqa: E501
        :type passed: bool
        :param override: The override of this Metric.  # noqa: E501
        :type override: bool
        :param actual_value: The actual_value of this Metric.  # noqa: E501
        :type actual_value: str
        :param expected_value: The expected_value of this Metric.  # noqa: E501
        :type expected_value: str
        :param comparator: The comparator of this Metric.  # noqa: E501
        :type comparator: str
        :param kpi: The kpi of this Metric.  # noqa: E501
        :type kpi: str
        """
        self.openapi_types = {
            'id': str,
            'severity': str,
            'passed': bool,
            'override': bool,
            'actual_value': str,
            'expected_value': str,
            'comparator': str,
            'kpi': str
        }

        self.attribute_map = {
            'id': 'id',
            'severity': 'severity',
            'passed': 'passed',
            'override': 'override',
            'actual_value': 'actualValue',
            'expected_value': 'expectedValue',
            'comparator': 'comparator',
            'kpi': 'kpi'
        }

        self._id = id
        self._severity = severity
        self._passed = passed
        self._override = override
        self._actual_value = actual_value
        self._expected_value = expected_value
        self._comparator = comparator
        self._kpi = kpi

    @classmethod
    def from_dict(cls, dikt) -> 'Metric':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Metric of this Metric.  # noqa: E501
        :rtype: Metric
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Metric.

        KPI result identifier  # noqa: E501

        :return: The id of this Metric.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Metric.

        KPI result identifier  # noqa: E501

        :param id: The id of this Metric.
        :type id: str
        """

        self._id = id

    @property
    def severity(self):
        """Gets the severity of this Metric.

        Severity of the metric  # noqa: E501

        :return: The severity of this Metric.
        :rtype: str
        """
        return self._severity

    @severity.setter
    def severity(self, severity):
        """Sets the severity of this Metric.

        Severity of the metric  # noqa: E501

        :param severity: The severity of this Metric.
        :type severity: str
        """
        allowed_values = ["critical", "important", "informational"]  # noqa: E501
        if severity not in allowed_values:
            raise ValueError(
                "Invalid value for `severity` ({0}), must be one of {1}"
                .format(severity, allowed_values)
            )

        self._severity = severity

    @property
    def passed(self):
        """Gets the passed of this Metric.

        Whether metric is considered passed  # noqa: E501

        :return: The passed of this Metric.
        :rtype: bool
        """
        return self._passed

    @passed.setter
    def passed(self, passed):
        """Sets the passed of this Metric.

        Whether metric is considered passed  # noqa: E501

        :param passed: The passed of this Metric.
        :type passed: bool
        """

        self._passed = passed

    @property
    def override(self):
        """Gets the override of this Metric.

        Whether user override the failed metric  # noqa: E501

        :return: The override of this Metric.
        :rtype: bool
        """
        return self._override

    @override.setter
    def override(self, override):
        """Sets the override of this Metric.

        Whether user override the failed metric  # noqa: E501

        :param override: The override of this Metric.
        :type override: bool
        """

        self._override = override

    @property
    def actual_value(self):
        """Gets the actual_value of this Metric.

        Expected value for the metric  # noqa: E501

        :return: The actual_value of this Metric.
        :rtype: str
        """
        return self._actual_value

    @actual_value.setter
    def actual_value(self, actual_value):
        """Sets the actual_value of this Metric.

        Expected value for the metric  # noqa: E501

        :param actual_value: The actual_value of this Metric.
        :type actual_value: str
        """

        self._actual_value = actual_value

    @property
    def expected_value(self):
        """Gets the expected_value of this Metric.

        Expected value for the metric  # noqa: E501

        :return: The expected_value of this Metric.
        :rtype: str
        """
        return self._expected_value

    @expected_value.setter
    def expected_value(self, expected_value):
        """Sets the expected_value of this Metric.

        Expected value for the metric  # noqa: E501

        :param expected_value: The expected_value of this Metric.
        :type expected_value: str
        """

        self._expected_value = expected_value

    @property
    def comparator(self):
        """Gets the comparator of this Metric.

        Comparator used for the metric  # noqa: E501

        :return: The comparator of this Metric.
        :rtype: str
        """
        return self._comparator

    @comparator.setter
    def comparator(self, comparator):
        """Sets the comparator of this Metric.

        Comparator used for the metric  # noqa: E501

        :param comparator: The comparator of this Metric.
        :type comparator: str
        """
        allowed_values = ["GT", "GTE", "LT", "LTE", "EQ", "NEQ"]  # noqa: E501
        if comparator not in allowed_values:
            raise ValueError(
                "Invalid value for `comparator` ({0}), must be one of {1}"
                .format(comparator, allowed_values)
            )

        self._comparator = comparator

    @property
    def kpi(self):
        """Gets the kpi of this Metric.

        KPI identifier  # noqa: E501

        :return: The kpi of this Metric.
        :rtype: str
        """
        return self._kpi

    @kpi.setter
    def kpi(self, kpi):
        """Sets the kpi of this Metric.

        KPI identifier  # noqa: E501

        :param kpi: The kpi of this Metric.
        :type kpi: str
        """

        self._kpi = kpi
