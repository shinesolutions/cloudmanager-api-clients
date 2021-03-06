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
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.NodeAemCloudmanagerApiClient);
  }
}(this, function(expect, NodeAemCloudmanagerApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('EnvironmentLinks', function() {
    it('should create an instance of EnvironmentLinks', function() {
      // uncomment below and update the code to test EnvironmentLinks
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be.a(NodeAemCloudmanagerApiClient.EnvironmentLinks);
    });

    it('should have the property httpNsAdobeComAdobecloudRelProgram (base name: "http://ns.adobe.com/adobecloud/rel/program")', function() {
      // uncomment below and update the code to test the property httpNsAdobeComAdobecloudRelProgram
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

    it('should have the property httpNsAdobeComAdobecloudRelPipeline (base name: "http://ns.adobe.com/adobecloud/rel/pipeline")', function() {
      // uncomment below and update the code to test the property httpNsAdobeComAdobecloudRelPipeline
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

    it('should have the property httpNsAdobeComAdobecloudRelAuthor (base name: "http://ns.adobe.com/adobecloud/rel/author")', function() {
      // uncomment below and update the code to test the property httpNsAdobeComAdobecloudRelAuthor
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

    it('should have the property httpNsAdobeComAdobecloudRelPublish (base name: "http://ns.adobe.com/adobecloud/rel/publish")', function() {
      // uncomment below and update the code to test the property httpNsAdobeComAdobecloudRelPublish
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

    it('should have the property httpNsAdobeComAdobecloudRelDeveloperConsole (base name: "http://ns.adobe.com/adobecloud/rel/developerConsole")', function() {
      // uncomment below and update the code to test the property httpNsAdobeComAdobecloudRelDeveloperConsole
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

    it('should have the property httpNsAdobeComAdobecloudRelLogs (base name: "http://ns.adobe.com/adobecloud/rel/logs")', function() {
      // uncomment below and update the code to test the property httpNsAdobeComAdobecloudRelLogs
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

    it('should have the property httpNsAdobeComAdobecloudRelVariables (base name: "http://ns.adobe.com/adobecloud/rel/variables")', function() {
      // uncomment below and update the code to test the property httpNsAdobeComAdobecloudRelVariables
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

    it('should have the property self (base name: "self")', function() {
      // uncomment below and update the code to test the property self
      //var instane = new NodeAemCloudmanagerApiClient.EnvironmentLinks();
      //expect(instance).to.be();
    });

  });

}));
