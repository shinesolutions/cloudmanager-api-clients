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
    ///  Class for testing EnvironmentsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class EnvironmentsApiTests
    {
        private EnvironmentsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new EnvironmentsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of EnvironmentsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' EnvironmentsApi
            //Assert.IsInstanceOf(typeof(EnvironmentsApi), instance);
        }

        
        /// <summary>
        /// Test DeleteEnvironment
        /// </summary>
        [Test]
        public void DeleteEnvironmentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string environmentId = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //var response = instance.DeleteEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
            //Assert.IsInstanceOf(typeof(Environment), response, "response is Environment");
        }
        
        /// <summary>
        /// Test DownloadLogs
        /// </summary>
        [Test]
        public void DownloadLogsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string environmentId = null;
            //string service = null;
            //string name = null;
            //string date = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //string accept = null;
            //instance.DownloadLogs(programId, environmentId, service, name, date, xGwImsOrgId, authorization, xApiKey, accept);
            
        }
        
        /// <summary>
        /// Test GetEnvironment
        /// </summary>
        [Test]
        public void GetEnvironmentTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string environmentId = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //var response = instance.GetEnvironment(programId, environmentId, xGwImsOrgId, authorization, xApiKey);
            //Assert.IsInstanceOf(typeof(Environment), response, "response is Environment");
        }
        
        /// <summary>
        /// Test GetEnvironmentLogs
        /// </summary>
        [Test]
        public void GetEnvironmentLogsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string environmentId = null;
            //int days = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //List<string> service = null;
            //List<string> name = null;
            //var response = instance.GetEnvironmentLogs(programId, environmentId, days, xGwImsOrgId, authorization, xApiKey, service, name);
            //Assert.IsInstanceOf(typeof(EnvironmentLogs), response, "response is EnvironmentLogs");
        }
        
        /// <summary>
        /// Test GetEnvironments
        /// </summary>
        [Test]
        public void GetEnvironmentsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //string type = null;
            //var response = instance.GetEnvironments(programId, xGwImsOrgId, authorization, xApiKey, type);
            //Assert.IsInstanceOf(typeof(EnvironmentList), response, "response is EnvironmentList");
        }
        
    }

}
