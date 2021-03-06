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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.BranchList

trait BranchesApi extends Service {


  final override def descriptor = {
    import Service._
    named("BranchesApi").withCalls(
      restCall(Method.GET, "/api/program/:programId/repository/:repositoryId/branches", getBranches _)
    ).withAutoAcl(true)
  }




  // xGwImsOrgId:String  -- not yet supported heder params
  // authorization:String  -- not yet supported heder params
  // xApiKey:String  -- not yet supported heder params
  /**
    * List Branches
    * Returns the list of branches from a repository
    *  
    * @param programId Identifier of the program.  
    * @param repositoryId Identifier of the repository  
    * @param xGwImsOrgId IMS organization ID that the request is being made under.  
    * @param authorization Bearer [token] - An access token for the technical account created through integration with Adobe IO  
    * @param xApiKey IMS Client ID (API Key) which is subscribed to consume services on console.adobe.io 
    * @return BranchList
    */
  def getBranches(programId: String, repositoryId: String): ServiceCall[NotUsed ,BranchList]
  

  }

