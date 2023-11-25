public class UsingArrays {

    int[] stack;
    int top;

    public UsingArrays(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("stack is full");
        } else {

            stack[++top] = x;
            System.out.println(x + " is pushed");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack[top] + " is deleted");
            top--;
        }
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }

    public void peek() {
        System.out.println(stack[top]);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        UsingArrays stack = new UsingArrays(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.display();
    }
}
