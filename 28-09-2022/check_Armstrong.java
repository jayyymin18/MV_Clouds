import java.util.Scanner;

public class check_Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }
    }
}
