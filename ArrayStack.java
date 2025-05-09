public class ArrayStack {

    public static class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1; // Stack is initially empty
        }

        // Push element onto stack
        public void push(int value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value;
                System.out.println(value);
            } else {
                System.out.println("Stack is full. Cannot push " + value);
            }
        }

        // Pop element from stack
        public int pop() {
            if (top >= 0) {
                return stackArray[top--];
            } else {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
        }

        // Peek at top element
        public int peek() {
            if (top >= 0) {
                return stackArray[top];
            } else {
                System.out.println("Stack is empty.");
                return -1;
            }
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return (top == -1);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("Top element is: " + myStack.peek());

        System.out.println("Popped: " + myStack.pop());
        System.out.println("Popped: " + myStack.pop());
    }
}
