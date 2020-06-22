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
    instance = new NodeAemCloudmanagerApiClient.BadRequestError();
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

  describe('BadRequestError', function() {
    it('should create an instance of BadRequestError', function() {
      // uncomment below and update the code to test BadRequestError
      //var instane = new NodeAemCloudmanagerApiClient.BadRequestError();
      //expect(instance).to.be.a(NodeAemCloudmanagerApiClient.BadRequestError);
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instane = new NodeAemCloudmanagerApiClient.BadRequestError();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new NodeAemCloudmanagerApiClient.BadRequestError();
      //expect(instance).to.be();
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instane = new NodeAemCloudmanagerApiClient.BadRequestError();
      //expect(instance).to.be();
    });

    it('should have the property missingParams (base name: "missingParams")', function() {
      // uncomment below and update the code to test the property missingParams
      //var instane = new NodeAemCloudmanagerApiClient.BadRequestError();
      //expect(instance).to.be();
    });

    it('should have the property invalidParams (base name: "invalidParams")', function() {
      // uncomment below and update the code to test the property invalidParams
      //var instane = new NodeAemCloudmanagerApiClient.BadRequestError();
      //expect(instance).to.be();
    });

  });

}));
