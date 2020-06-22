/*
 * BranchList__embedded.h
 *
 * 
 */

#ifndef _BranchList__embedded_H_
#define _BranchList__embedded_H_


#include <string>
#include "RepositoryBranch.h"
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

class BranchList__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	BranchList__embedded();
	BranchList__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BranchList__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<RepositoryBranch> getBranches();

	/*! \brief Set 
	 */
	void setBranches(std::list <RepositoryBranch> branches);

private:
	std::list <RepositoryBranch>branches;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BranchList__embedded_H_ */
