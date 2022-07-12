// 13. Program to print count of all prime numbers upto given number.

import java.util.Scanner;

public class Q13_CountOfAllPrimeNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("13. Program to print count of all prime numbers upto given number.\n\n");

        int num,count=0;

        boolean flag = true;


        System.out.print("Enter the point to print the count of prime number: ");
        num = sc.nextInt();

        for (int i = 2; i <= num; ++i){
            for(int j = 2;j<i;++j){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }else{
                flag = true;
            }

        }
        System.out.print("\nTotal no. of prime is " + count);
        System.out.print("\nThank You");

    }
}
