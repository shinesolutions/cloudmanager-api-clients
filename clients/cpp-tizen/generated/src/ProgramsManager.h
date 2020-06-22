#ifndef _ProgramsManager_H_
#define _ProgramsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Program.h"
#include "ProgramList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Programs Programs
 * \ingroup Operations
 *  @{
 */
class ProgramsManager {
public:
	ProgramsManager();
	virtual ~ProgramsManager();

/*! \brief Delete Program. *Synchronous*
 *
 * Delete an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProgramSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData);

/*! \brief Delete Program. *Asynchronous*
 *
 * Delete an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deleteProgramAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData);


/*! \brief Get Program. *Synchronous*
 *
 * Returns a program by its id
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getProgramSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData);

/*! \brief Get Program. *Asynchronous*
 *
 * Returns a program by its id
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getProgramAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Program, Error, void* )
	, void* userData);


/*! \brief Lists Programs. *Synchronous*
 *
 * Returns all programs that the requesting user has access to
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getProgramsSync(char * accessToken,
	std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(ProgramList, Error, void* )
	, void* userData);

/*! \brief Lists Programs. *Asynchronous*
 *
 * Returns all programs that the requesting user has access to
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getProgramsAsync(char * accessToken,
	std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(ProgramList, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://cloudmanager.adobe.io";
	}
};
/** @}*/

}
}
#endif /* ProgramsManager_H_ */
