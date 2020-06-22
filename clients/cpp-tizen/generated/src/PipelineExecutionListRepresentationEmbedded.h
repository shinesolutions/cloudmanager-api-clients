/*
 * PipelineExecutionListRepresentation__embedded.h
 *
 * 
 */

#ifndef _PipelineExecutionListRepresentation__embedded_H_
#define _PipelineExecutionListRepresentation__embedded_H_


#include <string>
#include "PipelineExecution.h"
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

class PipelineExecutionListRepresentation__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecutionListRepresentation__embedded();
	PipelineExecutionListRepresentation__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecutionListRepresentation__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<PipelineExecution> getExecutions();

	/*! \brief Set 
	 */
	void setExecutions(std::list <PipelineExecution> executions);

private:
	std::list <PipelineExecution>executions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecutionListRepresentation__embedded_H_ */
