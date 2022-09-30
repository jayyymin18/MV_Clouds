import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {
        // transpose of a matrix
        System.out.println("Enter the number of rows and columns of matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[col][row];
        System.out.println("Enter the elements of matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                b[j][i] = a[i][j];
            }
        }
        System.out.println("The transpose of matrix is");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
