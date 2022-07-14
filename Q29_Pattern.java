/*
Task 29 :
Write a Java program to print following alphabet pattern
A B C D E
B C D E
C D E
D E
E
*/
import java.util.Scanner;

public class Q29_Pattern {
    public static void main(String[] args) {
        String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter a number to find the pattern: ");
        int num = Sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                char Ch = word.charAt(j);
                System.out.print(Ch + " ");
            }
            System.out.println();
        }
    }
}