/*
 * EnvironmentLogs.h
 *
 * Logs of an Environment
 */

#ifndef _EnvironmentLogs_H_
#define _EnvironmentLogs_H_


#include <string>
#include "EnvironmentLogs__embedded.h"
#include "EnvironmentLogs__links.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Logs of an Environment
 *
 *  \ingroup Models
 *
 */

class EnvironmentLogs : public Object {
public:
	/*! \brief Constructor.
	 */
	EnvironmentLogs();
	EnvironmentLogs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnvironmentLogs();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the service
	 */
	std::list<std::string> getService();

	/*! \brief Set Name of the service
	 */
	void setService(std::list <std::string> service);
	/*! \brief Get Name of the Log
	 */
	std::list<std::string> getName();

	/*! \brief Set Name of the Log
	 */
	void setName(std::list <std::string> name);
	/*! \brief Get Number of days
	 */
	int getDays();

	/*! \brief Set Number of days
	 */
	void setDays(int  days);
	/*! \brief Get 
	 */
	EnvironmentLogs__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(EnvironmentLogs__links  _links);
	/*! \brief Get 
	 */
	EnvironmentLogs__embedded getEmbedded();

	/*! \brief Set 
	 */
	void setEmbedded(EnvironmentLogs__embedded  _embedded);

private:
	std::list <std::string>service;
	std::list <std::string>name;
	int days;
	EnvironmentLogs__links _links;
	EnvironmentLogs__embedded _embedded;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EnvironmentLogs_H_ */
