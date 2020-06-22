/*
 * PipelineExecution.h
 *
 * Wraps a pipeline execution
 */

#ifndef _PipelineExecution_H_
#define _PipelineExecution_H_


#include <string>
#include "PipelineExecution__embedded.h"
#include "PipelineExecution__links.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Wraps a pipeline execution
 *
 *  \ingroup Models
 *
 */

class PipelineExecution : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelineExecution();
	PipelineExecution(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelineExecution();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pipeline execution identifier
	 */
	std::string getId();

	/*! \brief Set Pipeline execution identifier
	 */
	void setId(std::string  id);
	/*! \brief Get Identifier of the program. Unique within the space.
	 */
	std::string getProgramId();

	/*! \brief Set Identifier of the program. Unique within the space.
	 */
	void setProgramId(std::string  programId);
	/*! \brief Get Identifier of the pipeline. Unique within the space.
	 */
	std::string getPipelineId();

	/*! \brief Set Identifier of the pipeline. Unique within the space.
	 */
	void setPipelineId(std::string  pipelineId);
	/*! \brief Get Version of the artifacts generated during this execution
	 */
	std::string getArtifactsVersion();

	/*! \brief Set Version of the artifacts generated during this execution
	 */
	void setArtifactsVersion(std::string  artifactsVersion);
	/*! \brief Get AdobeID who started the pipeline. Empty for auto triggered builds
	 */
	std::string getUser();

	/*! \brief Set AdobeID who started the pipeline. Empty for auto triggered builds
	 */
	void setUser(std::string  user);
	/*! \brief Get Status of the execution
	 */
	std::string getStatus();

	/*! \brief Set Status of the execution
	 */
	void setStatus(std::string  status);
	/*! \brief Get How the execution was triggered.
	 */
	std::string getTrigger();

	/*! \brief Set How the execution was triggered.
	 */
	void setTrigger(std::string  trigger);
	/*! \brief Get Start time
	 */
	std::string getCreatedAt();

	/*! \brief Set Start time
	 */
	void setCreatedAt(std::string  createdAt);
	/*! \brief Get Date of last status change
	 */
	std::string getUpdatedAt();

	/*! \brief Set Date of last status change
	 */
	void setUpdatedAt(std::string  updatedAt);
	/*! \brief Get Date the execution reached a final state
	 */
	std::string getFinishedAt();

	/*! \brief Set Date the execution reached a final state
	 */
	void setFinishedAt(std::string  finishedAt);
	/*! \brief Get 
	 */
	PipelineExecution__embedded getEmbedded();

	/*! \brief Set 
	 */
	void setEmbedded(PipelineExecution__embedded  _embedded);
	/*! \brief Get 
	 */
	PipelineExecution__links getLinks();

	/*! \brief Set 
	 */
	void setLinks(PipelineExecution__links  _links);

private:
	std::string id;
	std::string programId;
	std::string pipelineId;
	std::string artifactsVersion;
	std::string user;
	std::string status;
	std::string trigger;
	std::string createdAt;
	std::string updatedAt;
	std::string finishedAt;
	PipelineExecution__embedded _embedded;
	PipelineExecution__links _links;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelineExecution_H_ */
