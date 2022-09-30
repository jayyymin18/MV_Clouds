import java.util.Scanner;

public class Reverse_stringOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }
}
