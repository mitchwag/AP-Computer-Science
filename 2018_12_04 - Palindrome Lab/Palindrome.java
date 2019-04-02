import java.lang.reflect.Array;

public class Palindrome {

    String original;

    Palindrome(String original) {
        this.original = original;
    }

    String checkPalindrome() {
        char arrOriginal[] = original.toCharArray();
        int length = arrOriginal.length;

        char arrReverse[] = new char[length];
        for (int i = 0; i < length; i++) {
            arrReverse[i] = arrOriginal[length - 1 - i];
        }

        boolean isPalindrome = true;
        for (int i = 0; i < length; i++) {
            if (arrReverse[i] != arrOriginal[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome == true) {
            return "String is palindrome!";
        } else {
            return "String is not palindrome!";
        }
    }
}
