package basicsTesting.transition.testingJava7;

public class TestingJava7Class {

    private static int $;

    public static void testStringAndStringBuilder(){
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
    public static void main(String...arg) {
//        System.out.println($);
//        String a_b = null;
//        System.out.println(a_b);
        testStringAndStringBuilder();
    }
}

