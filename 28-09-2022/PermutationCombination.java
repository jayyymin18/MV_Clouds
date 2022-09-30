import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First No.: ");
        int n = input.nextInt();
        System.out.print("Enter the Second No.: ");
        int r = input.nextInt();
        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            nrfact *= i;
        }
        int npr = nfact / nrfact;
        int ncr = nfact / (rfact * nrfact);
        System.out.println("The Permutation is: " + npr);
        System.out.println("The Combination is: " + ncr);

    }
}
