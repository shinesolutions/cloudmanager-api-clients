import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for Pipeline
void main() {
    var instance = new Pipeline();

  group('test Pipeline', () {
    // Identifier of the pipeline. Unique within the program.
    // String id (default value: null)
    test('to test the property `id`', () async {
      // TODO
    });

    // Identifier of the program. Unique within the space.
    // String programId (default value: null)
    test('to test the property `programId`', () async {
      // TODO
    });

    // Name of the pipeline
    // String name (default value: null)
    test('to test the property `name`', () async {
      // TODO
    });

    // How should the execution be triggered. ON_COMMIT: each time a PR is available and the Pipeline is idle then a execution is triggered. MANUAL: triggerd through UI or API. SCHEDULE: recurring schedule (not yet implemented}
    // String trigger (default value: null)
    test('to test the property `trigger`', () async {
      // TODO
    });

    // Pipeline status
    // String status (default value: null)
    test('to test the property `status`', () async {
      // TODO
    });

    // Create date
    // DateTime createdAt (default value: null)
    test('to test the property `createdAt`', () async {
      // TODO
    });

    // Update date
    // DateTime updatedAt (default value: null)
    test('to test the property `updatedAt`', () async {
      // TODO
    });

    // Last pipeline execution start
    // DateTime lastStartedAt (default value: null)
    test('to test the property `lastStartedAt`', () async {
      // TODO
    });

    // Last pipeline execution end
    // DateTime lastFinishedAt (default value: null)
    test('to test the property `lastFinishedAt`', () async {
      // TODO
    });

    // Pipeline phases in execution order
    // List<PipelinePhase> phases (default value: [])
    test('to test the property `phases`', () async {
      // TODO
    });

    // PipelineLinks links (default value: null)
    test('to test the property `links`', () async {
      // TODO
    });


  });

}
