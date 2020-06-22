/*
 * RepositoryList__embedded.h
 *
 * 
 */

#ifndef _RepositoryList__embedded_H_
#define _RepositoryList__embedded_H_


#include <string>
#include "Repository.h"
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

class RepositoryList__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	RepositoryList__embedded();
	RepositoryList__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RepositoryList__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Repository> getRepositories();

	/*! \brief Set 
	 */
	void setRepositories(std::list <Repository> repositories);

private:
	std::list <Repository>repositories;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RepositoryList__embedded_H_ */
