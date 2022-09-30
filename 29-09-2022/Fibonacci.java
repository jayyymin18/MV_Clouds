import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // print fibonacci series upto n terms
        System.out.println("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
