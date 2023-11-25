import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("MineCraft");
        stack.push("final fantasy");
        stack.push("Bahubali");
        String popped = stack.pop();
        System.out.println(stack);
        System.out.println(popped);
        System.out.println("Top item of the stack  "+ stack.peek());
    }
}