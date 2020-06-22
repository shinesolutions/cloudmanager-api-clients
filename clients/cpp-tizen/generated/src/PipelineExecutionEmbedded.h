/*
 * PipelineExecution__embedded.h
 *
 * 
 */

#ifndef _PipelineExecution__embedded_H_
#define _PipelineExecution__embedded_H_


#include <string>
#include "PipelineExecutionStepState.h"
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

class PipelineExecution__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecution__embedded();
	PipelineExecution__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecution__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<PipelineExecutionStepState> getStepStates();

	/*! \brief Set 
	 */
	void setStepStates(std::list <PipelineExecutionStepState> stepStates);

private:
	std::list <PipelineExecutionStepState>stepStates;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecution__embedded_H_ */
