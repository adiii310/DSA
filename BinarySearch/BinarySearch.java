package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,4,9,14,35,40,57,69,88,90 };
        int target = 57;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }
        }

        return -1;
    }
}
