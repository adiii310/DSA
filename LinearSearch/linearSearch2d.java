package LinearSearch;

import java.util.Arrays;

public class linearSearch2d {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 4, 7 },
                { 45, 67, 34, 98, 12 },
                { 6, 99, 57, 2, 9 },
        };
        int target = 356;
        int[] ans = linearsearch2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] linearsearch2d(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[] { row, column };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
