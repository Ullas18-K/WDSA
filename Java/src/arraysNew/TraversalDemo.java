package arraysNew;

import java.util.*;

public class TraversalDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list =
                new LinkedList<>(
                        Arrays.asList(
                                10,20,30,40,50
                        )
                );

        //==========================
        // NORMAL FOR LOOP
        //==========================

        System.out.println("FOR LOOP");

        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");

        System.out.println("\n");


        //==========================
        // ENHANCED FOR LOOP
        //==========================

        System.out.println("ENHANCED");

        for(int x:list)
            System.out.print(x+" ");

        System.out.println("\n");


        //==========================
        // ITERATOR
        //==========================

        System.out.println("ITERATOR");

        Iterator<Integer> it =
                list.iterator();

        while(it.hasNext()){

            System.out.print(
                    it.next()+" "
            );
        }

        System.out.println("\n");


        //==========================
        // LIST ITERATOR
        //==========================

        System.out.println("LIST ITERATOR");

        ListIterator<Integer> li =
                list.listIterator();

        while(li.hasNext())
            System.out.print(
                    li.next()+" "
            );

        System.out.println();


        while(li.hasPrevious())
            System.out.print(
                    li.previous()+" "
            );

        System.out.println("\n");


        //==========================
        // DESCENDING ITERATOR
        //==========================

        System.out.println("DESCENDING");

        Iterator<Integer> rev =
                list.descendingIterator();

        while(rev.hasNext())
            System.out.print(
                    rev.next()+" "
            );
        System.out.println("\n");


        //==========================
        // FOREACH
        //==========================

        System.out.println("FOREACH");

        list.forEach(x->
                System.out.print(x+" ")
        );

        System.out.println("\n");


        //==========================
        // METHOD REFERENCE
        //==========================

        System.out.println("METHOD REFERENCE");

        list.forEach(
                System.out::println
        );


        //==========================
        // REMOVE USING ITERATOR
        //==========================

        Iterator<Integer> removeIt =
                list.iterator();

        while(removeIt.hasNext()){

            int x = removeIt.next();

            if(x==30)
                removeIt.remove();
        }

        System.out.println(list);

    }

}
