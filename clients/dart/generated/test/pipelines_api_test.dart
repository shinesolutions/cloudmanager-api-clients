import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for PipelinesApi
void main() {
  var instance = PipelinesApi();

  group('tests for PipelinesApi', () {
    // Delete a Pipeline
    //
    // Delete a pipeline. All the data is wiped.
    //
    //Future deletePipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test deletePipeline', () async {
      // TODO
    });

    // Get Pipeline
    //
    // Returns a pipeline by its id
    //
    //Future<Pipeline> getPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test getPipeline', () async {
      // TODO
    });

    // List Pipelines
    //
    // Returns all the pipelines that the requesting user has access to in an program
    //
    //Future<PipelineList> getPipelines(String programId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test getPipelines', () async {
      // TODO
    });

    // Patches Pipeline
    //
    // Patches a pipeline within an program.
    //
    //Future<Pipeline> patchPipeline(String programId, String pipelineId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, Pipeline body) async 
    test('test patchPipeline', () async {
      // TODO
    });

  });
}
