package arraysNew;
import com.sun.security.jgss.GSSUtil;

import java.lang.classfile.constantpool.IntegerEntry;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class llprac {
    static void main() {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println(ll.size());
        Collections.reverse(ll);
        System.out.println(ll);

        List<Integer> ll1=new LinkedList<Integer>(List.of(4,5,6));
        ll.addAll(0,ll1);
        System.out.println(ll);

        for(Integer e:ll) System.out.print((e+10)+" "); //always use this way to traverse

        System.out.println();
        System.out.println(ll.get(2)); //o(n) time,dont use in for loops, it gonna become o(n2)
        System.out.println(ll.set(1,10));

        System.out.println(ll.remove(ll.indexOf(2)));
        System.out.println(ll);
        Collections.reverse(ll);
        System.out.println(ll);
        ll.addFirst(23);
        ll.reversed();
        System.out.println(ll);

        Iterator<Integer> it =
                ll.iterator();
        while(it.hasNext()){
//            System.out.print(it.next()+" ");
            break;
        }

        for(Integer e:ll) System.out.print(e+" ");
        System.out.println();

        System.out.println(it.next() + " " + it.next());

        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(34);
        queue.offer(20);
        System.out.println(queue.offer(2));
        System.out.println(queue.peek());
        System.out.println(queue.contains(34));

        Deque<Integer> deque=new ArrayDeque<>(); //or new LinkedLiat<>()
        deque.offer(1);
        deque.offer(23);
        deque.offerFirst(35);
//        deque.offerLast(null); //cant do this when using arraydeque
        System.out.println(deque);
        System.out.println(deque.poll()); //first last exist

        Deque<Integer> stack=new ArrayDeque<>();
        stack.push(23);
        stack.push(34);
        stack.push(78);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        for (Integer e:stack) {
            System.out.print(e + " ");
        }
        System.out.println(stack.contains(23));


        LinkedList<Integer> ll3 =
                new LinkedList<>(
                        Arrays.asList(
                                10,20,30,40,50
                        )
                );
        System.out.println(ll3);
        Iterator<Integer> it1=ll3.descendingIterator();
        while(it1.hasNext()){
            System.out.print(it1.next() + " ");
        }

        System.out.println();

        ListIterator<Integer> it2=ll3.listIterator();
        System.out.println(it2.hasPrevious());

//        ll3.forEach(x-> x=x*x);

        //collections and methods

        List<Integer> ls=new ArrayList<>(Arrays.asList(1,2,3,4,5));
//  /
        ls.replaceAll(x-> (x+1)/2); //lamba based on unaryoperator interface


        System.out.println(ls);
        xy(ls);
        System.out.println(ls);

        ls.removeIf(x-> x%3==0);
        System.out.println(ls);

        int[] arr= new int[ls.size()];  //better than .toArray()
        for(int i=0;i<arr.length;i++) arr[i]=ls.get(i);
        System.out.println(Arrays.toString(arr));


        //this creates a shallow, so any changes affect original too
        List<Integer> lsc= ls.subList(1,4);
        System.out.println(lsc);
        lsc.add(45);
        System.out.println(ls);

        //independent copy
        List<Integer> lsi= new ArrayList<>(ls.subList(1,4));
        System.out.println(lsi);

        ls.stream().forEach(x -> System.out.print(x+" "));
        System.out.println();

        List<Integer> lss= ls.stream()
                .filter(x-> x<100)
                .map(x->x*10)
                .collect(Collectors.toList()); //can use toList()
        System.out.println(lss);

        int[] a= lss.stream().mapToInt(x->x).toArray();
        System.out.println(Arrays.toString(a));

        String[] b=Arrays.stream(a).map(x->x+10).mapToObj(x-> String.valueOf(x)).toArray(String[]::new);
        System.out.println(Arrays.toString(b));

        int[] c=Arrays.stream(a).map(x->x+10).toArray();
        System.out.println(Arrays.toString(c));


        LinkedHashSet<Integer> t=new LinkedHashSet<>();
        for (int i:a) t.add(i);
        System.out.println(t);


    }
    static void xy(List obj){
        obj.addFirst(235);
    }
}
