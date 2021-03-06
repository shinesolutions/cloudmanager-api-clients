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
 * OASEnvironmentListEmbedded
 */
public class OASEnvironmentListEmbedded {
    /**
     * Get environments
     * @return environments
     */
    public List<OASEnvironment> environments { get; set; }

    public OASEnvironmentListEmbedded() {
        environments = new List<OASEnvironment>();
    }

    public static OASEnvironmentListEmbedded getExample() {
        OASEnvironmentListEmbedded environmentListEmbedded = new OASEnvironmentListEmbedded();
          environmentListEmbedded.environments = new List<OASEnvironment>{OASEnvironment.getExample()};
        return environmentListEmbedded;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASEnvironmentListEmbedded) {           
            OASEnvironmentListEmbedded environmentListEmbedded = (OASEnvironmentListEmbedded) obj;
            return this.environments == environmentListEmbedded.environments;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (environments == null ? 0 : System.hashCode(environments));
        return hashCode;
    }
}

