package arraysNew;

import java.util.*;

public class LinkedListDemo {

    public static void main(String[] args) {

        // ==========================================
        // 1. LINKEDLIST AS NORMAL LIST
        // ==========================================

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Normal List:");
        System.out.println(list);


        // ==========================================
        // 2. FIRST AND LAST OPERATIONS
        // ==========================================

        list.addFirst(5);
        list.addLast(40);

        System.out.println("\nAfter addFirst and addLast:");
        System.out.println(list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());


        // ==========================================
        // 3. OFFER METHODS
        // ==========================================

        list.offer(50);
        list.offerFirst(1);
        list.offerLast(60);

        System.out.println("\nAfter offer methods:");
        System.out.println(list);


        // ==========================================
        // 4. PEEK METHODS
        // ==========================================

        System.out.println("\nPeek Operations:");

        System.out.println("peek(): "
                + list.peek());

        System.out.println("peekFirst(): "
                + list.peekFirst());

        System.out.println("peekLast(): "
                + list.peekLast());


        // ==========================================
        // 5. POLL METHODS
        // ==========================================

        System.out.println("\nPoll Operations:");

        System.out.println("poll(): "
                + list.poll());

        System.out.println("pollFirst(): "
                + list.pollFirst());

        System.out.println("pollLast(): "
                + list.pollLast());

        System.out.println("After Poll:");
        System.out.println(list);


        // ==========================================
        // 6. REMOVE FIRST AND LAST
        // ==========================================

        System.out.println("\nRemove Operations:");

        System.out.println("removeFirst(): "
                + list.removeFirst());

        System.out.println("removeLast(): "
                + list.removeLast());

        System.out.println("After Remove:");
        System.out.println(list);


        // ==========================================
        // 7. QUEUE USING LINKEDLIST
        // ==========================================

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("\nQUEUE:");
        System.out.println(queue.getClass().getName()); //it's still an obj of linked list class but with methods of queue interface

        System.out.println(queue);

        System.out.println("Front: "
                + queue.peek());

        System.out.println("Removed: "
                + queue.poll());

        System.out.println("Queue After Poll:");
        System.out.println(queue);


        // ==========================================
        // 8. DEQUE USING LINKEDLIST
        // ==========================================

        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(20);
        deque.offerFirst(10);

        deque.offerLast(30);
        deque.offerLast(40);

        System.out.println("\nDEQUE:");

        System.out.println(deque);

        System.out.println("First: "
                + deque.peekFirst());

        System.out.println("Last: "
                + deque.peekLast());

        System.out.println("Remove First: "
                + deque.pollFirst());

        System.out.println("Remove Last: "
                + deque.pollLast());

        System.out.println("Deque After Removal:");
        System.out.println(deque);


        // ==========================================
        // 9. STACK USING LINKEDLIST
        // ==========================================

        LinkedList<Integer> stack =
                new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("\nSTACK:");

        System.out.println(stack);

        System.out.println("Top: "
                + stack.peek());

        System.out.println("Popped: "
                + stack.pop());

        System.out.println("Stack After Pop:");
        System.out.println(stack);


        // ==========================================
        // 10. STACK USING DEQUE
        // RECOMMENDED FOR DSA
        // ==========================================

        Deque<Integer> betterStack =
                new ArrayDeque<>();

        betterStack.push(10);
        betterStack.push(20);
        betterStack.push(30);

        System.out.println("\nARRAYDEQUE STACK:");

        System.out.println(betterStack);

        System.out.println("Top: "
                + betterStack.peek());

        System.out.println("Pop: "
                + betterStack.pop());

        System.out.println(betterStack);


        // ==========================================
        // 11. REMOVE OCCURRENCES
        // ==========================================

        LinkedList<Integer> nums =
                new LinkedList<>(
                        Arrays.asList(
                                10, 20, 30,
                                20, 40, 20
                        )
                );

        System.out.println("\nOccurrence Removal:");

        System.out.println(nums);

        nums.removeFirstOccurrence(20);

        System.out.println(
                "After removeFirstOccurrence:"
        );

        System.out.println(nums);

        nums.removeLastOccurrence(20);

        System.out.println(
                "After removeLastOccurrence:"
        );

        System.out.println(nums);


        // ==========================================
        // 12. ELEMENT METHOD
        // ==========================================

        Queue<Integer> q =
                new LinkedList<>();

        q.offer(100);
        q.offer(200);

        System.out.println("\nelement(): "
                + q.element());

        System.out.println("peek(): "
                + q.peek());


        // ==========================================
        // 13. DESCENDING ITERATOR
        // ==========================================

        LinkedList<Integer> numbers =
                new LinkedList<>(
                        Arrays.asList(
                                10, 20, 30, 40
                        )
                );

        Iterator<Integer> iterator =
                numbers.descendingIterator();

        System.out.println(
                "\nBackward Traversal:"
        );

        while(iterator.hasNext()) {

            System.out.print(
                    iterator.next() + " "
            );
        }

        System.out.println();
    }
}
