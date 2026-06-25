package Binary_search.part_2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class aggresive_cows {
    static void main() {
        System.out.println(mindist(new int[] {4,2,1,3,6},2));
        System.out.println(mindist2(new int[] {4,2,1,5,6,8},3));
    }

    static int mindist(int[] stalls, int cows){
        Arrays.sort(stalls);
        int ans=0;
        int min= stalls[0];
        int max=stalls[stalls.length-1];
        System.out.println(max);

        for (int i=1;i<=max;i++){
            int count=1; //place the first cow in first stall
            int lastcow=stalls[0];
            for (int j=1;j<stalls.length;j++){
                if ((stalls[j]-lastcow)>=i){
                    count++;
                    lastcow=stalls[j];
                }
//                System.out.println("lastcow: "+lastcow);
            }
            if (count>=cows){
                ans=i;
            }
        }
        return ans;

    }

    static int mindist2(int[] stalls, int cows){
        Arrays.sort(stalls);
        int ans=0;
        int min= stalls[0];
        int max=stalls[stalls.length-1];

        int low=1,high=max;
        while (low<=high){
            int count=1;
            int lastcow=stalls[0];
            int mid=(low+high)/2;

            for (int j=1;j<stalls.length;j++){
                if ((stalls[j]-lastcow)>=mid){
                    count++;
                    lastcow=stalls[j];
                }
//                System.out.println("lastcow: "+lastcow);
            }
            if (count>=cows){
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
}
