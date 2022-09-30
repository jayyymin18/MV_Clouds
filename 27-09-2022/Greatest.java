import java.util.*;

public class Greatest {
    public static void main(String[] args) {
        // take array input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // sort the array
        Arrays.sort(arr);
        // print the second largest element
        System.out.println("Second largest element: " + arr[n - 2]);
    }
}
