/*
Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions
If driver is married
If driver is unmarried male and age above 30
If driver is unmarried female and age above 25
*/
import java.util.Scanner;

public class Q24_IfElseStatement{
    public static void main(String[] args) {
        System.out.println("Write a Java program for Company Insurance Policy. A company insure its driver under the following conditions\n" +
                "If driver is married\n" +
                "If driver is unmarried male and age above 30\n" +
                "If driver is unmarried female and age above 25\n");

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter 'Y' if you are married Or Type 'N' if you are unmarried: ");
        char Ch = Sc.next().charAt(0);

        if(Ch == 'Y' || Ch == 'y'){
            System.out.print("You are eligible for Company Insurance Policy.");
        }else if (Ch == 'N' || Ch == 'n'){
            System.out.print("Enter 'M' if you are male or Type 'F' if you are female: ");
            char Gender = Sc.next().charAt(0);

            System.out.print("Enter your age: ");
            int Age = Sc.nextInt();

            if((Gender == 'm' || Gender == 'M') && (Age>=30)){
                System.out.print("Congratulations! You are eligible for Company Insurance Policy.");
            }else if ((Gender == 'f' || Gender == 'F') && (Age>=25)){
                System.out.print("Congratulations! You are eligible for Company Insurance Policy.");
            }else{
                System.out.print("Sorry, You are NOT eligible for Company Insurance Policy.");
            }
        }else{
            System.out.print("Sorry, You are NOT eligible for Company Insurance Policy.");
        }

    }
}