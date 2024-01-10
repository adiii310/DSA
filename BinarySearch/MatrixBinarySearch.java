package BinarySearch;

import java.util.Arrays;

//n -- matrix sorted both rowwise and column wise.
public class MatrixBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 },
        };
        int count =1 ;
        int row = 0, col = arr[0].length - 1;
        int target = 3;
        int [] output= {-1,-1};
        while (row<arr.length && col>=0) {
            System.out.println( "running " + count + " times");
            count++;
            if (arr[row][col] == target) {
                output[0]=row;
                output[1]=col;
                break;
            }else if(arr[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
