// 12. Program to print all prime numbers between given range.

import java.util.Scanner;

public class Q12_PrimeNoToRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("12. Program to print all prime numbers between given range.\n\n");

        int num1, num2, i, j, flag;

        System.out.print("Enter start point to print prime number: ");
        num1 = sc.nextInt();

        System.out.print("\nEnter end point to print prime number: ");
        num2 = sc.nextInt();


        System.out.print("\nPrime numbers between " + num1 + " and " + num2 + " are: ");

        for (i = num1; i <= num2; i++) {
            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1){
                System.out.print(i + " ");
            }
        }

        System.out.print("\nThank You");

    }
}
