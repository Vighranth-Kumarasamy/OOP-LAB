import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num, rev = 0;
        
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        
        if (original == rev) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }
        scanner.close();
    }
}
