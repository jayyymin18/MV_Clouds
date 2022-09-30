import java.util.Scanner;

public class diceCombination {
    public static void main(String[] args) {
        System.out.println("Ebter number of dice Rolled (KEEP BETWEEN 1 TO 6): ");
        Scanner input = new Scanner(System.in);
        int dice = input.nextInt();
        System.out.println("Enter sum:");
        int sum = input.nextInt();
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    for (int l = 1; l <= 6; l++) {
                        for (int m = 1; m <= 6; m++) {
                            for (int n = 1; n <= 6; n++) {
                                if (dice == 1) {
                                    if (i == sum) {
                                        count++;
                                    }
                                } else if (dice == 2) {
                                    if (i + j == sum) {
                                        count++;
                                    }
                                } else if (dice == 3) {
                                    if (i + j + k == sum) {
                                        count++;
                                    }
                                } else if (dice == 4) {
                                    if (i + j + k + l == sum) {
                                        count++;
                                    }
                                } else if (dice == 5) {
                                    if (i + j + k + l + m == sum) {
                                        count++;
                                    }
                                } else if (dice == 6) {
                                    if (i + j + k + l + m + n == sum) {
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("The number of ways to get sum " + sum + " is " + count);

    }
}
