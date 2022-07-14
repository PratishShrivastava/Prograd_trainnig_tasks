// Q28 Find the sum of 1 to n numbers using recursion.

import java.util.Scanner;

public class Q28_SumOfNumRecursion {
    public static int AddNum(int num) {
        if (num != 0)
            return num + AddNum(num - 1);
        else
            return num;
    }
    public static void main(String[] args) {
        System.out.print("Q28 Find the sum of 1 to n numbers using recursion.\n\n");
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a number to Find the Sum: ");
        int num = Sc.nextInt();

        System.out.print("The Sum of "+ num + " is: " + AddNum(num));
    }
}
