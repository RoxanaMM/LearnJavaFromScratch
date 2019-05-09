package basicsTesting.palindrome;

public class PalindromeChecking {

    public static boolean isPalindrome(String word) {
        int length = word.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("palindrome!");
        } else {
            System.out.println("!palindrome");
        }
        return true;
    }

    public static void calculate(String correctWord) {
        String reverted = "";
        String takeCorrectWord = correctWord;

        StringBuffer correctWordToTest = new StringBuffer("c");
        System.out.println("This is their method " + correctWordToTest.reverse().toString());

        int wordLength;
        do {
            wordLength = correctWord.length();
            reverted = reverted + correctWord.substring(wordLength - 1);
            correctWord = correctWord.substring(0, wordLength - 1);
        } while (correctWord.length() != 0);

        if (takeCorrectWord.equals(reverted)) {
            System.out.println(reverted);
        }

    }


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String correctWord = "deled";
        calculate(correctWord);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);


        startTime = System.currentTimeMillis();

        isPalindrome("deled");
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }
}
