import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        int dots = 1;
        int spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= dots; k++) {
                if (k % 2 == 0) {
                    System.out.print(i - 1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            dots += 2;
            spaces--;
        }
        dots = rows * 2 - 3;
        spaces = 1;
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= dots; k++) {
                if (k % 2 == 0) {
                    System.out.print(i - 1);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            dots -= 2;
            spaces++;
        }

    }
}
