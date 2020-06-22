/*
 * MissingParameter.h
 *
 * 
 */

#ifndef _MissingParameter_H_
#define _MissingParameter_H_


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

class MissingParameter : public Object {
public:
	/*! \brief Constructor.
	 */
	MissingParameter();
	MissingParameter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MissingParameter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the missing parameter.
	 */
	std::string getName();

	/*! \brief Set Name of the missing parameter.
	 */
	void setName(std::string  name);
	/*! \brief Get Type of the missing parameter.
	 */
	std::string getType();

	/*! \brief Set Type of the missing parameter.
	 */
	void setType(std::string  type);

private:
	std::string name;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MissingParameter_H_ */
