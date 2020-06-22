import 'package:openapi/api.dart';
import 'package:test/test.dart';

// tests for Variable
void main() {
    var instance = new Variable();

  group('test Variable', () {
    // Name of the variable. Of a-z, A-Z, _ and 0-9 Cannot begin with a number.
    // String name (default value: null)
    test('to test the property `name`', () async {
      // TODO
    });

    // Value of the variable. Read-Write for non-secrets, write-only for secrets.
    // String value (default value: null)
    test('to test the property `value`', () async {
      // TODO
    });

    // Type of the variable. Default `string` if missing. Cannot be changed after creation.
    // String type (default value: null)
    test('to test the property `type`', () async {
      // TODO
    });


  });

}
