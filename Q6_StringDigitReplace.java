// Q6 Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string. Note: input will never be an empty string.

import java.util.Scanner;

public class Q6_StringDigitReplace {
    public static void main(String[] args) {
        System.out.printf("\nQ6 Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string. Note: input will never be an empty string\n\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Write the digits : ");
        String s = sc.nextLine();

        String result = "";

        for(int i=0;i<s.length();i++){
            int a = s.charAt(i);
            if(a<53){
                result=result + "0";
            }
            if(a>=53){
                result=result + "1";
            }
        }
        System.out.print("\nString is : " + result);
    }
}