/*
 * PipelineList__embedded.h
 *
 * 
 */

#ifndef _PipelineList__embedded_H_
#define _PipelineList__embedded_H_


#include <string>
#include "Pipeline.h"
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

class PipelineList__embedded : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineList__embedded();
	PipelineList__embedded(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineList__embedded();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Pipeline> getPipelines();

	/*! \brief Set 
	 */
	void setPipelines(std::list <Pipeline> pipelines);

private:
	std::list <Pipeline>pipelines;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineList__embedded_H_ */
