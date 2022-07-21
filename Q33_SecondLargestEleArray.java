// Q33 JAVA program to find the second largest element in an array.

import java.util.Scanner;

public class Q33_SecondLargestEleArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = Sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the values of array: ");
        for(int i=0;i<n;++i){
            arr[i] = Sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<n;++i){
            if(arr[i]>max){
                second = max;
                max = arr[i];
            }
            if(arr[i] < max && arr[i] > second){
                second = arr[i];
            }
        }

        System.out.print("The second largest no. is " + second);
    }
}