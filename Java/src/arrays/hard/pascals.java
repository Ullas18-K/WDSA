package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pascals {
    static void main() {
        //type1
        //given row and col , gimme the pascal triangle element
        //use ncr formula
        int row=4,col=2;
        System.out.println("pascal elem is "+ (int)ncr(row,col));


        //type 2
        //print the entire nth row
        //brute -> call the ncr for n+1 times , n2 TC
        int n=5;
        int prod=1;
        int[] arr=new int[n+1];
        arr[0]=1;
        for (int i = 1; i <=n ; i++) {
            prod = prod * (n-i+1)/i;
            arr[i]=prod;
        }
        System.out.println(Arrays.toString(arr));

        //aternate
//        int val = 1;
//        int k=5;
//        for(int r = 0; r <= k; r++){
//            System.out.println(val + " " + r);
//            val = val * (k - r) / (r + 1);
//        }

        //type 3 - print entire triangle
        List<List<Integer>> list=new ArrayList<>();
        int roww=5;
        for(int i = 0; i <roww ; i++) {
            list.add(new ArrayList<>());
            long val=1;
            list.get(i).add(1);
            for(int j=1;j<=i;j++){
                val= val * (i-j+1) / j;  //dont use *=, it actually calc rhs and then multiply with val, like it performs division first
                list.get(i).add((int)val);
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println(list);






    }
    static double ncr(int n,int r){
        //better find min of r and n-r
//        int mini= Math.min(n,r);
        long prod=1L; //coz it might overflow
        for (int i=1;i<=r;i++){
            prod*= (double)n/i; //better divide and keep the product to reduce num size
            n--;
        }
        return prod;
    }
}
