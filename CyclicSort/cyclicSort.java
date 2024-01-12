package CyclicSort;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] arr = {5,3,2,4,1};
        int i=0;
        while (i<arr.length){
            int current = arr[i]-1;
            if(arr[i] != arr[current]){
                int temp = arr[current];
                arr[current] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
