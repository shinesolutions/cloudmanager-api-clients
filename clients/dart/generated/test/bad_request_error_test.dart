import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for BadRequestError
void main() {
    var instance = new BadRequestError();

  group('test BadRequestError', () {
    // HTTP status code of the response.
    // int status (default value: null)
    test('to test the property `status`', () async {
      // TODO
    });

    // Error type identifier.
    // String type (default value: null)
    test('to test the property `type`', () async {
      // TODO
    });

    // A short summary of the error.
    // String title (default value: null)
    test('to test the property `title`', () async {
      // TODO
    });

    // Request's missing parameters.
    // List<MissingParameter> missingParams (default value: [])
    test('to test the property `missingParams`', () async {
      // TODO
    });

    // Request's invalid parameters.
    // List<InvalidParameter> invalidParams (default value: [])
    test('to test the property `invalidParams`', () async {
      // TODO
    });


  });

}
