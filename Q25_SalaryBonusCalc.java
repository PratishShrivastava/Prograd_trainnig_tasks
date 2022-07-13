/*
Write a Java program for bonus calculation. Accept basic salary from user.
Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then
give 10% bonus otherwise give 20% bonus on basic salary.
Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus - PF)
*/
import java.util.Scanner;

    public class Q25_SalaryBonusCalc{
        public static void main(String[] args) {
            System.out.println("Write a Java program for bonus calculation. Accept basic salary from user. \n" +
                    "Calculate TA = 10%, DA= 15%, HRA = 20%, PF= 12% of basic salary. If basic >= 20,000 then \n" +
                    "give 10% bonus otherwise give 20% bonus on basic salary. \n" +
                    "Calculate his gross (final) salary ( gross salary = Basic + DA + TA + HRA + Bonus – PF)\n");

            Scanner Sc = new Scanner(System.in);

            System.out.print("Enter your Basic salary: ");
            double salary = Sc.nextInt();

            double TA = 0.1 * salary;
            double DA = 0.15 * salary;
            double HRA = 0.2 * salary;
            double PF = 0.12 * salary;
            double Bonus;

            if(salary >= 20000){
                Bonus = 0.1 * salary;

                System.out.print("You will get 10% Bonus: ");
                System.out.print(Bonus);
            }else{
                Bonus = 0.2 * salary;

                System.out.print("You will get 20% Bonus: ");
                System.out.println(Bonus);
            }

            System.out.println("\nYour Gross Salary is " + (salary + DA + TA + HRA + Bonus - PF));

        }
    }

