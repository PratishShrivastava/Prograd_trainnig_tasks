// 17. JAVA program to print sum of digits. (eg. 512 = 8)

import java.util.Scanner;

public class Q17_SumOfDigits {
    public static void main(String[] args) {
        System.out.println("17. JAVA program to print sum of digits. (eg. 512 = 8)\n");

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the No. to print sum of digits: ");
        int num = Sc.nextInt();

        int digit; int sum=0;

        while(num>0){
            digit = num%10;

            sum += digit;

            num /= 10;
        }
        System.out.print("The sum is " + sum);
    }
}