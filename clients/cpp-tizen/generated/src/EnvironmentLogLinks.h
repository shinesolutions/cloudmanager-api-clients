/*
 * EnvironmentLog__links.h
 *
 * 
 */

#ifndef _EnvironmentLog__links_H_
#define _EnvironmentLog__links_H_


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

class EnvironmentLog__links : public Object {
public:
	/*! \brief Constructor.
	 */
	EnvironmentLog__links();
	EnvironmentLog__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnvironmentLog__links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrellogsdownload();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrellogsdownload(HalLink  httpnsadobecomadobecloudrellogsdownload);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrellogstail();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrellogstail(HalLink  httpnsadobecomadobecloudrellogstail);

private:
	HalLink httpnsadobecomadobecloudrellogsdownload;
	HalLink httpnsadobecomadobecloudrellogstail;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EnvironmentLog__links_H_ */
