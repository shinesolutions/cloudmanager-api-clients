/*
 * VariableList__embedded.h
 *
 * 
 */

#ifndef _VariableList__embedded_H_
#define _VariableList__embedded_H_


#include <string>
#include "Variable.h"
#include <list>
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

class VariableList__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	VariableList__embedded();
	VariableList__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VariableList__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Variables set on environment
	 */
	std::list<Variable> getVariables();

	/*! \brief Set Variables set on environment
	 */
	void setVariables(std::list <Variable> variables);

private:
	std::list <Variable>variables;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VariableList__embedded_H_ */
