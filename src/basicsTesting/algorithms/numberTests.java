package basicsTesting.algorithms;

import static java.lang.StrictMath.sqrt;

public class numberTests {

    public boolean checkIfPrime(int x) {
        for (int i = 2; i <= sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfDigits(int x) {
        int sum = 0;
        while (x >= 0) {
            sum = x % 10;
            x = x / 10;
        }
        return sum;
    }

    public static void main(String... args) {

    }
}
