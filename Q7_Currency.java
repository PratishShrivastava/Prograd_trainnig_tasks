// Q7 Mr. Lalwani having Some Currency. The currency having number as Palidrome gets 3 times more than the currency. So help out Mr. Lalwani to check which currency going to give him 3 times return.

import java.util.Scanner;

public class Q7_Currency {
    public static void main(String[] args) {
        System.out.printf("\nQ7 Mr. Lalwani having Some Currency. The currency having number as Palidrome gets 3 times more than the currency. So help out Mr. Lalwani to check which currency going to give him 3 times return.\n\n");

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the currency you have Mr. Lalwani: ");
        int currency = sc.nextInt();

        System.out.print("Enter the currency having a number: ");
        int currencyn=sc.nextInt();

        int r,sum=0,temp;

        temp=currencyn;

        while(currencyn>0){
            r=currencyn%10;
            sum=(sum*10)+r;
            currencyn=currencyn/10;
        }
        if(temp==sum){
            System.out.print("Wow Lucky you get three time more.\n");
            System.out.print("Now you have $" + currency*3 + " Currency.");
        }else
            System.out.println("OH! Bad luck. your Currency is same as before $" + currency);
    }
}