/*
 * Program__links.h
 *
 * 
 */

#ifndef _Program__links_H_
#define _Program__links_H_


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

class Program__links : public Object {
public:
	/*! \brief Constructor.
	 */
	Program__links();
	Program__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Program__links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpipelines();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipelines(HalLink  httpnsadobecomadobecloudrelpipelines);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelenvironments();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelenvironments(HalLink  httpnsadobecomadobecloudrelenvironments);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelrepositories();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelrepositories(HalLink  httpnsadobecomadobecloudrelrepositories);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink httpnsadobecomadobecloudrelpipelines;
	HalLink httpnsadobecomadobecloudrelenvironments;
	HalLink httpnsadobecomadobecloudrelrepositories;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Program__links_H_ */
