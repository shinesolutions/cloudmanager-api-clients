/*
 * Repository.h
 *
 * A sourcecode repository
 */

#ifndef _Repository_H_
#define _Repository_H_


#include <string>
#include "Repository__links.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A sourcecode repository
 *
 *  \ingroup Models
 *
 */

class Repository : public Object {
public:
	/*! \brief Constructor.
	 */
	Repository();
	Repository(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Repository();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Repository name
	 */
	std::string getRepo();

	/*! \brief Set Repository name
	 */
	void setRepo(std::string  repo);
	/*! \brief Get description
	 */
	std::string getDescription();

	/*! \brief Set description
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	Repository__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(Repository__links  _links);

private:
	std::string repo;
	std::string description;
	Repository__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Repository_H_ */
