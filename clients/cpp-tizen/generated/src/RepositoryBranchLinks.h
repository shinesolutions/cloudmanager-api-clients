/*
 * RepositoryBranch__links.h
 *
 * 
 */

#ifndef _RepositoryBranch__links_H_
#define _RepositoryBranch__links_H_


#include <string>
#include "HalLink.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class RepositoryBranch__links : public Object {
public:
	/*! \brief Constructor.
	 */
	RepositoryBranch__links();
	RepositoryBranch__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RepositoryBranch__links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelprogram();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelrepository();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelrepository(HalLink  httpnsadobecomadobecloudrelrepository);

private:
	HalLink httpnsadobecomadobecloudrelprogram;
	HalLink httpnsadobecomadobecloudrelrepository;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RepositoryBranch__links_H_ */
