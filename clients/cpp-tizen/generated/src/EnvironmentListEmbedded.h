/*
 * EnvironmentList__embedded.h
 *
 * 
 */

#ifndef _EnvironmentList__embedded_H_
#define _EnvironmentList__embedded_H_


#include <string>
#include "Environment.h"
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

class EnvironmentList__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	EnvironmentList__embedded();
	EnvironmentList__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnvironmentList__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Environment> getEnvironments();

	/*! \brief Set 
	 */
	void setEnvironments(std::list <Environment> environments);

private:
	std::list <Environment>environments;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EnvironmentList__embedded_H_ */
