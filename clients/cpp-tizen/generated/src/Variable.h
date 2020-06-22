/*
 * Variable.h
 *
 * A named value than can be set on an Environment
 */

#ifndef _Variable_H_
#define _Variable_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A named value than can be set on an Environment
 *
 *  \ingroup Models
 *
 */

class Variable : public Object {
public:
	/*! \brief Constructor.
	 */
	Variable();
	Variable(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Variable();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
	 */
	std::string getName();

	/*! \brief Set Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
	 */
	void setName(std::string  name);
	/*! \brief Get Value of the variable. Read-Write for non-secrets, write-only for secrets.
	 */
	std::string getValue();

	/*! \brief Set Value of the variable. Read-Write for non-secrets, write-only for secrets.
	 */
	void setValue(std::string  value);
	/*! \brief Get Type of the variable. Default `string` if missing. Cannot be changed after creation.
	 */
	std::string getType();

	/*! \brief Set Type of the variable. Default `string` if missing. Cannot be changed after creation.
	 */
	void setType(std::string  type);

private:
	std::string name;
	std::string value;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Variable_H_ */
