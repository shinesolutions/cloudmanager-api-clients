/*
 * RepositoryBranch.h
 *
 * Represents a Git Branch
 */

#ifndef _RepositoryBranch_H_
#define _RepositoryBranch_H_


#include <string>
#include "RepositoryBranch__links.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a Git Branch
 *
 *  \ingroup Models
 *
 */

class RepositoryBranch : public Object {
public:
	/*! \brief Constructor.
	 */
	RepositoryBranch();
	RepositoryBranch(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RepositoryBranch();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Identifier of the program. Unique within the space
	 */
	std::string getProgramId();

	/*! \brief Set Identifier of the program. Unique within the space
	 */
	void setProgramId(std::string  programId);
	/*! \brief Get Identifier of the repository
	 */
	long long getRepositoryId();

	/*! \brief Set Identifier of the repository
	 */
	void setRepositoryId(long long  repositoryId);
	/*! \brief Get Name of the branch
	 */
	std::string getName();

	/*! \brief Set Name of the branch
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	RepositoryBranch__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(RepositoryBranch__links  _links);

private:
	std::string programId;
	long long repositoryId;
	std::string name;
	RepositoryBranch__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RepositoryBranch_H_ */
