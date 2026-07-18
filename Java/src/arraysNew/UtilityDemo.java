package arraysNew;

import java.util.*;
import java.util.stream.Collectors;

public class UtilityDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list =
                new LinkedList<>(
                        Arrays.asList(
                                10,20,30,40,50
                        )
                );

        //=======================
        // replaceAll
        //=======================

        LinkedList<Integer> square =
                new LinkedList<>(list);

        square.replaceAll(x -> x*x);

        System.out.println(square);

        //=======================
        // removeIf
        //=======================

        LinkedList<Integer> even =
                new LinkedList<>(list);

        even.removeIf(x -> x%20==0);

        System.out.println(even);

        //=======================
        // clone
        //=======================

        LinkedList<Integer> copy =
                (LinkedList<Integer>) list.clone();

        System.out.println(copy);

        //=======================
        // toArray
        //=======================

        Integer[] arr =
                list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr));

        //=======================
        // subList
        //=======================

        List<Integer> sub =
                list.subList(1,4);

        System.out.println(sub);

        //=======================
        // Collections.sort
        //=======================

        LinkedList<Integer> nums =
                new LinkedList<>(
                        Arrays.asList(
                                5,1,4,3,2
                        )
                );

        Collections.sort(nums);

        System.out.println(nums);

        //=======================
        // reverse
        //=======================

        Collections.reverse(nums);

        System.out.println(nums);

        //=======================
        // shuffle
        //=======================

        Collections.shuffle(nums);

        System.out.println(nums);

        //=======================
        // swap
        //=======================

        Collections.swap(nums,0,2);

        System.out.println(nums);

        //=======================
        // max
        //=======================

        System.out.println(
                Collections.max(nums)
        );

        //=======================
        // min
        //=======================

        System.out.println(
                Collections.min(nums)
        );

        //=======================
        // frequency
        //=======================

        LinkedList<Integer> dup =
                new LinkedList<>(
                        Arrays.asList(
                                10,20,20,30,20
                        )
                );

        System.out.println(
                Collections.frequency(
                        dup,
                        20
                )
        );

        //=======================
        // binary search
        //=======================

        Collections.sort(nums);

        System.out.println(
                Collections.binarySearch(
                        nums,
                        4
                )
        );

        //=======================
        // STREAM
        //=======================

        List<Integer> ans =
                list.stream()
                        .filter(x -> x>20)
                        .collect(Collectors.toList());

        System.out.println(ans);

        //=======================
        // MAP
        //=======================

        List<Integer> sq =
                list.stream()
                        .map(x -> x*x)
                        .collect(Collectors.toList());

        System.out.println(sq);

    }

}