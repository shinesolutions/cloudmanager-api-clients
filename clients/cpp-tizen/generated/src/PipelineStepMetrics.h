/*
 * PipelineStepMetrics.h
 *
 * 
 */

#ifndef _PipelineStepMetrics_H_
#define _PipelineStepMetrics_H_


#include <string>
#include "Metric.h"
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

class PipelineStepMetrics : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineStepMetrics();
	PipelineStepMetrics(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineStepMetrics();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get metrics
	 */
	std::list<Metric> getMetrics();

	/*! \brief Set metrics
	 */
	void setMetrics(std::list <Metric> metrics);

private:
	std::list <Metric>metrics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineStepMetrics_H_ */
