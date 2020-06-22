/*
 * PipelineExecutionStepState.h
 *
 * Describes the status of a particular pipeline execution step for display purposes
 */

#ifndef _PipelineExecutionStepState_H_
#define _PipelineExecutionStepState_H_


#include <string>
#include "PipelineExecutionStepState__links.h"
#include <list>
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes the status of a particular pipeline execution step for display purposes
 *
 *  \ingroup Models
 *
 */

class PipelineExecutionStepState : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecutionStepState();
	PipelineExecutionStepState(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecutionStepState();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getStepId();

	/*! \brief Set 
	 */
	void setStepId(std::string  stepId);
	/*! \brief Get 
	 */
	std::string getPhaseId();

	/*! \brief Set 
	 */
	void setPhaseId(std::string  phaseId);
	/*! \brief Get Name of the action
	 */
	std::string getAction();

	/*! \brief Set Name of the action
	 */
	void setAction(std::string  action);
	/*! \brief Get Target repository
	 */
	std::string getRepository();

	/*! \brief Set Target repository
	 */
	void setRepository(std::string  repository);
	/*! \brief Get Target branch
	 */
	std::string getBranch();

	/*! \brief Set Target branch
	 */
	void setBranch(std::string  branch);
	/*! \brief Get Target environment
	 */
	std::string getEnvironment();

	/*! \brief Set Target environment
	 */
	void setEnvironment(std::string  environment);
	/*! \brief Get Target environment type
	 */
	std::string getEnvironmentType();

	/*! \brief Set Target environment type
	 */
	void setEnvironmentType(std::string  environmentType);
	/*! \brief Get Start time
	 */
	std::string getStartedAt();

	/*! \brief Set Start time
	 */
	void setStartedAt(std::string  startedAt);
	/*! \brief Get Date the execution reached a final state
	 */
	std::string getFinishedAt();

	/*! \brief Set Date the execution reached a final state
	 */
	void setFinishedAt(std::string  finishedAt);
	/*! \brief Get Information about step result
	 */
	std::map<std::string, std::string> getDetails();

	/*! \brief Set Information about step result
	 */
	void setDetails(std::map <std::string, std::string> details);
	/*! \brief Get Action status
	 */
	std::string getStatus();

	/*! \brief Set Action status
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	PipelineExecutionStepState__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(PipelineExecutionStepState__links  _links);

private:
	std::string id;
	std::string stepId;
	std::string phaseId;
	std::string action;
	std::string repository;
	std::string branch;
	std::string environment;
	std::string environmentType;
	std::string startedAt;
	std::string finishedAt;
	std::map <std::string, std::string>details;
	std::string status;
	PipelineExecutionStepState__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecutionStepState_H_ */
