#ifndef _RepositoriesManager_H_
#define _RepositoriesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Repository.h"
#include "RepositoryList.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Repositories Repositories
 * \ingroup Operations
 *  @{
 */
class RepositoriesManager {
public:
	RepositoriesManager();
	virtual ~RepositoriesManager();

/*! \brief Lists Repositories. *Synchronous*
 *
 * Lists all Repositories in an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRepositoriesSync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(RepositoryList, Error, void* )
	, void* userData);

/*! \brief Lists Repositories. *Asynchronous*
 *
 * Lists all Repositories in an program
 * \param programId Identifier of the program *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRepositoriesAsync(char * accessToken,
	std::string programId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(RepositoryList, Error, void* )
	, void* userData);


/*! \brief Get Repository. *Synchronous*
 *
 * Returns an repository by its id
 * \param programId Identifier of the program *Required*
 * \param repositoryId Identifier of the repository *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRepositorySync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Repository, Error, void* )
	, void* userData);

/*! \brief Get Repository. *Asynchronous*
 *
 * Returns an repository by its id
 * \param programId Identifier of the program *Required*
 * \param repositoryId Identifier of the repository *Required*
 * \param xGwImsOrgId IMS organization ID that the request is being made under. *Required*
 * \param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO *Required*
 * \param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getRepositoryAsync(char * accessToken,
	std::string programId, std::string repositoryId, std::string xGwImsOrgId, std::string authorization, std::string xApiKey, 
	void(* handler)(Repository, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://cloudmanager.adobe.io";
	}
};
/** @}*/

}
}
#endif /* RepositoriesManager_H_ */
