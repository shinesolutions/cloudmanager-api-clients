/* 
 * Cloud Manager API
 *
 * This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;
using Org.OpenAPITools.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing EnvironmentList
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class EnvironmentListTests
    {
        // TODO uncomment below to declare an instance variable for EnvironmentList
        //private EnvironmentList instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of EnvironmentList
            //instance = new EnvironmentList();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of EnvironmentList
        /// </summary>
        [Test]
        public void EnvironmentListInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOf" EnvironmentList
            //Assert.IsInstanceOf(typeof(EnvironmentList), instance);
        }


        /// <summary>
        /// Test the property 'TotalNumberOfItems'
        /// </summary>
        [Test]
        public void TotalNumberOfItemsTest()
        {
            // TODO unit test for the property 'TotalNumberOfItems'
        }
        /// <summary>
        /// Test the property 'Embedded'
        /// </summary>
        [Test]
        public void EmbeddedTest()
        {
            // TODO unit test for the property 'Embedded'
        }
        /// <summary>
        /// Test the property 'Links'
        /// </summary>
        [Test]
        public void LinksTest()
        {
            // TODO unit test for the property 'Links'
        }

    }

}
