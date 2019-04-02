import java.util.Scanner;

public class PalindromeRunner {

    public static void main(String args[])
    {
        System.out.println("Enter a string ");
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();

        Palindrome obj = new Palindrome(original);
        System.out.println(obj.checkPalindrome());
    }

}
