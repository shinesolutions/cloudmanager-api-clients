import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for VariablesApi
void main() {
  var instance = VariablesApi();

  group('tests for VariablesApi', () {
    // List User Environment Variables
    //
    // List the user defined variables for an environment (Cloud Service only).
    //
    //Future<VariableList> getEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test getEnvironmentVariables', () async {
      // TODO
    });

    // Patch User Environment Variables
    //
    // Modify multiple environment variables (Cloud Service only). To delete a variable, include it with an empty value.
    //
    //Future<VariableList> patchEnvironmentVariables(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey, String contentType, List<Variable> body) async 
    test('test patchEnvironmentVariables', () async {
      // TODO
    });

  });
}
