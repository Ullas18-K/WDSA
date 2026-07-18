package arraysNew;

public class singlyll {

    // ===========================
    // NODE CLASS
    // ===========================

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ===========================
    // DATA MEMBERS
    // ===========================

    private Node head;
    private Node tail;
    private int size;

    // ===========================
    // CONSTRUCTOR
    // ===========================

    public singlyll() {
        head = null;
        tail = null;
        size = 0;
    }

    // ===========================
    // INSERT AT BEGINNING
    // ===========================

    public void insertFirst(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    // ===========================
    // INSERT AT END
    // ===========================

    public void insertLast(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // ===========================
    // INSERT AT INDEX
    // ===========================

    public void insertAt(int index, int value) {

        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node prev = head;

        for (int i = 0; i < index - 1; i++)
            prev = prev.next;

        Node newNode = new Node(value);

        newNode.next = prev.next;
        prev.next = newNode;

        size++;
    }

    // ===========================
    // DELETE FIRST
    // ===========================

    public int deleteFirst() {

        if (head == null)
            throw new RuntimeException("List is Empty");

        int removed = head.data;

        head = head.next;

        if (head == null)
            tail = null;

        size--;

        return removed;
    }

    // ===========================
    // DELETE LAST
    // ===========================

    public int deleteLast() {

        if (head == null)
            throw new RuntimeException("List is Empty");

        if (head == tail)
            return deleteFirst();

        Node current = head;

        while (current.next != tail)
            current = current.next;

        int removed = tail.data;

        current.next = null;
        tail = current;

        size--;

        return removed;
    }

    // ===========================
    // DELETE AT INDEX
    // ===========================

    public int deleteAt(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        if (index == 0)
            return deleteFirst();

        if (index == size - 1)
            return deleteLast();

        Node prev = head;

        for (int i = 0; i < index - 1; i++)
            prev = prev.next;

        int removed = prev.next.data;

        prev.next = prev.next.next;

        size--;

        return removed;
    }

    // ===========================
    // GET ELEMENT
    // ===========================

    public int get(int index) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node current = head;

        for (int i = 0; i < index; i++)
            current = current.next;

        return current.data;
    }

    // ===========================
    // SET ELEMENT
    // ===========================

    public void set(int index, int value) {

        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        Node current = head;

        for (int i = 0; i < index; i++)
            current = current.next;

        current.data = value;
    }

    // ===========================
    // SEARCH
    // ===========================

    public int search(int value) {

        Node current = head;
        int index = 0;

        while (current != null) {

            if (current.data == value)
                return index;

            current = current.next;
            index++;
        }

        return -1;
    }

    // ===========================
    // CONTAINS
    // ===========================

    public boolean contains(int value) {
        return search(value) != -1;
    }

    // ===========================
    // REVERSE
    // ===========================

    public void reverse() {

        Node prev = null;
        Node current = head;
        tail = head;

        while (current != null) {

            Node next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        head = prev;
    }

    // ===========================
    // MIDDLE NODE
    // ===========================

    public int middleNode() {

        if (head == null)
            throw new RuntimeException("Empty List");

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // ===========================
    // SIZE
    // ===========================

    public int size() {
        return size;
    }

    // ===========================
    // EMPTY
    // ===========================

    public boolean isEmpty() {
        return size == 0;
    }

    // ===========================
    // CLEAR
    // ===========================

    public void clear() {

        head = null;
        tail = null;
        size = 0;
    }

    // ===========================
    // PRINT
    // ===========================

    public void print() {

        Node current = head;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null)
                System.out.print(" -> ");

            current = current.next;
        }

        System.out.println(" -> null");
    }

    // ===========================
    // MAIN
    // ===========================

    public static void main(String[] args) {

        singlyll list = new singlyll();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);

        list.print();

        list.insertFirst(5);

        list.print();

        list.insertAt(2, 15);

        list.print();

        System.out.println("Deleted First : " + list.deleteFirst());

        list.print();

        System.out.println("Deleted Last : " + list.deleteLast());

        list.print();

        System.out.println("Deleted Index 1 : " + list.deleteAt(1));

        list.print();

        System.out.println("Contains 20 : " + list.contains(20));

        System.out.println("Index of 20 : " + list.search(20));

        System.out.println("Element at 1 : " + list.get(1));

        list.set(1, 100);

        list.print();

        list.reverse();

        System.out.println("Reversed");

        list.print();

        System.out.println("Middle : " + list.middleNode());

        System.out.println("Size : " + list.size());

    }
}
