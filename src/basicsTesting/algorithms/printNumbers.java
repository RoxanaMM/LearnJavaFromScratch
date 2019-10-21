package basicsTesting.algorithms;

public class printNumbers {

    private static void printNumbersZerosAndOnes() {
        int nr = 1;
        int helper = 1;
        for (int i = 0; i < 5; i++) {
            if (nr == helper) {
                System.out.println(nr * helper);
            } else {
                System.out.println(nr * helper + 1);
            }
            helper = helper * 100;
        }
    }

    private static void printFivesAndLess() {
        int nr = 5;
        int helper = 5;
        int helper2 = 5;
        for (int i = 0; i < 6; i++) {
            while (helper <= nr) {
                System.out.print(helper);
                helper = helper + 1;
            }
            System.out.println();
            helper = helper2 - 1;
            helper2 = helper;
        }
    }

    private static void printNumbersAscending() {
        int nr = 1;
        for (int i = 0; i < 5; i++) {
            int helper = 1;
            while (helper <= nr) {
                System.out.print(helper);
                helper = helper + 1;
            }
            System.out.println();
            nr = nr +1;
        }
    }

    public static void main(String... args) {
        printNumbersZerosAndOnes();
        printFivesAndLess();
        printNumbersAscending();

    }
}
