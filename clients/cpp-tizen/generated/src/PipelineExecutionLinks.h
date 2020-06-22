/*
 * PipelineExecution__links.h
 *
 * 
 */

#ifndef _PipelineExecution__links_H_
#define _PipelineExecution__links_H_


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

class PipelineExecution__links : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecution__links();
	PipelineExecution__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecution__links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelprogram();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpipeline();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipeline(HalLink  httpnsadobecomadobecloudrelpipeline);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink httpnsadobecomadobecloudrelprogram;
	HalLink httpnsadobecomadobecloudrelpipeline;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecution__links_H_ */
