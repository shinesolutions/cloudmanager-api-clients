/*
 * Pipeline.h
 *
 * Describes a __CI/CD Pipeline__
 */

#ifndef _Pipeline_H_
#define _Pipeline_H_


#include <string>
#include "PipelinePhase.h"
#include "Pipeline__links.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes a __CI/CD Pipeline__
 *
 *  \ingroup Models
 *
 */

class Pipeline : public Object {
public:
	/*! \brief Constructor.
	 */
	Pipeline();
	Pipeline(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Pipeline();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Identifier of the pipeline. Unique within the program.
	 */
	std::string getId();

	/*! \brief Set Identifier of the pipeline. Unique within the program.
	 */
	void setId(std::string  id);
	/*! \brief Get Identifier of the program. Unique within the space.
	 */
	std::string getProgramId();

	/*! \brief Set Identifier of the program. Unique within the space.
	 */
	void setProgramId(std::string  programId);
	/*! \brief Get Name of the pipeline
	 */
	std::string getName();

	/*! \brief Set Name of the pipeline
	 */
	void setName(std::string  name);
	/*! \brief Get How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
	 */
	std::string getTrigger();

	/*! \brief Set How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
	 */
	void setTrigger(std::string  trigger);
	/*! \brief Get Pipeline status
	 */
	std::string getStatus();

	/*! \brief Set Pipeline status
	 */
	void setStatus(std::string  status);
	/*! \brief Get Create date
	 */
	std::string getCreatedAt();

	/*! \brief Set Create date
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get Update date
	 */
	std::string getUpdatedAt();

	/*! \brief Set Update date
	 */
	void setUpdatedAt(std::string  updatedAt);
	/*! \brief Get Last pipeline execution start
	 */
	std::string getLastStartedAt();

	/*! \brief Set Last pipeline execution start
	 */
	void setLastStartedAt(std::string  lastStartedAt);
	/*! \brief Get Last pipeline execution end
	 */
	std::string getLastFinishedAt();

	/*! \brief Set Last pipeline execution end
	 */
	void setLastFinishedAt(std::string  lastFinishedAt);
	/*! \brief Get Pipeline phases in execution order
	 */
	std::list<PipelinePhase> getPhases();

	/*! \brief Set Pipeline phases in execution order
	 */
	void setPhases(std::list <PipelinePhase> phases);
	/*! \brief Get 
	 */
	Pipeline__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(Pipeline__links  _links);

private:
	std::string id;
	std::string programId;
	std::string name;
	std::string trigger;
	std::string status;
	std::string createdAt;
	std::string updatedAt;
	std::string lastStartedAt;
	std::string lastFinishedAt;
	std::list <PipelinePhase>phases;
	Pipeline__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Pipeline_H_ */
