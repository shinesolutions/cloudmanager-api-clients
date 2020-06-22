#ifndef _BranchesManager_H_
#define _BranchesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "BranchList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Branches Branches
 * \ingroup Operations
 *  @{
 */
class BranchesManager {
public:
	BranchesManager();
	virtual ~BranchesManager();

/*! \brief List Branches. *Synchronous*
 *
 * Returns the list of branches from a repository
 * \param programId Identifier of the program. *Required*
 * \param repositoryId Identifier of the repository *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBranchesSync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(BranchList, Error, void* )
	, void* userData);

/*! \brief List Branches. *Asynchronous*
 *
 * Returns the list of branches from a repository
 * \param programId Identifier of the program. *Required*
 * \param repositoryId Identifier of the repository *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getBranchesAsync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(BranchList, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://cloudmanager.adobe.io";
	}
};
/** @}*/

}
}
#endif /* BranchesManager_H_ */
