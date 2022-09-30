import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;

class OddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int n = sc.nextInt();
        List<Integer> jai = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + (i + 1) + " : ");
            jai.add(sc.nextInt());
        }

        // print all the odd elements
        System.out.println("Odd elements are");
        for (int i = 0; i < jai.size(); i++) {
            if (jai.get(i) % 2 != 0) {
                System.out.println(jai.get(i));
            }
        }

        // print all the even elements
        System.out.println("Even elements are");
        for (int i = 0; i < jai.size(); i++) {
            if (jai.get(i) % 2 == 0) {
                System.out.println(jai.get(i));
            }
        }

    }

    static boolean isListOdd(List<Integer> jai) {
        for (int i : jai) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }
}
