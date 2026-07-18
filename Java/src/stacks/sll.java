package stacks;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stackk {

    Node top;

    Stackk() {
        top = null;
    }

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int val = top.data;
        top = top.next;

        return val;
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("Empty Stack");
            return -1;
        }

        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    int size() {

        int count = 0;

        Node temp = top;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    void display() {

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}


public class sll {
    public static void main(String[] args) {

        Stackk s = new Stackk();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Top : " + s.peek());

        System.out.println("Popped : " + s.pop());

        s.display();

        System.out.println("Size : " + s.size());

        System.out.println(s.isEmpty());
    }
}
