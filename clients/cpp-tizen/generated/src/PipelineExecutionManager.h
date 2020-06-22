#ifndef _PipelineExecutionManager_H_
#define _PipelineExecutionManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "PipelineExecution.h"
#include "PipelineExecutionListRepresentation.h"
#include "PipelineExecutionStepState.h"
#include "PipelineStepMetrics.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup PipelineExecution PipelineExecution
 * \ingroup Operations
 *  @{
 */
class PipelineExecutionManager {
public:
	PipelineExecutionManager();
	virtual ~PipelineExecutionManager();

/*! \brief Advance. *Synchronous*
 *
 * Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body Input for advance. See documentation for details. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advancePipelineExecutionSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Advance. *Asynchronous*
 *
 * Post to this url in order to advance the current pipeline execution, if paused and waiting for user interaction. Link is present in output only in that case. The input depends on the actual reason for which the pipeline execution stopped.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body Input for advance. See documentation for details. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool advancePipelineExecutionAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Cancel. *Synchronous*
 *
 * Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body Input for advance. See documentation for details. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelPipelineExecutionStepSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Cancel. *Asynchronous*
 *
 * Post to this url in order to cancel the current pipeline execution. Link is present in output only in that case.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body Input for advance. See documentation for details. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool cancelPipelineExecutionStepAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::string body, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get current pipeline execution. *Synchronous*
 *
 * Returns current pipeline execution if any.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCurrentExecutionSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData);

/*! \brief Get current pipeline execution. *Asynchronous*
 *
 * Returns current pipeline execution if any.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getCurrentExecutionAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData);


/*! \brief Get pipeline execution. *Synchronous*
 *
 * Returns a pipeline execution by id
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getExecutionSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData);

/*! \brief Get pipeline execution. *Asynchronous*
 *
 * Returns a pipeline execution by id
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getExecutionAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecution, Error, void* )
	, void* userData);


/*! \brief List Executions. *Synchronous*
 *
 * Returns the history of pipeline executions in a newest to oldest order
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param start Pagination start parameter
 * \param limit Pagination limit parameter
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getExecutionsSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string start, int limit, 
	void(* handler)(PipelineExecutionListRepresentation, Error, void* )
	, void* userData);

/*! \brief List Executions. *Asynchronous*
 *
 * Returns the history of pipeline executions in a newest to oldest order
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param start Pagination start parameter
 * \param limit Pagination limit parameter
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getExecutionsAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string start, int limit, 
	void(* handler)(PipelineExecutionListRepresentation, Error, void* )
	, void* userData);


/*! \brief Get logs. *Synchronous*
 *
 * Get the logs associated with a step.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param file Identifier of the log file
 * \param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStepLogsSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string file, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Get logs. *Asynchronous*
 *
 * Get the logs associated with a step.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param file Identifier of the log file
 * \param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getStepLogsAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string file, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Start the pipeline. *Synchronous*
 *
 * Starts the Pipeline. This works only if the pipeline is not already started.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool startPipelineSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Start the pipeline. *Asynchronous*
 *
 * Starts the Pipeline. This works only if the pipeline is not already started.
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool startPipelineAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get step metrics. *Synchronous*
 *
 * 
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool stepMetricSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineStepMetrics, Error, void* )
	, void* userData);

/*! \brief Get step metrics. *Asynchronous*
 *
 * 
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool stepMetricAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineStepMetrics, Error, void* )
	, void* userData);


/*! \brief Get step state. *Synchronous*
 *
 * 
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool stepStateSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecutionStepState, Error, void* )
	, void* userData);

/*! \brief Get step state. *Asynchronous*
 *
 * 
 * \param programId Identifier of the program. *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param executionId Identifier of the execution *Required*
 * \param phaseId Identifier of the phase *Required*
 * \param stepId Identifier of the step *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool stepStateAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string executionId, std::string phaseId, std::string stepId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineExecutionStepState, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://cloudmanager.adobe.io";
	}
};
/** @}*/

}
}
#endif /* PipelineExecutionManager_H_ */
