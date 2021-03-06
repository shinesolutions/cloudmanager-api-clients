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
import { HalLink } from './halLink';


export interface EnvironmentLinks { 
    http__ns_adobe_com_adobecloud_rel_program?: HalLink;
    http__ns_adobe_com_adobecloud_rel_pipeline?: HalLink;
    http__ns_adobe_com_adobecloud_rel_author?: HalLink;
    http__ns_adobe_com_adobecloud_rel_publish?: HalLink;
    http__ns_adobe_com_adobecloud_rel_developerConsole?: HalLink;
    http__ns_adobe_com_adobecloud_rel_logs?: HalLink;
    http__ns_adobe_com_adobecloud_rel_variables?: HalLink;
    self?: HalLink;
}
