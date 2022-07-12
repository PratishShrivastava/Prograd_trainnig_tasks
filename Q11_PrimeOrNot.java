// 11. Program to check given number is prime or not.

import java.util.Scanner;

public class Q11_PrimeOrNot {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("11. Program to check given number is prime or not.\n\n");

        System.out.println("Enter the numbers to check no. is prime or not : ");
        int num = myObj.nextInt();

        boolean flag = false;

        for (int i = 2; i <= num / 2; ++i){
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println(num + " is a prime number.");
        }else{
            System.out.println(num + " is not a prime number.");
        }

        System.out.printf("\nThank You");
    }
}
