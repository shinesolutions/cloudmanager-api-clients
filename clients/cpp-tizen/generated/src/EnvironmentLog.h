/*
 * EnvironmentLog.h
 *
 * Log from Environment
 */

#ifndef _EnvironmentLog_H_
#define _EnvironmentLog_H_


#include <string>
#include "EnvironmentLog__links.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Log from Environment
 *
 *  \ingroup Models
 *
 */

class EnvironmentLog : public Object {
public:
	/*! \brief Constructor.
	 */
	EnvironmentLog();
	EnvironmentLog(char* str);

	/*! \brief Destructor.
	 */
	virtual ~EnvironmentLog();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the service
	 */
	std::string getService();

	/*! \brief Set Name of the service
	 */
	void setService(std::string  service);
	/*! \brief Get Name of the Log
	 */
	std::string getName();

	/*! \brief Set Name of the Log
	 */
	void setName(std::string  name);
	/*! \brief Get date of the Log
	 */
	std::string getDate();

	/*! \brief Set date of the Log
	 */
	void setDate(std::string  date);
	/*! \brief Get 
	 */
	long long getProgramId();

	/*! \brief Set 
	 */
	void setProgramId(long long  programId);
	/*! \brief Get 
	 */
	long long getEnvironmentId();

	/*! \brief Set 
	 */
	void setEnvironmentId(long long  environmentId);
	/*! \brief Get 
	 */
	EnvironmentLog__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(EnvironmentLog__links  _links);

private:
	std::string service;
	std::string name;
	std::string date;
	long long programId;
	long long environmentId;
	EnvironmentLog__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _EnvironmentLog_H_ */
