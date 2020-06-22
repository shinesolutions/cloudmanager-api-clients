import connexion
import six

from openapi_server.models.repository import Repository  # noqa: E501
from openapi_server.models.repository_list import RepositoryList  # noqa: E501
from openapi_server import util


def get_repositories(program_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Lists Repositories

    Lists all Repositories in an program # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: RepositoryList
    """
    return 'do some magic!'


def get_repository(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get Repository

    Returns an repository by its id # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param repository_id: Identifier of the repository
    :type repository_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: Repository
    """
    return 'do some magic!'
