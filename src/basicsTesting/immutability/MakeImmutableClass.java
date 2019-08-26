package basicsTesting.immutability;

public final class MakeImmutableClass {

    final String field1;
    final String field2;

    public MakeImmutableClass(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }


}
