// Q32 JAVA program to count a total number of unique elements in an array.

import java.util.Scanner;

public class Q32_CountUniqueEleArr {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = Sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;++i){
            arr[i] = Sc.nextInt();
        }

        int count = 1;

        for(int i = 1; i < n; i++) {
            int j;
            for(j=0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    break;
                }
            }
            if(i == j){
                count++;
            }
        }
        System.out.println("The count is " + count);
    }
}
