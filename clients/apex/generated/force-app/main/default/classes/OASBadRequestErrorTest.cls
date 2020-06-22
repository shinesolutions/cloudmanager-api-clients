@isTest
private class OASBadRequestErrorTest {
    @isTest
    private static void equalsSameInstance() {
        OASBadRequestError badRequestError1 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError2 = badRequestError1;
        OASBadRequestError badRequestError3 = new OASBadRequestError();
        OASBadRequestError badRequestError4 = badRequestError3;

        System.assert(badRequestError1.equals(badRequestError2));
        System.assert(badRequestError2.equals(badRequestError1));
        System.assert(badRequestError1.equals(badRequestError1));
        System.assert(badRequestError3.equals(badRequestError4));
        System.assert(badRequestError4.equals(badRequestError3));
        System.assert(badRequestError3.equals(badRequestError3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBadRequestError badRequestError1 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError2 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError3 = new OASBadRequestError();
        OASBadRequestError badRequestError4 = new OASBadRequestError();

        System.assert(badRequestError1.equals(badRequestError2));
        System.assert(badRequestError2.equals(badRequestError1));
        System.assert(badRequestError3.equals(badRequestError4));
        System.assert(badRequestError4.equals(badRequestError3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBadRequestError badRequestError1 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError2 = new OASBadRequestError();

        System.assertEquals(false, badRequestError1.equals('foo'));
        System.assertEquals(false, badRequestError2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBadRequestError badRequestError1 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError2 = new OASBadRequestError();
        OASBadRequestError badRequestError3;

        System.assertEquals(false, badRequestError1.equals(badRequestError3));
        System.assertEquals(false, badRequestError2.equals(badRequestError3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBadRequestError badRequestError1 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError2 = new OASBadRequestError();

        System.assertEquals(badRequestError1.hashCode(), badRequestError1.hashCode());
        System.assertEquals(badRequestError2.hashCode(), badRequestError2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBadRequestError badRequestError1 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError2 = OASBadRequestError.getExample();
        OASBadRequestError badRequestError3 = new OASBadRequestError();
        OASBadRequestError badRequestError4 = new OASBadRequestError();

        System.assert(badRequestError1.equals(badRequestError2));
        System.assert(badRequestError3.equals(badRequestError4));
        System.assertEquals(badRequestError1.hashCode(), badRequestError2.hashCode());
        System.assertEquals(badRequestError3.hashCode(), badRequestError4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASBadRequestError badRequestError = new OASBadRequestError();
        Map<String, String> propertyMappings = badRequestError.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASBadRequestError badRequestError = new OASBadRequestError();
        System.assertEquals(new List<OASMissingParameter>(), badRequestError.missingParams);
        System.assertEquals(new List<OASInvalidParameter>(), badRequestError.invalidParams);
        System.assertEquals(null, badRequestError.status);
        System.assertEquals(null, badRequestError.r_type);
        System.assertEquals(null, badRequestError.title);
    }
}
