// 18. JAVA program to reverse the given number.

import java.util.Scanner;

public class Q18_ReverseNo {
    public static void main(String[] args) {
        System.out.println("18. JAVA program to reverse the given number.\n");

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the No. to reverse the given number: ");
        int num = Sc.nextInt();
        int rev = 0;
        int d = num;

        while(num != 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num/10;
        }

        System.out.print("The reverse of "+ d + " is " + rev);
    }
}