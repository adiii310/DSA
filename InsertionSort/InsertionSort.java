package InsertionSort;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr ={5,2,4,1,3};
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}


// checking some git featues while writing these ignore it