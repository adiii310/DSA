package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int max=Integer.MIN_VALUE;
            int maxIndex=-1;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>max) {
                    max=arr[j];
                    maxIndex= j;
                }
            }

            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex]= temp;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
