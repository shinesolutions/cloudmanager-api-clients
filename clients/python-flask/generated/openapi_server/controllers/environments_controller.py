import connexion
import six

from openapi_server.models.bad_request_error import BadRequestError  # noqa: E501
from openapi_server.models.environment import Environment  # noqa: E501
from openapi_server.models.environment_list import EnvironmentList  # noqa: E501
from openapi_server.models.environment_logs import EnvironmentLogs  # noqa: E501
from openapi_server import util


def delete_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """DeleteEnvironment

    Delete environment # noqa: E501

    :param program_id: Identifier of the application
    :type program_id: str
    :param environment_id: Identifier of the environment
    :type environment_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: Environment
    """
    return 'do some magic!'


def download_logs(program_id, environment_id, service, name, date, x_gw_ims_org_id, authorization, x_api_key, accept=None):  # noqa: E501
    """Download Logs

    Download environment logs # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param environment_id: Identifier of the environment
    :type environment_id: str
    :param service: Name of service
    :type service: str
    :param name: Name of log
    :type name: str
    :param date: date for which log is required
    :type date: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param accept: Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
    :type accept: str

    :rtype: None
    """
    return 'do some magic!'


def get_environment(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get Environment

    Returns an environment by its id # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param environment_id: Identifier of the environment
    :type environment_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: Environment
    """
    return 'do some magic!'


def get_environment_logs(program_id, environment_id, days, x_gw_ims_org_id, authorization, x_api_key, service=None, name=None):  # noqa: E501
    """Get Environment Logs

    List all logs available in environment # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param environment_id: Identifier of the environment
    :type environment_id: str
    :param days: number of days for which logs are required
    :type days: int
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param service: Names of services
    :type service: List[str]
    :param name: Names of log
    :type name: List[str]

    :rtype: EnvironmentLogs
    """
    return 'do some magic!'


def get_environments(program_id, x_gw_ims_org_id, authorization, x_api_key, type=None):  # noqa: E501
    """List Environments

    Lists all environments in an program # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param type: Type of the environment
    :type type: str

    :rtype: EnvironmentList
    """
    return 'do some magic!'
