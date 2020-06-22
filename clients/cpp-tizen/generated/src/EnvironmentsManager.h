#ifndef _EnvironmentsManager_H_
#define _EnvironmentsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "BadRequestError.h"
#include "Environment.h"
#include "EnvironmentList.h"
#include "EnvironmentLogs.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Environments Environments
 * \ingroup Operations
 *  @{
 */
class EnvironmentsManager {
public:
	EnvironmentsManager();
	virtual ~EnvironmentsManager();

/*! \brief DeleteEnvironment. *Synchronous*
 *
 * Delete environment
 * \param programId Identifier of the application *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteEnvironmentSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData);

/*! \brief DeleteEnvironment. *Asynchronous*
 *
 * Delete environment
 * \param programId Identifier of the application *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteEnvironmentAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData);


/*! \brief Download Logs. *Synchronous*
 *
 * Download environment logs
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param service Name of service *Required*
 * \param name Name of log *Required*
 * \param date date for which log is required *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool downloadLogsSync(char * accessToken,
	std::string programId, std::string environmentId, std::string service, std::string name, std::string date, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Download Logs. *Asynchronous*
 *
 * Download environment logs
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param service Name of service *Required*
 * \param name Name of log *Required*
 * \param date date for which log is required *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param accept Specify application/json in this header to receive a JSON response. Otherwise, a 307 response code will be returned with a Location header.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool downloadLogsAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string service, std::string name, std::string date, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string accept, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get Environment. *Synchronous*
 *
 * Returns an environment by its id
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentSync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData);

/*! \brief Get Environment. *Asynchronous*
 *
 * Returns an environment by its id
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentAsync(char * accessToken,
	std::string programId, std::string environmentId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Environment, Error, void* )
	, void* userData);


/*! \brief Get Environment Logs. *Synchronous*
 *
 * List all logs available in environment
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param days number of days for which logs are required *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param service Names of services
 * \param name Names of log
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentLogsSync(char * accessToken,
	std::string programId, std::string environmentId, int days, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::list<std::string> service, std::list<std::string> name, 
	void(* handler)(EnvironmentLogs, Error, void* )
	, void* userData);

/*! \brief Get Environment Logs. *Asynchronous*
 *
 * List all logs available in environment
 * \param programId Identifier of the program *Required*
 * \param environmentId Identifier of the environment *Required*
 * \param days number of days for which logs are required *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param service Names of services
 * \param name Names of log
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentLogsAsync(char * accessToken,
	std::string programId, std::string environmentId, int days, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::list<std::string> service, std::list<std::string> name, 
	void(* handler)(EnvironmentLogs, Error, void* )
	, void* userData);


/*! \brief List Environments. *Synchronous*
 *
 * Lists all environments in an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param type Type of the environment
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentsSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string type, 
	void(* handler)(EnvironmentList, Error, void* )
	, void* userData);

/*! \brief List Environments. *Asynchronous*
 *
 * Lists all environments in an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param type Type of the environment
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getEnvironmentsAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, std::string type, 
	void(* handler)(EnvironmentList, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://cloudmanager.adobe.io";
	}
};
/** @}*/

}
}
#endif /* EnvironmentsManager_H_ */
