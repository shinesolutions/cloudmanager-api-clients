import connexion
import six

from openapi_server.models.pipeline_execution import PipelineExecution  # noqa: E501
from openapi_server.models.pipeline_execution_list_representation import PipelineExecutionListRepresentation  # noqa: E501
from openapi_server.models.pipeline_execution_step_state import PipelineExecutionStepState  # noqa: E501
from openapi_server.models.pipeline_step_metrics import PipelineStepMetrics  # noqa: E501
from openapi_server import util


def advance_pipeline_execution(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body):  # noqa: E501
    """Advance

    Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped. # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param execution_id: Identifier of the execution
    :type execution_id: str
    :param phase_id: Identifier of the phase
    :type phase_id: str
    :param step_id: Identifier of the step
    :type step_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param content_type: Must always be application/json
    :type content_type: str
    :param body: Input for advance. See documentation for details.
    :type body: 

    :rtype: None
    """
    return 'do some magic!'


def cancel_pipeline_execution_step(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, content_type, body):  # noqa: E501
    """Cancel

    Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case. # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param execution_id: Identifier of the execution
    :type execution_id: str
    :param phase_id: Identifier of the phase
    :type phase_id: str
    :param step_id: Identifier of the step
    :type step_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param content_type: Must always be application/json
    :type content_type: str
    :param body: Input for advance. See documentation for details.
    :type body: 

    :rtype: None
    """
    return 'do some magic!'


def get_current_execution(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get current pipeline execution

    Returns current pipeline execution if any. # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: PipelineExecution
    """
    return 'do some magic!'


def get_execution(program_id, pipeline_id, execution_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get pipeline execution

    Returns a pipeline execution by id # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param execution_id: Identifier of the execution
    :type execution_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: PipelineExecution
    """
    return 'do some magic!'


def get_executions(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, start=None, limit=None):  # noqa: E501
    """List Executions

    Returns the history of pipeline executions in a newest to oldest order # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param start: Pagination start parameter
    :type start: str
    :param limit: Pagination limit parameter
    :type limit: int

    :rtype: PipelineExecutionListRepresentation
    """
    return 'do some magic!'


def get_step_logs(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key, file=None, accept=None):  # noqa: E501
    """Get logs

    Get the logs associated with a step. # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param execution_id: Identifier of the execution
    :type execution_id: str
    :param phase_id: Identifier of the phase
    :type phase_id: str
    :param step_id: Identifier of the step
    :type step_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str
    :param file: Identifier of the log file
    :type file: str
    :param accept: Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
    :type accept: str

    :rtype: None
    """
    return 'do some magic!'


def start_pipeline(program_id, pipeline_id, x_gw_ims_org_id, authorization, x_api_key, content_type):  # noqa: E501
    """Start the pipeline

    Starts the Pipeline. This works only if the pipeline is not already started. # noqa: E501

    :param program_id: Identifier of the program.
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

    :rtype: None
    """
    return 'do some magic!'


def step_metric(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get step metrics

     # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param execution_id: Identifier of the execution
    :type execution_id: str
    :param phase_id: Identifier of the phase
    :type phase_id: str
    :param step_id: Identifier of the step
    :type step_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: PipelineStepMetrics
    """
    return 'do some magic!'


def step_state(program_id, pipeline_id, execution_id, phase_id, step_id, x_gw_ims_org_id, authorization, x_api_key):  # noqa: E501
    """Get step state

     # noqa: E501

    :param program_id: Identifier of the program.
    :type program_id: str
    :param pipeline_id: Identifier of the pipeline
    :type pipeline_id: str
    :param execution_id: Identifier of the execution
    :type execution_id: str
    :param phase_id: Identifier of the phase
    :type phase_id: str
    :param step_id: Identifier of the step
    :type step_id: str
    :param x_gw_ims_org_id: IMS organization ID that the request is being made under.
    :type x_gw_ims_org_id: str
    :param authorization: Bearer [token] - An access token for the technical account created through integration with Adobe IO
    :type authorization: str
    :param x_api_key: IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io
    :type x_api_key: str

    :rtype: PipelineExecutionStepState
    """
    return 'do some magic!'
