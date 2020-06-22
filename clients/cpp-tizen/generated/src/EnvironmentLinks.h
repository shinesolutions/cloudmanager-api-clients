/*
 * Environment__links.h
 *
 * 
 */

#ifndef _Environment__links_H_
#define _Environment__links_H_


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

class Environment__links : public Object {
public:
	/*! \brief Constructor.
	 */
	Environment__links();
	Environment__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Environment__links();

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
	HalLink getHttpnsadobecomadobecloudrelpipeline();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipeline(HalLink  httpnsadobecomadobecloudrelpipeline);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelauthor();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelauthor(HalLink  httpnsadobecomadobecloudrelauthor);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpublish();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpublish(HalLink  httpnsadobecomadobecloudrelpublish);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudreldeveloperConsole();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudreldeveloperConsole(HalLink  httpnsadobecomadobecloudreldeveloperConsole);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrellogs();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrellogs(HalLink  httpnsadobecomadobecloudrellogs);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelvariables();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelvariables(HalLink  httpnsadobecomadobecloudrelvariables);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink httpnsadobecomadobecloudrelprogram;
	HalLink httpnsadobecomadobecloudrelpipeline;
	HalLink httpnsadobecomadobecloudrelauthor;
	HalLink httpnsadobecomadobecloudrelpublish;
	HalLink httpnsadobecomadobecloudreldeveloperConsole;
	HalLink httpnsadobecomadobecloudrellogs;
	HalLink httpnsadobecomadobecloudrelvariables;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Environment__links_H_ */
