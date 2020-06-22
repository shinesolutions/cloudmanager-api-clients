@isTest
private class OASVariableListEmbeddedTest {
    @isTest
    private static void equalsSameInstance() {
        OASVariableListEmbedded variableListEmbedded1 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded2 = variableListEmbedded1;
        OASVariableListEmbedded variableListEmbedded3 = new OASVariableListEmbedded();
        OASVariableListEmbedded variableListEmbedded4 = variableListEmbedded3;

        System.assert(variableListEmbedded1.equals(variableListEmbedded2));
        System.assert(variableListEmbedded2.equals(variableListEmbedded1));
        System.assert(variableListEmbedded1.equals(variableListEmbedded1));
        System.assert(variableListEmbedded3.equals(variableListEmbedded4));
        System.assert(variableListEmbedded4.equals(variableListEmbedded3));
        System.assert(variableListEmbedded3.equals(variableListEmbedded3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVariableListEmbedded variableListEmbedded1 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded2 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded3 = new OASVariableListEmbedded();
        OASVariableListEmbedded variableListEmbedded4 = new OASVariableListEmbedded();

        System.assert(variableListEmbedded1.equals(variableListEmbedded2));
        System.assert(variableListEmbedded2.equals(variableListEmbedded1));
        System.assert(variableListEmbedded3.equals(variableListEmbedded4));
        System.assert(variableListEmbedded4.equals(variableListEmbedded3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVariableListEmbedded variableListEmbedded1 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded2 = new OASVariableListEmbedded();

        System.assertEquals(false, variableListEmbedded1.equals('foo'));
        System.assertEquals(false, variableListEmbedded2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVariableListEmbedded variableListEmbedded1 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded2 = new OASVariableListEmbedded();
        OASVariableListEmbedded variableListEmbedded3;

        System.assertEquals(false, variableListEmbedded1.equals(variableListEmbedded3));
        System.assertEquals(false, variableListEmbedded2.equals(variableListEmbedded3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVariableListEmbedded variableListEmbedded1 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded2 = new OASVariableListEmbedded();

        System.assertEquals(variableListEmbedded1.hashCode(), variableListEmbedded1.hashCode());
        System.assertEquals(variableListEmbedded2.hashCode(), variableListEmbedded2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVariableListEmbedded variableListEmbedded1 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded2 = OASVariableListEmbedded.getExample();
        OASVariableListEmbedded variableListEmbedded3 = new OASVariableListEmbedded();
        OASVariableListEmbedded variableListEmbedded4 = new OASVariableListEmbedded();

        System.assert(variableListEmbedded1.equals(variableListEmbedded2));
        System.assert(variableListEmbedded3.equals(variableListEmbedded4));
        System.assertEquals(variableListEmbedded1.hashCode(), variableListEmbedded2.hashCode());
        System.assertEquals(variableListEmbedded3.hashCode(), variableListEmbedded4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASVariableListEmbedded variableListEmbedded = new OASVariableListEmbedded();
        System.assertEquals(new List<OASVariable>(), variableListEmbedded.variables);
    }
}
