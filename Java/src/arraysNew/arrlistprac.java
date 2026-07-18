package arraysNew;

import java.lang.reflect.Array;
import java.util.*;

public class arrlistprac {
    static void main() {
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        System.out.println(arr);

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(4);

        ArrayList<Integer> arr3=new ArrayList<>();
        arr3.add(4);
        arr3.add(5);
//        System.out.println(arr3.indexOf(4));
//        System.out.println(arr3.get(-1));
        arr.add(arr2);
        arr.add(arr1);

        System.out.println(arr);
        System.out.println(arr.get(0).equals(arr3));
        System.out.println(arr.get(1).get(1));
        System.out.println(arr.get(1).set(1,34));
        System.out.println(arr);

        for (ArrayList<Integer> row : arr){
            for(int i=0;i<row.size();i++){
//                System.out.print(elem + " ");
                if(row.get(i)%2==0){
                    System.out.println(arr.indexOf(row) +" "+ i);
                    row.set(i,0);
                }
            }
        }
        System.out.println(arr + " " + arr.size());


    }
}
