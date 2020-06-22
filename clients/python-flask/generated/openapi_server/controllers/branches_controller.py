import connexion
import six

from openapi_server.models.branch_list import BranchList  # noqa: E501
from openapi_server import util


def get_branches(program_id, repository_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """List Branches

    Returns the list of branches from a repository # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param repository_id: Identifier of the repository
    :type repository_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: BranchList
    """
    return 'do some magic!'
