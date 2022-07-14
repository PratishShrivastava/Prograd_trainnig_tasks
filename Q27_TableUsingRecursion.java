// Q27 Find the table of given number using recursion.

import java.util.Scanner;

public class Q27_TableUsingRecursion {
    static void Table(int num,int i) {
        if(i>10){
            System.out.print("\nThis is Table of " + num + " from 1 to 10.");
            return;
        }

        System.out.print(num * i + " ");

        Table(num, i+1);
    }
    public static void main(String[] args) {
        System.out.print("Q27 Find the table of given number using recursion.\n");
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a number to Find the table: ");
        int num = Sc.nextInt();

        Table(num,1);
    }
}
