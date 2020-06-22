/*
 * Program.h
 *
 * Describes a __Program__
 */

#ifndef _Program_H_
#define _Program_H_


#include <string>
#include "Program__links.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes a __Program__
 *
 *  \ingroup Models
 *
 */

class Program : public Object {
public:
	/*! \brief Constructor.
	 */
	Program();
	Program(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Program();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Identifier of the program. Unique within the space.
	 */
	std::string getId();

	/*! \brief Set Identifier of the program. Unique within the space.
	 */
	void setId(std::string  id);
	/*! \brief Get Name of the program
	 */
	std::string getName();

	/*! \brief Set Name of the program
	 */
	void setName(std::string  name);
	/*! \brief Get Whether this Program has been enabled for Cloud Manager usage
	 */
	bool getEnabled();

	/*! \brief Set Whether this Program has been enabled for Cloud Manager usage
	 */
	void setEnabled(bool  enabled);
	/*! \brief Get Tenant Id
	 */
	std::string getTenantId();

	/*! \brief Set Tenant Id
	 */
	void setTenantId(std::string  tenantId);
	/*! \brief Get Organisation Id
	 */
	std::string getImsOrgId();

	/*! \brief Set Organisation Id
	 */
	void setImsOrgId(std::string  imsOrgId);
	/*! \brief Get 
	 */
	Program__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(Program__links  _links);

private:
	std::string id;
	std::string name;
	bool enabled;
	std::string tenantId;
	std::string imsOrgId;
	Program__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Program_H_ */
