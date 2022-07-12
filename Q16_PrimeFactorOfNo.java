// 16. Program to find all prime factors of given number.

import java.util.Scanner;

public class Q16_PrimeFactorOfNo{
    public static void main(String[] args) {
        System.out.println("16. Program to find all prime factors of given number.\n");

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the No. for all prime factors: ");
        int num = myObj.nextInt();

        int i;

        System.out.print("\nAll Prime Factors of "+ num + " is : ");

        for(i=2;num>1;++i){
            while(num%i==0){
                System.out.print(i + " ");
                num = num/i;
            }
        }



    }
}