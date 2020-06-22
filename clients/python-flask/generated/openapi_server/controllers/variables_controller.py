import connexion
import six

from openapi_server.models.variable import Variable  # noqa: E501
from openapi_server.models.variable_list import VariableList  # noqa: E501
from openapi_server import util


def get_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """List User Environment Variables

    List the user defined variables for an environment (Cloud Service only). # noqa: E501

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

    :rtype: VariableList
    """
    return 'do some magic!'


def patch_environment_variables(program_id, environment_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body):  # noqa: E501
    """Patch User Environment Variables

    Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value. # noqa: E501

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
    :param content_type: Must always be application/json
    :type content_type: str
    :param body: The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing.
    :type body: list | bytes

    :rtype: VariableList
    """
    if connexion.request.is_json:
        body = [Variable.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'
