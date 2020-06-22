#ifndef _PipelinesManager_H_
#define _PipelinesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Pipeline.h"
#include "PipelineList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Pipelines Pipelines
 * \ingroup Operations
 *  @{
 */
class PipelinesManager {
public:
	PipelinesManager();
	virtual ~PipelinesManager();

/*! \brief Delete a Pipeline. *Synchronous*
 *
 * Delete a pipeline. All the data is wiped.
 * \param programId Identifier of the program *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deletePipelineSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete a Pipeline. *Asynchronous*
 *
 * Delete a pipeline. All the data is wiped.
 * \param programId Identifier of the program *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deletePipelineAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get Pipeline. *Synchronous*
 *
 * Returns a pipeline by its id
 * \param programId Identifier of the program *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPipelineSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Pipeline, Error, void* )
	, void* userData);

/*! \brief Get Pipeline. *Asynchronous*
 *
 * Returns a pipeline by its id
 * \param programId Identifier of the program *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPipelineAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Pipeline, Error, void* )
	, void* userData);


/*! \brief List Pipelines. *Synchronous*
 *
 * Returns all the pipelines that the requesting user has access to in an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPipelinesSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineList, Error, void* )
	, void* userData);

/*! \brief List Pipelines. *Asynchronous*
 *
 * Returns all the pipelines that the requesting user has access to in an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPipelinesAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(PipelineList, Error, void* )
	, void* userData);


/*! \brief Patches Pipeline. *Synchronous*
 *
 * Patches a pipeline within an program.
 * \param programId Identifier of the program *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body The updated Pipeline *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool patchPipelineSync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, Pipeline body, 
	void(* handler)(Pipeline, Error, void* )
	, void* userData);

/*! \brief Patches Pipeline. *Asynchronous*
 *
 * Patches a pipeline within an program.
 * \param programId Identifier of the program *Required*
 * \param pipelineId Identifier of the pipeline *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body The updated Pipeline *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool patchPipelineAsync(char * accessToken,
	std::string programId, std::string pipelineId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, Pipeline body, 
	void(* handler)(Pipeline, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://cloudmanager.adobe.io";
	}
};
/** @}*/

}
}
#endif /* PipelinesManager_H_ */
