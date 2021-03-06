/**
* Cloud Manager API
* This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
*
* The version of the OpenAPI document: 1.0.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.PipelineLinks
import org.openapitools.server.models.PipelinePhase

/**
 * Describes a __CI/CD Pipeline__
 * @param name Name of the pipeline
 * @param phases Pipeline phases in execution order
 * @param id Identifier of the pipeline. Unique within the program.
 * @param programId Identifier of the program. Unique within the space.
 * @param trigger How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
 * @param status Pipeline status
 * @param createdAt Create date
 * @param updatedAt Update date
 * @param lastStartedAt Last pipeline execution start
 * @param lastFinishedAt Last pipeline execution end
 * @param links 
 */
data class Pipeline (
    /* Name of the pipeline */
    val name: kotlin.String,
    /* Pipeline phases in execution order */
    val phases: kotlin.Array<PipelinePhase>,
    /* Identifier of the pipeline. Unique within the program. */
    val id: kotlin.String? = null,
    /* Identifier of the program. Unique within the space. */
    val programId: kotlin.String? = null,
    /* How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented} */
    val trigger: Pipeline.Trigger? = null,
    /* Pipeline status */
    val status: Pipeline.Status? = null,
    /* Create date */
    val createdAt: java.time.LocalDateTime? = null,
    /* Update date */
    val updatedAt: java.time.LocalDateTime? = null,
    /* Last pipeline execution start */
    val lastStartedAt: java.time.LocalDateTime? = null,
    /* Last pipeline execution end */
    val lastFinishedAt: java.time.LocalDateTime? = null,
    val links: PipelineLinks? = null
) 
{
    /**
    * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
    * Values: oNCOMMIT,mANUAL,sCHEDULE
    */
    enum class Trigger(val value: kotlin.String){
        oNCOMMIT("ON_COMMIT"),
        mANUAL("MANUAL"),
        sCHEDULE("SCHEDULE");
    }
    /**
    * Pipeline status
    * Values: iDLE,bUSY,wAITING
    */
    enum class Status(val value: kotlin.String){
        iDLE("IDLE"),
        bUSY("BUSY"),
        wAITING("WAITING");
    }
}

