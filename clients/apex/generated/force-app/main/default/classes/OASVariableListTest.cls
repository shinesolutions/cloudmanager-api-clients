@isTest
private class OASVariableListTest {
    @isTest
    private static void equalsSameInstance() {
        OASVariableList variableList1 = OASVariableList.getExample();
        OASVariableList variableList2 = variableList1;
        OASVariableList variableList3 = new OASVariableList();
        OASVariableList variableList4 = variableList3;

        System.assert(variableList1.equals(variableList2));
        System.assert(variableList2.equals(variableList1));
        System.assert(variableList1.equals(variableList1));
        System.assert(variableList3.equals(variableList4));
        System.assert(variableList4.equals(variableList3));
        System.assert(variableList3.equals(variableList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVariableList variableList1 = OASVariableList.getExample();
        OASVariableList variableList2 = OASVariableList.getExample();
        OASVariableList variableList3 = new OASVariableList();
        OASVariableList variableList4 = new OASVariableList();

        System.assert(variableList1.equals(variableList2));
        System.assert(variableList2.equals(variableList1));
        System.assert(variableList3.equals(variableList4));
        System.assert(variableList4.equals(variableList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVariableList variableList1 = OASVariableList.getExample();
        OASVariableList variableList2 = new OASVariableList();

        System.assertEquals(false, variableList1.equals('foo'));
        System.assertEquals(false, variableList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVariableList variableList1 = OASVariableList.getExample();
        OASVariableList variableList2 = new OASVariableList();
        OASVariableList variableList3;

        System.assertEquals(false, variableList1.equals(variableList3));
        System.assertEquals(false, variableList2.equals(variableList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVariableList variableList1 = OASVariableList.getExample();
        OASVariableList variableList2 = new OASVariableList();

        System.assertEquals(variableList1.hashCode(), variableList1.hashCode());
        System.assertEquals(variableList2.hashCode(), variableList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVariableList variableList1 = OASVariableList.getExample();
        OASVariableList variableList2 = OASVariableList.getExample();
        OASVariableList variableList3 = new OASVariableList();
        OASVariableList variableList4 = new OASVariableList();

        System.assert(variableList1.equals(variableList2));
        System.assert(variableList3.equals(variableList4));
        System.assertEquals(variableList1.hashCode(), variableList2.hashCode());
        System.assertEquals(variableList3.hashCode(), variableList4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVariableList variableList = new OASVariableList();
        Map<String, String> propertyMappings = variableList.getPropertyMappings();
        System.assertEquals('totalNumberOfItems', propertyMappings.get('_totalNumberOfItems'));
        System.assertEquals('embedded', propertyMappings.get('_embedded'));
        System.assertEquals('links', propertyMappings.get('_links'));
    }
}
