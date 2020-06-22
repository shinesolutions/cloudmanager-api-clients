/*
 * PipelineExecutionListRepresentation__links.h
 *
 * 
 */

#ifndef _PipelineExecutionListRepresentation__links_H_
#define _PipelineExecutionListRepresentation__links_H_


#include <string>
#include "HalLink.h"
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

class PipelineExecutionListRepresentation__links : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecutionListRepresentation__links();
	PipelineExecutionListRepresentation__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecutionListRepresentation__links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	HalLink getNext();

	/*! \brief Set 
	 */
	void setNext(HalLink  next);
	/*! \brief Get 
	 */
	HalLink getPage();

	/*! \brief Set 
	 */
	void setPage(HalLink  page);
	/*! \brief Get 
	 */
	HalLink getPrev();

	/*! \brief Set 
	 */
	void setPrev(HalLink  prev);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink next;
	HalLink page;
	HalLink prev;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecutionListRepresentation__links_H_ */
