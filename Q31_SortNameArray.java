// Q31 Write a java program to sort the given names.

import java.util.Scanner;
import java.util.Arrays;

public class Q31_SortNameArray {
    public static void main(String[] args) {
        System.out.print("Q31 Write a java program to sort the given names.\n\n");
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = Sc.nextInt();

        String[] names=new String [n];

        System.out.print("Enter names: ");
        for (int i = 0; i < n; i++) {
            names[i] = Sc.next();
        }

        Arrays.sort(names);

        System.out.print("The names in alphabetical order are: ");
        for (int j = 0; j < n; j++) {
            System.out.print(names[j] + " ");
        }
    }
}
