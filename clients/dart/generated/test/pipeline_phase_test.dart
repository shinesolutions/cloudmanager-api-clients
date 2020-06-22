import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for PipelinePhase
void main() {
    var instance = new PipelinePhase();

  group('test PipelinePhase', () {
    // Name of the phase
    // String name (default value: null)
    test('to test the property `name`', () async {
      // TODO
    });

    // Type of the phase
    // String type (default value: null)
    test('to test the property `type`', () async {
      // TODO
    });

    // Identifier of the source repository. The code from this repository will be build at the start of this phase. Mandatory if type=BUILD
    // String repositoryId (default value: null)
    test('to test the property `repositoryId`', () async {
      // TODO
    });

    // Name of the tracked branch or a fully qualified git tag (e.g. refs/tags/v1).  Assumed to be `master` if missing.
    // String branch (default value: null)
    test('to test the property `branch`', () async {
      // TODO
    });

    // Identifier of the target environment. Mandatory if type=DEPLOY
    // String environmentId (default value: null)
    test('to test the property `environmentId`', () async {
      // TODO
    });


  });

}
