// Q30 Write a program in to find the sum and average of all elements of the array.
import java.util.Scanner;

public class Q30_SumAverageArray {
    public static void main(String[] args) {
        System.out.print("Q30 Write a program in to find the sum and average of all elements of the array.\n\n");
        Scanner Sc = new Scanner(System.in);

        int n, sum = 0;
        float average;

        System.out.print("Enter no. of elements you want in array: ");
        n = Sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter all the elements: ");
        for(int i = 0;i < n; i++){
            arr[i] = Sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum: "+sum);
        average = (float)sum / n;
        System.out.println("Average: "+average);
    }
}
