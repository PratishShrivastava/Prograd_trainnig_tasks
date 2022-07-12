// 14. Program to find all factors of the given number.

import java.util.Scanner;

public class Q14_FactorOFno{
    public static void main(String[] args) {
        System.out.println("14. Program to find all factors of the given number.\n");

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the No. for all factors: ");
        int num = myObj.nextInt();

        int i=1;

        while(i<=num){
            if(num%i == 0){
                System.out.print(i + " ");
            }
            i++;
        }

    }
}