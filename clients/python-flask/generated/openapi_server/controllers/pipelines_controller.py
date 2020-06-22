import connexion
import six

from openapi_server.models.pipeline import Pipeline  # noqa: E501
from openapi_server.models.pipeline_list import PipelineList  # noqa: E501
from openapi_server import util


def delete_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Delete a Pipeline

    Delete a pipeline. All the data is wiped. # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: None
    """
    return 'do some magic!'


def get_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get Pipeline

    Returns a pipeline by its id # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: Pipeline
    """
    return 'do some magic!'


def get_pipelines(program_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """List Pipelines

    Returns all the pipelines that the requesting user has access to in an program # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: PipelineList
    """
    return 'do some magic!'


def patch_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body):  # noqa: E501
    """Patches Pipeline

    Patches a pipeline within an program. # noqa: E501

    :param program_id: Identifier of the program
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param content_type: Must always be application/json
    :type content_type: str
    :param body: The updated Pipeline
    :type body: dict | bytes

    :rtype: Pipeline
    """
    if connexion.request.is_json:
        body = Pipeline.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
