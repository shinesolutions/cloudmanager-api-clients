#ifndef _VariablesManager_H_
#define _VariablesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Variable.h"
#include "VariableList.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Variables Variables
 * \ingroup Operations
 *  @{
 */
class VariablesManager {
public:
	VariablesManager();
	virtual ~VariablesManager();

/*! \brief List User Environment Variables. *Synchronous*
 *
 * List the user defined variables for an environment (Cloud Service only).
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentVariablesSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(VariableList, Error, void* )
	, void* userData);

/*! \brief List User Environment Variables. *Asynchronous*
 *
 * List the user defined variables for an environment (Cloud Service only).
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentVariablesAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(VariableList, Error, void* )
	, void* userData);


/*! \brief Patch User Environment Variables. *Synchronous*
 *
 * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool patchEnvironmentVariablesSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::list<Variable> body, 
	void(* handler)(VariableList, Error, void* )
	, void* userData);

/*! \brief Patch User Environment Variables. *Asynchronous*
 *
 * Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param contentType Must always be application/json *Required*
 * \param body The list of variables to add, modify, or remove. It is not necessary to send variables here which are not changing. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool patchEnvironmentVariablesAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string contentType, std::list<Variable> body, 
	void(* handler)(VariableList, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://cloudmanager.adobe.io";
	}
};
/** @}*/

}
}
#endif /* VariablesManager_H_ */
