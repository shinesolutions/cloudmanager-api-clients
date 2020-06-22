/*
 * Pipeline__links.h
 *
 * 
 */

#ifndef _Pipeline__links_H_
#define _Pipeline__links_H_


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

class Pipeline__links : public Object {
public:
	/*! \brief Constructor.
	 */
	Pipeline__links();
	Pipeline__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pipeline__links();

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
	HalLink getHttpnsadobecomadobecloudrelexecution();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelexecution(HalLink  httpnsadobecomadobecloudrelexecution);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelexecutions();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelexecutions(HalLink  httpnsadobecomadobecloudrelexecutions);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelrollbackLastSuccessfulExecution();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelrollbackLastSuccessfulExecution(HalLink  httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink httpnsadobecomadobecloudrelprogram;
	HalLink httpnsadobecomadobecloudrelexecution;
	HalLink httpnsadobecomadobecloudrelexecutions;
	HalLink httpnsadobecomadobecloudrelrollbackLastSuccessfulExecution;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pipeline__links_H_ */
