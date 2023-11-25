import java.util.*;

public class MonotonicStack {

    public static void increasingStack(int[] arr, int size) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
                while(stack.size() > 0 && stack.peek() < arr[i]){
                    stack.pop();
                }
                stack.push(arr[i]);
        }

        int  N2 = stack.size();
        int[] ans = new int [N2];
        Arrays.fill(ans, 0);
        int j = N2-1;
      while(j>=0){
        ans[j]=stack.peek();
        stack.pop();
        j--;
      }

        System.out.println("the stack is");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Increasing Stack is :");
        for(int i=0;i<N2;i++){
            System.out.print(ans[i] + " ");
        }


    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 6, 4, 20, 45, 12, 10 };
        int N = arr.length;
        increasingStack(arr, N);

    }
}
