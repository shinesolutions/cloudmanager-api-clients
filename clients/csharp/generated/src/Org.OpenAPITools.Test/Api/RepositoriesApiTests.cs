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
    ///  Class for testing RepositoriesApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class RepositoriesApiTests
    {
        private RepositoriesApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new RepositoriesApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of RepositoriesApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' RepositoriesApi
            //Assert.IsInstanceOf(typeof(RepositoriesApi), instance);
        }

        
        /// <summary>
        /// Test GetRepositories
        /// </summary>
        [Test]
        public void GetRepositoriesTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //var response = instance.GetRepositories(programId, xGwImsOrgId, authorization, xApiKey);
            //Assert.IsInstanceOf(typeof(RepositoryList), response, "response is RepositoryList");
        }
        
        /// <summary>
        /// Test GetRepository
        /// </summary>
        [Test]
        public void GetRepositoryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string programId = null;
            //string repositoryId = null;
            //string xGwImsOrgId = null;
            //string authorization = null;
            //string xApiKey = null;
            //var response = instance.GetRepository(programId, repositoryId, xGwImsOrgId, authorization, xApiKey);
            //Assert.IsInstanceOf(typeof(Repository), response, "response is Repository");
        }
        
    }

}
