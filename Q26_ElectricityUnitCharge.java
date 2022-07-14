/*
Write a program to input electricity unit charge and calculate the total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.
*/
import java.util.Scanner;

public class Q26_ElectricityUnitCharge{
    public static void main(String[] args) {
        System.out.println("Write a program to input electricity unit charge and calculate the total electricity bill according to the given condition:\n" +
                "For first 50 units Rs. 0.50/unit\n" +
                "For next 100 units Rs. 0.75/unit\n" +
                "For next 100 units Rs. 1.20/unit\n" +
                "For unit above 250 Rs. 1.50/unit\n" +
                "An additional surcharge of 20% is added to the bill.\n");

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the electricity unit charge: ");
        double unit = Sc.nextInt();

        double amt, total_amt, sur_charge;

        if(unit <= 50){
            amt = unit * 0.50;
        }
        else if(unit <= 150){
            amt = 25 + ((unit-50) * 0.75);
        }
        else if(unit <= 250){
            amt = 100 + ((unit-150) * 1.20);
        }
        else{
            amt = 220 + ((unit-250) * 1.50);
        }

        sur_charge = amt * 0.20;
        total_amt  = amt + sur_charge;


        System.out.println("\nYour Electricity Bill is Rs. " + total_amt);
    }
}