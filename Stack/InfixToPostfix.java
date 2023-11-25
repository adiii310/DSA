import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {
    static int prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    static String infix(String exp) {
        String result = new String("");
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            // System.out.println(c);
            if (Character.isLetterOrDigit(c)) {
                result += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {

                    result += stack.peek();
                    stack.pop();

                }
                stack.push(c);
            }

        }
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String output = infix(exp);
        System.out.println(output);
    }
}
