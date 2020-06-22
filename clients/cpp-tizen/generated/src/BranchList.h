/*
 * BranchList.h
 *
 * 
 */

#ifndef _BranchList_H_
#define _BranchList_H_


#include <string>
#include "BranchList__embedded.h"
#include "ProgramList__links.h"
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

class BranchList : public Object {
public:
	/*! \brief Constructor.
	 */
	BranchList();
	BranchList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BranchList();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getTotalNumberOfItems();

	/*! \brief Set 
	 */
	void setTotalNumberOfItems(int  _totalNumberOfItems);
	/*! \brief Get 
	 */
	BranchList__embedded getEmbedded();

	/*! \brief Set 
	 */
	void setEmbedded(BranchList__embedded  _embedded);
	/*! \brief Get 
	 */
	ProgramList__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(ProgramList__links  _links);

private:
	int _totalNumberOfItems;
	BranchList__embedded _embedded;
	ProgramList__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BranchList_H_ */
