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
 * Describes an __Embedded Program__
 */
public class OASEmbeddedProgram {
    /**
     * Identifier of the program. Unique within the space.
     * @return id
     */
    public String id { get; private set; }

    /**
     * Name of the program
     * @return name
     */
    public String name { get; private set; }

    /**
     * Whether this Program has been enabled for Cloud Manager usage
     * @return enabled
     */
    public Boolean enabled { get; private set; }

    /**
     * Tenant Id
     * @return tenantId
     */
    public String tenantId { get; private set; }

    public OASEmbeddedProgram() {
        enabled = false;
    }

    public static OASEmbeddedProgram getExample() {
        OASEmbeddedProgram embeddedProgram = new OASEmbeddedProgram();
          embeddedProgram.id = '14';
          embeddedProgram.name = 'AcmeCorp Main Site';
          embeddedProgram.enabled = true;
          embeddedProgram.tenantId = 'acmeCorp';
        return embeddedProgram;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASEmbeddedProgram) {           
            OASEmbeddedProgram embeddedProgram = (OASEmbeddedProgram) obj;
            return this.id == embeddedProgram.id
                && this.name == embeddedProgram.name
                && this.enabled == embeddedProgram.enabled
                && this.tenantId == embeddedProgram.tenantId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (enabled == null ? 0 : System.hashCode(enabled));
        hashCode = (17 * hashCode) + (tenantId == null ? 0 : System.hashCode(tenantId));
        return hashCode;
    }
}

