import 'package:openapi/api.dart';
import 'package:test/test.dart';


/// tests for EnvironmentsApi
void main() {
  var instance = EnvironmentsApi();

  group('tests for EnvironmentsApi', () {
    // DeleteEnvironment
    //
    // Delete environment
    //
    //Future<Environment> deleteEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test deleteEnvironment', () async {
      // TODO
    });

    // Download Logs
    //
    // Download environment logs
    //
    //Future downloadLogs(String programId, String environmentId, String service, String name, String date, String xGwImsOrgId, String authorization, String xApiKey, { String accept }) async 
    test('test downloadLogs', () async {
      // TODO
    });

    // Get Environment
    //
    // Returns an environment by its id
    //
    //Future<Environment> getEnvironment(String programId, String environmentId, String xGwImsOrgId, String authorization, String xApiKey) async 
    test('test getEnvironment', () async {
      // TODO
    });

    // Get Environment Logs
    //
    // List all logs available in environment
    //
    //Future<EnvironmentLogs> getEnvironmentLogs(String programId, String environmentId, int days, String xGwImsOrgId, String authorization, String xApiKey, { List<String> service, List<String> name }) async 
    test('test getEnvironmentLogs', () async {
      // TODO
    });

    // List Environments
    //
    // Lists all environments in an program
    //
    //Future<EnvironmentList> getEnvironments(String programId, String xGwImsOrgId, String authorization, String xApiKey, { String type }) async 
    test('test getEnvironments', () async {
      // TODO
    });

  });
}
