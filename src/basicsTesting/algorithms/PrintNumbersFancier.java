package basicsTesting.algorithms;

public class PrintNumbersFancier {

    private static void printNumbersZerosAndOnes(int max) {
        int nr = 1, helper = 1;
        int i = 2;
        System.out.println(1);
        while (i <= max) {
            helper = helper * 100;
            System.out.println(nr * helper + 1);
            i = i + 1;
        }
    }

    private static void printFivesAndLess(int max) {
        int nr = 5, helper = 5, helper2 = 5;
        for (int i = 0; i < max; i++) {
            while (helper <= nr) {
                System.out.print(helper);
                helper = helper + 1;
            }
            System.out.println();
            helper = helper2 - 1;
            helper2 = helper;
        }
    }

    private static void printNumbersAscending(int max) {
        int nr = 1;
        for (int i = 0; i < max; i++) {
            int helper = 1;
            while (helper <= nr) {
                System.out.print(helper);
                helper = helper + 1;
            }
            System.out.println();
            nr = nr + 1;
        }
    }

    public static void main(String... args) {
        int max = 5;
        printNumbersZerosAndOnes(max);
        printFivesAndLess(max);
        printNumbersAscending(max);

    }
}
