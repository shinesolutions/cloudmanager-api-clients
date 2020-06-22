/*
 * Environment.h
 *
 * An Environment that 
 */

#ifndef _Environment_H_
#define _Environment_H_


#include <string>
#include "Environment__links.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An Environment that 
 *
 *  \ingroup Models
 *
 */

class Environment : public Object {
public:
	/*! \brief Constructor.
	 */
	Environment();
	Environment(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Environment();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get id
	 */
	std::string getId();

	/*! \brief Set id
	 */
	void setId(std::string  id);
	/*! \brief Get Identifier of the program. Unique within the space.
	 */
	std::string getProgramId();

	/*! \brief Set Identifier of the program. Unique within the space.
	 */
	void setProgramId(std::string  programId);
	/*! \brief Get Name of the environment
	 */
	std::string getName();

	/*! \brief Set Name of the environment
	 */
	void setName(std::string  name);
	/*! \brief Get Description of the environment
	 */
	std::string getDescription();

	/*! \brief Set Description of the environment
	 */
	void setDescription(std::string  description);
	/*! \brief Get Type of the environment
	 */
	std::string getType();

	/*! \brief Set Type of the environment
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	Environment__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(Environment__links  _links);

private:
	std::string id;
	std::string programId;
	std::string name;
	std::string description;
	std::string type;
	Environment__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Environment_H_ */
