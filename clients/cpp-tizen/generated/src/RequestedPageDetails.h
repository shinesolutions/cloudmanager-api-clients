/*
 * RequestedPageDetails.h
 *
 * Filtering and sorting page details
 */

#ifndef _RequestedPageDetails_H_
#define _RequestedPageDetails_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Filtering and sorting page details
 *
 *  \ingroup Models
 *
 */

class RequestedPageDetails : public Object {
public:
	/*! \brief Constructor.
	 */
	RequestedPageDetails();
	RequestedPageDetails(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RequestedPageDetails();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getStart();

	/*! \brief Set 
	 */
	void setStart(int  start);
	/*! \brief Get 
	 */
	int getLimit();

	/*! \brief Set 
	 */
	void setLimit(int  limit);
	/*! \brief Get 
	 */
	std::string getOrderBy();

	/*! \brief Set 
	 */
	void setOrderBy(std::string  orderBy);
	/*! \brief Get 
	 */
	std::list<std::string> getProperty();

	/*! \brief Set 
	 */
	void setProperty(std::list <std::string> property);
	/*! \brief Get 
	 */
	std::string getType();

	/*! \brief Set 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	int getNext();

	/*! \brief Set 
	 */
	void setNext(int  next);
	/*! \brief Get 
	 */
	int getPrev();

	/*! \brief Set 
	 */
	void setPrev(int  prev);

private:
	int start;
	int limit;
	std::string orderBy;
	std::list <std::string>property;
	std::string type;
	int next;
	int prev;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RequestedPageDetails_H_ */
