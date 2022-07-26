// Q36 Write a menu driven program for array. Provide choice to insert, delete, search, display and exit.

import java.util.Scanner;

    public class Q36_InDelSeaDisExitArray {

        static void AlgoMenu(){
            System.out.println("=============================");
            System.out.println("          Algo-Menu           ");
            System.out.println("Press '0' :- Algo-Menu. ");
            System.out.println("Press '1' :- Program to count a total number of unique elements in an array. ");
            System.out.println("Press '2' :- Program in to find the sum and average of all elements of the array. ");
            System.out.println("Press '3' :- Program to find the second largest element in an array. ");
            System.out.println("Press '4' :- Program to input n number of elements in an array and separate them into even and odd two different arrays. ");
            System.out.println("Press '5' :- Program to find maximum and minimum number from given array by passing array to the function. ");
            System.out.println("Press '6' :- Program to find the arithmetic operators of given number in an array. ");
            System.out.println("Press '7' :- Back ");

            System.out.println("=============================");
        }

        static void CountUniqueEleArr(int [] arr, int n){
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

        static void SumAverageArray(int [] arr, int n){

            int sum = 0;
            float average;

            for(int i = 0;i < n; i++){;
                sum = sum + arr[i];
            }

            System.out.println("Sum: " + sum);
            average = (float)sum / n;
            System.out.println("Average: " + average);
        }

        static void SecondLargestEleArray(int [] arr, int n){
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

        static void EvenAndOddArray(int [] arr, int n){
            int flag = 0;

            String even = "";
            String odd = "";

            for(int i=0;i<n;++i){
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

        static void MaxAndMinArr(int [] arr, int n){
            int min = arr[0];
            int max = arr[0];

            for(int i=0;i<n;++i){
                if(arr[i]<min){
                    min=arr[i];
                }
                if(arr[i]>max){
                    max=arr[i];
                }
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }

        static void MathOp(int [] arr, int n){
            int add=0,sub=0,mul=1;

            for(int i=0;i<n;i++){
                add += arr[i];
                sub -= arr[i];
                mul *= arr[i];
            }
            System.out.println("Addition: " + add);
            System.out.println("Subtraction: " + sub);
            System.out.println("Multiplication: " + mul);
        }

        static void Menu(){
            System.out.println("=============================");
            System.out.println("            Menu              ");
            System.out.println("Press '1' :- Menu ");
            System.out.println("Press '2' :- Exit ");
            System.out.println("Press '3' :- Insert ");
            System.out.println("Press '4' :- Delete ");
            System.out.println("Press '5' :- Search ");
            System.out.println("Press '6' :- Display ");
            System.out.println("Press '7' :- Algorithm ");

            System.out.println("=============================");

        }

        static void Exit(){
            System.out.println();
            System.out.println("-------------------- THANK YOU -----------------------");
            System.out.println("------------------------------------------------------");
            System.out.println("         |----    /\\    /   |---| ");
            System.out.println("         |----   /   \\  /   |    | ");
            System.out.println("         |----  /     \\/    |___| ");
            System.out.println("------------------------------------------------------");
            System.out.println("--------------CREATED-BY-PRATISH-SHRIVASTAVA----------");
            System.out.println();

        }

        static int Insert(int [] arr, int n){
            Scanner Sc = new Scanner(System.in);

            int val, pos;

            System.out.println("Enter the value you want to insert.");
            val = Sc.nextInt();

            System.out.println("Enter the Position you want to insert the '" + val + "' in. ( Note the array size is '" + (n) + "'. So, You can insert value in '1-"+ (n+1) + "'. )");
            pos = Sc.nextInt();

            if(pos<=0 || pos>n+1){
                System.out.println("Invalid Values");
            }else{
                for(int i=n-1; i>=pos-1;i--){
                    arr[i+1] = arr[i];
                }
                arr[pos-1] = val;
                n++;
                Display(arr, n);
                return n;
            }
            return n;
        }

        static int Delete(int [] arr, int n){
            Scanner Sc = new Scanner(System.in);

            System.out.println("Note the array size is '" + (n) + "'. So, You can Delete value in '1-"+ n + "'. )");
            System.out.print("Enter the Position. Where you want to Delete the Array: "); // here
            Display(arr, n);
            int pos = Sc.nextInt();

            if(pos<=0 || pos>n){
                System.out.println("Invalid Values.");
            }else{
                for(int i = pos-1;i<n-1;++i){
                    arr[i] = arr[i+1];
                }
                System.out.println("Done.");
                n--;
                Display(arr, n);
                return n;
            }
            return n;
        }

        static void Display(int [] arr, int n){
            Scanner Sc = new Scanner(System.in);

            System.out.println("Current array is: ");
            System.out.print("[");
            for(int i=0;i<n;++i){
                System.out.print(" " + arr[i]);
                if(i != n-1){
                    System.out.print(",");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("]");
            System.out.println();
        }

        static void Search(int [] arr, int n){
            Scanner Sc = new Scanner(System.in);

            System.out.print("Enter values you want to search: ");
            int sea = Sc.nextInt();
            int i, flag = 0;

            for(i=0;i<n;++i){
                if(sea == arr[i]) {
                    System.out.println("The Position of '" + arr[i] + "' is " + (i+1) + ".");
                    flag = 1;
                    //break;
                }
            }

            if(flag == 0){
                System.out.println("Not Found");
            }
//            else{
//                Display(arr, n);
//                for(int j=0; j<=i; j++){
//                    if(j == i){
//                        System.out.print("  ");
//                    }else{
//                        System.out.print("   ");
//                    }
//                }
//                System.out.print("^");
//            }
        }

        public static void main(String[] args) {
            Scanner Sc = new Scanner(System.in);

            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println("         |----  -----  |----|  |----|  -----");
            System.out.println("         |---|    |    |____|  |-\\ _|    |  ");
            System.out.println("         ----|    |    |    |  |  \\      |  " );
            System.out.println("------------------------------------------------------");
            System.out.println();

            Menu();

            int num=0;
            int[] arr = new int[100];

            System.out.print("Enter the size of array: ");
            num = Sc.nextInt();

            System.out.print("Enter the value of array: ");
            for(int i=0;i<num;++i){
                arr[i] = Sc.nextInt();
            }

            System.out.print("Done.\n");

            while(true){
                System.out.print("\n>> ");
                int n = Sc.nextInt();

                switch (n){
                    case 1:
                        Menu();
                        break;
                    case 2:
                        Exit();
                        System.exit(0);
                    case 3:
                        num = Insert(arr, num);
                        break;
                    case 4:
                        num = Delete(arr, num);
                        break;
                    case 5:
                        Search(arr, num);
                        break;
                    case 6:
                        Display(arr, num);
                        break;
                    case 7:
                        AlgoMenu();

                        while(true) {
                            System.out.print("\n>> Algo-Menu >> ");
                            int nn = Sc.nextInt();

                            if(nn == 0) {
                                AlgoMenu();
                            } else if (nn==1) {
                                CountUniqueEleArr(arr, num);
                            } else if (nn==2) {
                                SumAverageArray(arr, num);
                            }else if (nn==3) {
                                SecondLargestEleArray(arr, num);
                            }else if (nn==4) {
                                EvenAndOddArray(arr, num);
                            }else if (nn==5) {
                                MaxAndMinArr(arr, num);
                            }else if (nn==6) {
                                MathOp(arr, num);
                            }else if (nn==7) {
                                System.out.println("You are Now on Main Menu.");
                                Menu();
                                break;
                            }else{
                                System.out.println("Sorry 'Wrong' command. There is no command '" + nn);
                            }
                        }
                        break;
                    default:
                        System.out.println("Sorry 'Wrong' command. There is no command '" + n +  "'. \nPlease try '1' for MENU OR '2' for EXIT. ");
                }
            }
        }
    }