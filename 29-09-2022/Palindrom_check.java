import java.util.Scanner;

public class Palindrom_check {
    public static void main(String[] args) {
        // check if a string is palindrom or not
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("The string is palindrom");
        } else {
            System.out.println("The string is not palindrom");
        }
    }
}
