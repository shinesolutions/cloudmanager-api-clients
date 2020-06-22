/*
 * PipelineExecutionListRepresentation.h
 *
 * List of pipeline executions
 */

#ifndef _PipelineExecutionListRepresentation_H_
#define _PipelineExecutionListRepresentation_H_


#include <string>
#include "PipelineExecutionListRepresentation__embedded.h"
#include "PipelineExecutionListRepresentation__links.h"
#include "RequestedPageDetails.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief List of pipeline executions
 *
 *  \ingroup Models
 *
 */

class PipelineExecutionListRepresentation : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecutionListRepresentation();
	PipelineExecutionListRepresentation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecutionListRepresentation();

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
	RequestedPageDetails getPage();

	/*! \brief Set 
	 */
	void setPage(RequestedPageDetails  _page);
	/*! \brief Get 
	 */
	PipelineExecutionListRepresentation__embedded getEmbedded();

	/*! \brief Set 
	 */
	void setEmbedded(PipelineExecutionListRepresentation__embedded  _embedded);
	/*! \brief Get 
	 */
	PipelineExecutionListRepresentation__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(PipelineExecutionListRepresentation__links  _links);

private:
	int _totalNumberOfItems;
	RequestedPageDetails _page;
	PipelineExecutionListRepresentation__embedded _embedded;
	PipelineExecutionListRepresentation__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecutionListRepresentation_H_ */
