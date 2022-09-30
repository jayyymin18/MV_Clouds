import java.util.Arrays;
import java.util.*;

public class Sort_alphabetically {
    public static void main(String args[]) {
        System.out.print("Enter string: ");
        // take a string as input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // convert string to char array
        char[] ch = s.toCharArray();
        // sort the char array
        Arrays.sort(ch);
        // convert char array to string
        String s1 = new String(ch);
        System.out.println("String after sorting: " + s1);
    }
}
