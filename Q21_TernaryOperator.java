// 21. Find the greater between four numbers using Nested Conditional Operator.

import java.util.Scanner;

public class Q21_TernaryOperator {
    public static void main(String[] args) {
        System.out.println("\n21. Find the greater between four numbers using Nested Conditional Operator.\n");

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int num1 = Sc.nextInt();

        System.out.print("Enter the 2st Number: ");
        int num2 = Sc.nextInt();

        System.out.print("Enter the 3st Number: ");
        int num3 = Sc.nextInt();

        System.out.print("Enter the 4st Number: ");
        int num4 = Sc.nextInt();

        int maxNum = ((num1 > num2 ? num1 : num2) > (num3 > num4 ? num3 : num4) ? (num1 > num2 ? num1 : num2) : (num3 > num4 ? num3 : num4));

        System.out.println("\nThe largest number among " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + " is " + maxNum);
    }
}