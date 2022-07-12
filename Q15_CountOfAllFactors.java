// 15. Program to find count of all factors of given number.

import java.util.Scanner;

public class Q15_CountOfAllFactors{
    public static void main(String[] args) {
        System.out.println("15. Program to find count of all factors of given number.\n");

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the No. for count of all factors: ");
        int num = myObj.nextInt();

        int i=1, count=0;

        while(i<=num){
            if(num%i == 0){
                //System.out.print(i + " ");
                count++;
            }
            i++;
        }

        System.out.print("\nTotal Factors of " + num + "  is : " + count);

    }
}