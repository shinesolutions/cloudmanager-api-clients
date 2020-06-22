/*
 * PipelineExecutionStepState__links.h
 *
 * 
 */

#ifndef _PipelineExecutionStepState__links_H_
#define _PipelineExecutionStepState__links_H_


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

class PipelineExecutionStepState__links : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecutionStepState__links();
	PipelineExecutionStepState__links(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecutionStepState__links();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelexecution();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelexecution(HalLink  httpnsadobecomadobecloudrelexecution);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpipeline();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipeline(HalLink  httpnsadobecomadobecloudrelpipeline);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpipelinelogs();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipelinelogs(HalLink  httpnsadobecomadobecloudrelpipelinelogs);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpipelinemetrics();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipelinemetrics(HalLink  httpnsadobecomadobecloudrelpipelinemetrics);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpipelineadvance();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipelineadvance(HalLink  httpnsadobecomadobecloudrelpipelineadvance);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelpipelinecancel();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelpipelinecancel(HalLink  httpnsadobecomadobecloudrelpipelinecancel);
	/*! \brief Get 
	 */
	HalLink getHttpnsadobecomadobecloudrelprogram();

	/*! \brief Set 
	 */
	void setHttpnsadobecomadobecloudrelprogram(HalLink  httpnsadobecomadobecloudrelprogram);
	/*! \brief Get 
	 */
	HalLink getSelf();

	/*! \brief Set 
	 */
	void setSelf(HalLink  self);

private:
	HalLink httpnsadobecomadobecloudrelexecution;
	HalLink httpnsadobecomadobecloudrelpipeline;
	HalLink httpnsadobecomadobecloudrelpipelinelogs;
	HalLink httpnsadobecomadobecloudrelpipelinemetrics;
	HalLink httpnsadobecomadobecloudrelpipelineadvance;
	HalLink httpnsadobecomadobecloudrelpipelinecancel;
	HalLink httpnsadobecomadobecloudrelprogram;
	HalLink self;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecutionStepState__links_H_ */
