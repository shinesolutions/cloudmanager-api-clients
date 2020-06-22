/*
 * Repository__links.h
 *
 * 
 */

#ifndef _Repository__links_H_
#define _Repository__links_H_


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

class Repository__links : public Object {
public:
	/*! \brief Constructor.
	 */
	Repository__links();
	Repository__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Repository__links();

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
	HalLink getHttpnsadobecomadobecloudrelbranches();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelbranches(HalLink  httpnsadobecomadobecloudrelbranches);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink httpnsadobecomadobecloudrelprogram;
	HalLink httpnsadobecomadobecloudrelbranches;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Repository__links_H_ */
