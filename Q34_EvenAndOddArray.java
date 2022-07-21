// Q34 JAVA program to input n number of elements in an array and separate them into even and odd two different arrays.

import java.util.Scanner;

public class Q34_EvenAndOddArray {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = Sc.nextInt();

        int[] arr = new int[n];
        int flag = 0;

        String even = "";
        String odd = "";

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;++i){
            arr[i] = Sc.nextInt();

            if(arr[i]==0){
                flag=1;
                continue;
            }else if(arr[i]%2 == 0){
                even = even + arr[i] + " ";
            }
            else{
                odd = odd + arr[i] + " ";
            }
        }

        if(flag==1){
            System.out.println("Note -> '0' is not even or odd.");
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);


    }
}