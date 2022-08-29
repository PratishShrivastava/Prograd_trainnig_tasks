// Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's. // Input: matrix = [[1,1,1],[1,0,1],[1,1,1]] // Output: [[1,0,1],[0,0,0],[1,0,1]]

import java.util.Scanner;

public class intmatrix{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter total rows: ");
        int row = Sc.nextInt();
        System.out.print("Enter total columns: ");
        int column = Sc.nextInt();
        int[][] array = new int[row][column];
        System.out.println("Enter matrix:");

        for(int i = 0; i < row; ++i) {
            for(int j = 0; j < column; ++j) {
                array[i][j] = Sc.nextInt();
            }
        }

        boolean r=false, c = false;

        for(int i=0;i<row;++i)if(array[i][0]==0)c=true;
        for(int j=0;j<column;++j)if(array[0][j]==0)r=true;

        for(int i=1;i<row;++i){
            for(int j=1;j<column;++j){
                if(array[i][j]==0) {
                    array[0][j] = 0;
                    array[i][0] = 0;
                }
            }
        }

        for(int i=1;i<row;++i){
            if(array[i][0] == 0){
                for(int j=0;j<column;++j){
                    array[i][j] = 0;
                }
            }
        }
        for(int j=1;j<column;++j){
            if(array[0][j] == 0){
                for(int i=0;i<row;++i){
                    array[i][j] = 0;
                }
            }
        }

        if(r){
            for(int j=0;j<column;j++){
                array[0][j] = 0;
            }
        }

        if(c){
            for(int i=0;i<row;i++){
                array[i][0] = 0;
            }
        }

        System.out.println("The above matrix is after 0's replace");

        for(int i = 0; i < row; ++i) {
            for(int j = 0; j < column; ++j) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println(" ");
        }
    }
}


