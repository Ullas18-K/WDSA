package stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class pat2 {
    static void main() {
        int[] arr = {3,2,1,4,5};
        printng(arr);  //amortized o(n)
    }

    static void printng(int[] arr){
        Deque<Integer> stack=new ArrayDeque<>();

        for(int i=arr.length-1;i>=0;i--){
            int res;
                while(!stack.isEmpty() && stack.peek()<=arr[i])
                    stack.pop();

                res= stack.isEmpty()? -1:stack.peek();

            stack.push(arr[i]);
            System.out.println(arr[i] + " " + res);

        }
    }
}
