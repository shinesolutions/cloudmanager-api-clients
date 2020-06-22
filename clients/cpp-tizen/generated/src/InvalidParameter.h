/*
 * InvalidParameter.h
 *
 * 
 */

#ifndef _InvalidParameter_H_
#define _InvalidParameter_H_


#include <string>
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

class InvalidParameter : public Object {
public:
	/*! \brief Constructor.
	 */
	InvalidParameter();
	InvalidParameter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InvalidParameter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the invalid parameter.
	 */
	std::string getName();

	/*! \brief Set Name of the invalid parameter.
	 */
	void setName(std::string  name);
	/*! \brief Get Reason of why the parameter's value is not accepted.
	 */
	std::string getReason();

	/*! \brief Set Reason of why the parameter's value is not accepted.
	 */
	void setReason(std::string  reason);

private:
	std::string name;
	std::string reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InvalidParameter_H_ */
