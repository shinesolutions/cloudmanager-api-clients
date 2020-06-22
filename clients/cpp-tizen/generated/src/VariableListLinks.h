/*
 * VariableList__links.h
 *
 * 
 */

#ifndef _VariableList__links_H_
#define _VariableList__links_H_


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

class VariableList__links : public Object {
public:
	/*! \brief Constructor.
	 */
	VariableList__links();
	VariableList__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VariableList__links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelenvironment();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelenvironment(HalLink  httpnsadobecomadobecloudrelenvironment);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelprogram();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink httpnsadobecomadobecloudrelenvironment;
	HalLink httpnsadobecomadobecloudrelprogram;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VariableList__links_H_ */
