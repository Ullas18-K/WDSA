package stacks;

class Stack {

    int[] arr;
    int top;
    int capacity;

    Stack(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    int size() {
        return top + 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return;
        }

        for (int i = top; i >= 0; i--)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}

class basic{

        public static void main(String[] args) {

            Stack s = new Stack(5);

            s.push(10);
            s.push(20);
            s.push(30);

            s.display();

            System.out.println("Top : " + s.peek());

            System.out.println("Popped : " + s.pop());

            s.display();

            System.out.println("Size : " + s.size());

            System.out.println(s.isEmpty());

            System.out.println(s.isFull());
        }

}
