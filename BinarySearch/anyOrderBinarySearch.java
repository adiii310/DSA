package BinarySearch;

public class anyOrderBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { 14, 9, 14, 35, 40, 57, 69, 88, 90 };
        int[] arr = { 100, 89, 76, 68, 57, 34, 30, 35, 34 };
        int target = 101;
        System.out.println(orderlessBinarySearch(arr, target));
    }

    static int orderlessBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
