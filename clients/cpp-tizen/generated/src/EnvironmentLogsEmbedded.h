/*
 * EnvironmentLogs__embedded.h
 *
 * 
 */

#ifndef _EnvironmentLogs__embedded_H_
#define _EnvironmentLogs__embedded_H_


#include <string>
#include "EnvironmentLog.h"
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

class EnvironmentLogs__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	EnvironmentLogs__embedded();
	EnvironmentLogs__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnvironmentLogs__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Links to logs
	 */
	std::list<EnvironmentLog> getDownloads();

	/*! \brief Set Links to logs
	 */
	void setDownloads(std::list <EnvironmentLog> downloads);

private:
	std::list <EnvironmentLog>downloads;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EnvironmentLogs__embedded_H_ */
