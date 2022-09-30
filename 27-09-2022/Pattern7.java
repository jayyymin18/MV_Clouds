public class Pattern7 {
    public static void main(String[] args) {
        int rows = 13;
        int cols = 13;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == 1 || j == cols || j == i || j == cols - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
