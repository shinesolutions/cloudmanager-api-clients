@isTest
private class OASRequestedPageDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASRequestedPageDetails requestedPageDetails1 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails2 = requestedPageDetails1;
        OASRequestedPageDetails requestedPageDetails3 = new OASRequestedPageDetails();
        OASRequestedPageDetails requestedPageDetails4 = requestedPageDetails3;

        System.assert(requestedPageDetails1.equals(requestedPageDetails2));
        System.assert(requestedPageDetails2.equals(requestedPageDetails1));
        System.assert(requestedPageDetails1.equals(requestedPageDetails1));
        System.assert(requestedPageDetails3.equals(requestedPageDetails4));
        System.assert(requestedPageDetails4.equals(requestedPageDetails3));
        System.assert(requestedPageDetails3.equals(requestedPageDetails3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRequestedPageDetails requestedPageDetails1 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails2 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails3 = new OASRequestedPageDetails();
        OASRequestedPageDetails requestedPageDetails4 = new OASRequestedPageDetails();

        System.assert(requestedPageDetails1.equals(requestedPageDetails2));
        System.assert(requestedPageDetails2.equals(requestedPageDetails1));
        System.assert(requestedPageDetails3.equals(requestedPageDetails4));
        System.assert(requestedPageDetails4.equals(requestedPageDetails3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRequestedPageDetails requestedPageDetails1 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails2 = new OASRequestedPageDetails();

        System.assertEquals(false, requestedPageDetails1.equals('foo'));
        System.assertEquals(false, requestedPageDetails2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRequestedPageDetails requestedPageDetails1 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails2 = new OASRequestedPageDetails();
        OASRequestedPageDetails requestedPageDetails3;

        System.assertEquals(false, requestedPageDetails1.equals(requestedPageDetails3));
        System.assertEquals(false, requestedPageDetails2.equals(requestedPageDetails3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRequestedPageDetails requestedPageDetails1 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails2 = new OASRequestedPageDetails();

        System.assertEquals(requestedPageDetails1.hashCode(), requestedPageDetails1.hashCode());
        System.assertEquals(requestedPageDetails2.hashCode(), requestedPageDetails2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRequestedPageDetails requestedPageDetails1 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails2 = OASRequestedPageDetails.getExample();
        OASRequestedPageDetails requestedPageDetails3 = new OASRequestedPageDetails();
        OASRequestedPageDetails requestedPageDetails4 = new OASRequestedPageDetails();

        System.assert(requestedPageDetails1.equals(requestedPageDetails2));
        System.assert(requestedPageDetails3.equals(requestedPageDetails4));
        System.assertEquals(requestedPageDetails1.hashCode(), requestedPageDetails2.hashCode());
        System.assertEquals(requestedPageDetails3.hashCode(), requestedPageDetails4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRequestedPageDetails requestedPageDetails = new OASRequestedPageDetails();
        Map<String, String> propertyMappings = requestedPageDetails.getPropertyMappings();
        System.assertEquals('r_limit', propertyMappings.get('limit'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRequestedPageDetails requestedPageDetails = new OASRequestedPageDetails();
        System.assertEquals(new List<String>(), requestedPageDetails.property);
        System.assertEquals(null, requestedPageDetails.start);
        System.assertEquals(null, requestedPageDetails.r_limit);
        System.assertEquals(null, requestedPageDetails.orderBy);
        System.assertEquals(null, requestedPageDetails.r_type);
        System.assertEquals(null, requestedPageDetails.next);
        System.assertEquals(null, requestedPageDetails.prev);
    }
}
