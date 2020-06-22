import connexion
import six

from openapi_server.models.program import Program  # noqa: E501
from openapi_server.models.program_list import ProgramList  # noqa: E501
from openapi_server import util


def delete_program(program_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Delete Program

    Delete an program # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: Program
    """
    return 'do some magic!'


def get_program(program_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get Program

    Returns a program by its id # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: Program
    """
    return 'do some magic!'


def get_programs(x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Lists Programs

    Returns all programs that the requesting user has access to # noqa: E501

    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: ProgramList
    """
    return 'do some magic!'
