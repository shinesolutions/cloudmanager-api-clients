/*
 * VariableList.h
 *
 * 
 */

#ifndef _VariableList_H_
#define _VariableList_H_


#include <string>
#include "VariableList__embedded.h"
#include "VariableList__links.h"
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

class VariableList : public Object {
public:
	/*! \brief Constructor.
	 */
	VariableList();
	VariableList(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VariableList();

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
	VariableList__embedded getEmbedded();

	/*! \brief Set 
	 */
	void setEmbedded(VariableList__embedded  _embedded);
	/*! \brief Get 
	 */
	VariableList__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(VariableList__links  _links);

private:
	int _totalNumberOfItems;
	VariableList__embedded _embedded;
	VariableList__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VariableList_H_ */
