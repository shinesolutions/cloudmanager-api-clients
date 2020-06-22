/*
 * ProgramList__embedded.h
 *
 * 
 */

#ifndef _ProgramList__embedded_H_
#define _ProgramList__embedded_H_


#include <string>
#include "EmbeddedProgram.h"
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

class ProgramList__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	ProgramList__embedded();
	ProgramList__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProgramList__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<EmbeddedProgram> getPrograms();

	/*! \brief Set 
	 */
	void setPrograms(std::list <EmbeddedProgram> programs);

private:
	std::list <EmbeddedProgram>programs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProgramList__embedded_H_ */
