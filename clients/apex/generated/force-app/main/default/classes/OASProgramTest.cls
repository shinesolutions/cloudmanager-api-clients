@isTest
private class OASProgramTest {
    @isTest
    private static void equalsSameInstance() {
        OASProgram program1 = OASProgram.getExample();
        OASProgram program2 = program1;
        OASProgram program3 = new OASProgram();
        OASProgram program4 = program3;

        System.assert(program1.equals(program2));
        System.assert(program2.equals(program1));
        System.assert(program1.equals(program1));
        System.assert(program3.equals(program4));
        System.assert(program4.equals(program3));
        System.assert(program3.equals(program3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASProgram program1 = OASProgram.getExample();
        OASProgram program2 = OASProgram.getExample();
        OASProgram program3 = new OASProgram();
        OASProgram program4 = new OASProgram();

        System.assert(program1.equals(program2));
        System.assert(program2.equals(program1));
        System.assert(program3.equals(program4));
        System.assert(program4.equals(program3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASProgram program1 = OASProgram.getExample();
        OASProgram program2 = new OASProgram();

        System.assertEquals(false, program1.equals('foo'));
        System.assertEquals(false, program2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASProgram program1 = OASProgram.getExample();
        OASProgram program2 = new OASProgram();
        OASProgram program3;

        System.assertEquals(false, program1.equals(program3));
        System.assertEquals(false, program2.equals(program3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASProgram program1 = OASProgram.getExample();
        OASProgram program2 = new OASProgram();

        System.assertEquals(program1.hashCode(), program1.hashCode());
        System.assertEquals(program2.hashCode(), program2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASProgram program1 = OASProgram.getExample();
        OASProgram program2 = OASProgram.getExample();
        OASProgram program3 = new OASProgram();
        OASProgram program4 = new OASProgram();

        System.assert(program1.equals(program2));
        System.assert(program3.equals(program4));
        System.assertEquals(program1.hashCode(), program2.hashCode());
        System.assertEquals(program3.hashCode(), program4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASProgram program = new OASProgram();
        Map<String, String> propertyMappings = program.getPropertyMappings();
        System.assertEquals('links', propertyMappings.get('_links'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASProgram program = new OASProgram();
        System.assertEquals(false, program.enabled);
        System.assertEquals(null, program.id);
        System.assertEquals(null, program.name);
        System.assertEquals(null, program.tenantId);
        System.assertEquals(null, program.imsOrgId);
        System.assertEquals(null, program.links);
    }
}
