package LinearSearch;

public class linearSearch {

    public static void main(String[] args) {
        int[] arr = { 1, 45, 6, -4, 84, 69, 23, 12, 80 };
        int target = 84;
        // System.out.println(lineraserach(arr, target));
        // System.out.println(lineraserach2(arr, target));
        System.out.println(lineraserachRange(arr, target,1,8));

    }

// Simple Linear Search with integer output.
    static int lineraserach(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

// Linear Search with boolean output
    static boolean lineraserach2(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }


// finding element within specific Range.
    static int lineraserachRange(int[] arr, int target, int start, int end) {

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}