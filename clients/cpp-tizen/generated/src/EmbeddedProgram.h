/*
 * EmbeddedProgram.h
 *
 * Describes an __Embedded Program__
 */

#ifndef _EmbeddedProgram_H_
#define _EmbeddedProgram_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes an __Embedded Program__
 *
 *  \ingroup Models
 *
 */

class EmbeddedProgram : public Object {
public:
	/*! \brief Constructor.
	 */
	EmbeddedProgram();
	EmbeddedProgram(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EmbeddedProgram();

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

private:
	std::string id;
	std::string name;
	bool enabled;
	std::string tenantId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EmbeddedProgram_H_ */
