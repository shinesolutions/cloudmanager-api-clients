/*
 * Cloud Manager API
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Describes a __CI/CD Pipeline__
 */
public class OASPipeline implements OAS.MappedProperties {
    /**
     * Identifier of the pipeline. Unique within the program.
     * @return id
     */
    public String id { get; set; }

    /**
     * Identifier of the program. Unique within the space.
     * @return programId
     */
    public String programId { get; set; }

    /**
     * Name of the pipeline
     * @return name
     */
    public String name { get; set; }

    /**
     * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
     */
    public enum RTriggerEnum {
        ON_COMMIT,
        MANUAL,
        SCHEDULE
    }

    /**
     * How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
     * @return r_trigger
     */
    public RTriggerEnum r_trigger { get; set; }

    /**
     * Pipeline status
     */
    public enum StatusEnum {
        IDLE,
        BUSY,
        WAITING
    }

    /**
     * Pipeline status
     * @return status
     */
    public StatusEnum status { get; set; }

    /**
     * Create date
     * @return createdAt
     */
    public Datetime createdAt { get; private set; }

    /**
     * Update date
     * @return updatedAt
     */
    public Datetime updatedAt { get; private set; }

    /**
     * Last pipeline execution start
     * @return lastStartedAt
     */
    public Datetime lastStartedAt { get; private set; }

    /**
     * Last pipeline execution end
     * @return lastFinishedAt
     */
    public Datetime lastFinishedAt { get; private set; }

    /**
     * Pipeline phases in execution order
     * @return phases
     */
    public List<OASPipelinePhase> phases { get; set; }

    /**
     * Get links
     * @return links
     */
    public OASPipelineLinks links { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'trigger' => 'r_trigger',
        '_links' => 'links'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASPipeline() {
        phases = new List<OASPipelinePhase>();
    }

    public static OASPipeline getExample() {
        OASPipeline pipeline = new OASPipeline();
          pipeline.id = '29';
          pipeline.programId = '14';
          pipeline.name = 'AcmeCorp Main Pipeline';
          pipeline.r_trigger = RTriggerEnum.MANUAL;
          pipeline.status = StatusEnum.RUNNING_FAILED;
          pipeline.createdAt = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          pipeline.updatedAt = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          pipeline.lastStartedAt = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          pipeline.lastFinishedAt = Datetime.newInstanceGmt(2000, 1, 23, 4, 56, 7);
          pipeline.phases = new List<OASPipelinePhase>{OASPipelinePhase.getExample()};
          pipeline.links = OASPipelineLinks.getExample();
        return pipeline;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPipeline) {           
            OASPipeline pipeline = (OASPipeline) obj;
            return this.id == pipeline.id
                && this.programId == pipeline.programId
                && this.name == pipeline.name
                && this.r_trigger == pipeline.r_trigger
                && this.status == pipeline.status
                && this.createdAt == pipeline.createdAt
                && this.updatedAt == pipeline.updatedAt
                && this.lastStartedAt == pipeline.lastStartedAt
                && this.lastFinishedAt == pipeline.lastFinishedAt
                && this.phases == pipeline.phases
                && this.links == pipeline.links;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (programId == null ? 0 : System.hashCode(programId));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (r_trigger == null ? 0 : System.hashCode(r_trigger));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        hashCode = (17 * hashCode) + (createdAt == null ? 0 : System.hashCode(createdAt));
        hashCode = (17 * hashCode) + (updatedAt == null ? 0 : System.hashCode(updatedAt));
        hashCode = (17 * hashCode) + (lastStartedAt == null ? 0 : System.hashCode(lastStartedAt));
        hashCode = (17 * hashCode) + (lastFinishedAt == null ? 0 : System.hashCode(lastFinishedAt));
        hashCode = (17 * hashCode) + (phases == null ? 0 : System.hashCode(phases));
        hashCode = (17 * hashCode) + (links == null ? 0 : System.hashCode(links));
        return hashCode;
    }
}

