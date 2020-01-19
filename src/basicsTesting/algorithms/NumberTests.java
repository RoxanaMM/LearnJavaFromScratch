package basicsTesting.algorithms;

import static java.lang.StrictMath.sqrt;

public class NumberTests {

    public static boolean checkIfPrime(int x) {
        for (int i = 2; i <= sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int x) {
        int sum = 0;
        while (x >= 0) {
            sum = x % 10;
            x = x / 10;
        }
        return sum;
    }

    private static void printResultForPrime(int numberToCheck, boolean isPrime) {
        System.out.println(numberToCheck);
        if (isPrime) {
            System.out.println(" is prime");
        } else {
            System.out.println(" is not  prime");
        }
    }

    private static void printResultForSum(int numberToCheck) {
        System.out.println(sumOfDigits(numberToCheck));
    }

    public static void main(String... args) {
        boolean prime = false;
        for (int i = 0; i < 100; i++) {
            prime = checkIfPrime(i);
            printResultForPrime(i, prime);
        }

        for (int i = 0; i < 100; i++) {
            printResultForSum(i);
        }

    }
}
