// 19. JAVA program to check given number is Armstrong or not.

import java.util.Scanner;

public class Q19_ArmstrongOrNot {
    public static void main(String[] args) {
        System.out.println("19. JAVA program to check given number is Armstrong or not.\n");

        System.out.print("Enter the No. to check given number is Armstrong or not: ");
        Scanner Sc = new Scanner(System.in);

        int start = Sc.nextInt();
        int temp1, temp2, remainder, n = 0, result = 0;

        temp2 = start;
        temp1 = start;

        while (temp1 != 0) {
            temp1 /= 10;
            ++n;
        }

        while (temp2 != 0) {
            remainder = temp2 % 10;
            result += Math.pow(remainder, n);
            temp2 /= 10;
        }

        if (result == start) {
            System.out.print(start + " is an Armstrong number.");
        }else{
            System.out.println(start + " is not an Armstrong number.");
        }

    }
}