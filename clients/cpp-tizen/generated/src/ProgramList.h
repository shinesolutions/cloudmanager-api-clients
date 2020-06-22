/*
 * ProgramList.h
 *
 * 
 */

#ifndef _ProgramList_H_
#define _ProgramList_H_


#include <string>
#include "ProgramList__embedded.h"
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

class ProgramList : public Object {
public:
	/*! \brief Constructor.
	 */
	ProgramList();
	ProgramList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProgramList();

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
	ProgramList__embedded getEmbedded();

	/*! \brief Set 
	 */
	void setEmbedded(ProgramList__embedded  _embedded);
	/*! \brief Get 
	 */
	ProgramList__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(ProgramList__links  _links);

private:
	int _totalNumberOfItems;
	ProgramList__embedded _embedded;
	ProgramList__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProgramList_H_ */
