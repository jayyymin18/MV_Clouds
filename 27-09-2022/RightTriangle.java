import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        // print right triangle border
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
