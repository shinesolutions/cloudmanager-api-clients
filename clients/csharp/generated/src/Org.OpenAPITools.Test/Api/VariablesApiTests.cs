/* 
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing VariablesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class VariablesApiTests
    {
        private VariablesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new VariablesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of VariablesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' VariablesApi
            //Assert.IsInstanceOf(typeof(VariablesApi), instance);
        }

        
        /// <summary>
        /// Test GetEnvironmentVariables
        /// </summary>
        [Test]
        public void GetEnvironmentVariablesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string environmentId = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //var response = instance.GetEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
            //Assert.IsInstanceOf(typeof(VariableList), response, "response is VariableList");
        }
        
        /// <summary>
        /// Test PatchEnvironmentVariables
        /// </summary>
        [Test]
        public void PatchEnvironmentVariablesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string environmentId = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //string contentType = null;
            //List<Variable> body = null;
            //var response = instance.PatchEnvironmentVariables(programId, environmentId, xGwImsOrgId, authorization, xApiKey, contentType, body);
            //Assert.IsInstanceOf(typeof(VariableList), response, "response is VariableList");
        }
        
    }

}
