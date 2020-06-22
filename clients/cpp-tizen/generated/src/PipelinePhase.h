/*
 * PipelinePhase.h
 *
 * Describes a phase of a pipeline
 */

#ifndef _PipelinePhase_H_
#define _PipelinePhase_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Describes a phase of a pipeline
 *
 *  \ingroup Models
 *
 */

class PipelinePhase : public Object {
public:
	/*! \brief Constructor.
	 */
	PipelinePhase();
	PipelinePhase(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PipelinePhase();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Name of the phase
	 */
	std::string getName();

	/*! \brief Set Name of the phase
	 */
	void setName(std::string  name);
	/*! \brief Get Type of the phase
	 */
	std::string getType();

	/*! \brief Set Type of the phase
	 */
	void setType(std::string  type);
	/*! \brief Get Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
	 */
	std::string getRepositoryId();

	/*! \brief Set Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
	 */
	void setRepositoryId(std::string  repositoryId);
	/*! \brief Get Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
	 */
	std::string getBranch();

	/*! \brief Set Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
	 */
	void setBranch(std::string  branch);
	/*! \brief Get Identifier of the target environment. Mandatory if type=DEPLOY
	 */
	std::string getEnvironmentId();

	/*! \brief Set Identifier of the target environment. Mandatory if type=DEPLOY
	 */
	void setEnvironmentId(std::string  environmentId);

private:
	std::string name;
	std::string type;
	std::string repositoryId;
	std::string branch;
	std::string environmentId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PipelinePhase_H_ */
