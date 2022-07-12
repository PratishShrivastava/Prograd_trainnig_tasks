// 20. JAVA Program to Display Armstrong Number between Two Intervals.

import java.util.Scanner;

public class Q20_AllArmstrongNoRange {
    public static void main(String[] args) {
        System.out.println("20. JAVA Program to Display Armstrong Number between Two Intervals.\n");

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the Lower limit: ");
        int start = Sc.nextInt();

        System.out.print("Enter the Higer limit: ");
        int end = Sc.nextInt();
        int i, temp1, temp2, remainder, n = 0, result = 0;


        for(i = start; i < end; ++i) {
            temp2 = i;
            temp1 = i;

            while (temp1 != 0) {
                temp1 /= 10;
                ++n;
            }

            while (temp2 != 0) {
                remainder = temp2 % 10;
                result += Math.pow(remainder, n);
                temp2 /= 10;
            }

            if (result == i) {
                System.out.print(i + " ");
            }

            n = 0;
            result = 0;
        }
    }
}