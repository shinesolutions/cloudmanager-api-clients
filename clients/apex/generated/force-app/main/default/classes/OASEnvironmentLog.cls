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
 * Log from Environment
 */
public class OASEnvironmentLog implements OAS.MappedProperties {
    /**
     * Name of the service
     * @return service
     */
    public String service { get; set; }

    /**
     * Name of the Log
     * @return name
     */
    public String name { get; set; }

    /**
     * date of the Log
     * @return r_date
     */
    public String r_date { get; set; }

    /**
     * Get programId
     * @return programId
     */
    public Long programId { get; set; }

    /**
     * Get environmentId
     * @return environmentId
     */
    public Long environmentId { get; set; }

    /**
     * Get links
     * @return links
     */
    public OASEnvironmentLogLinks links { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'date' => 'r_date',
        '_links' => 'links'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASEnvironmentLog getExample() {
        OASEnvironmentLog environmentLog = new OASEnvironmentLog();
          environmentLog.service = 'author';
          environmentLog.name = 'aemerror';
          environmentLog.r_date = '2019-04-05';
          environmentLog.programId = 123456789L;
          environmentLog.environmentId = 123456789L;
          environmentLog.links = OASEnvironmentLogLinks.getExample();
        return environmentLog;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASEnvironmentLog) {           
            OASEnvironmentLog environmentLog = (OASEnvironmentLog) obj;
            return this.service == environmentLog.service
                && this.name == environmentLog.name
                && this.r_date == environmentLog.r_date
                && this.programId == environmentLog.programId
                && this.environmentId == environmentLog.environmentId
                && this.links == environmentLog.links;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (service == null ? 0 : System.hashCode(service));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (r_date == null ? 0 : System.hashCode(r_date));
        hashCode = (17 * hashCode) + (programId == null ? 0 : System.hashCode(programId));
        hashCode = (17 * hashCode) + (environmentId == null ? 0 : System.hashCode(environmentId));
        hashCode = (17 * hashCode) + (links == null ? 0 : System.hashCode(links));
        return hashCode;
    }
}

