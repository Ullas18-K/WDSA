package Binary_search.part_2;

import java.util.Arrays;

public class bouquets {
    static void main() {
//        System.out.println(minDays(new int[]{7,7,7,7,12,7,7},2,3));
//        System.out.println(minDays1(new int[]{1,10,3,10,2},3,1));
        System.out.println(minDays1(new int[]{7,7,7,7,12,7,7},2,3));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
            if (m*k > bloomDay.length) return -1;

            int max= Arrays.stream(bloomDay).max().getAsInt();
            int min= Arrays.stream(bloomDay).min().getAsInt();

            for(int currday=min;currday<=max;currday++){
                int count=0,bouqs=0;
                for (int i = 0; i < bloomDay.length; i++) {
                    if (bloomDay[i]<=currday){
                        count++;
                    }
                    else {
                        count=0;
                    }

                    if (count==k){
                        bouqs++;
                        count=0;
                    }
                    if (bouqs==m){
                        return currday;
                    }
                }
            }
            return -1;
    }


    public static int minDays1(int[] bloomDay, int m, int k) {
        if (m*k > bloomDay.length) return -1;

        int high= Arrays.stream(bloomDay).max().getAsInt();
        int low= Arrays.stream(bloomDay).min().getAsInt();
        System.out.println(low + ","+high);

        int ans=-1;
        while(low<=high){
            int count=0;
            int bouqs=0;
            int mid=(low+high)/2;

            for(int day:bloomDay){
                if (day<=mid){
                    count++;
                }
                else count=0;
                if (count==k){
                    bouqs++;
                    count=0;
                }
            }

            if(bouqs>=m){
                System.out.println("mid: "+mid);
                System.out.println("bouqs: "+bouqs);
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
