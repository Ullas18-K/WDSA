package Binary_search.part_2;

import java.util.ArrayList;
import java.util.Collections;

public class med_2_sorted {
    static void main() {
//        System.out.println( findMedianSortedArrays(new int[]{1,2,5},new int[]{2,4,6,7}));
//        System.out.println(findMedianSortedArrays1(new int[]{1,2,5},new int[]{2,4,6,7}));
        System.out.println(findMedianSortedArrays1(new int[]{1},new int[]{}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> list=new ArrayList<>();
        int x=0,y=0;
        while(x<n && y<m){
            if(nums1[x]<=nums2[y]){
                list.add(nums1[x]);
                x++;
            }
            else {
                list.add(nums2[y]);
                y++;
            }
        }
        while (x<n){
            list.add(nums1[x]);
            x++;
        }
        while(y<m){
            list.add(nums2[y]);
            y++;
        }

        double med=0;
        int size=list.size();
        int mid= (size-1)/2;
        if(size%2==0){
            med=(list.get(mid+1)+list.get(mid))/2.0;
        }
        else {
            med=list.get(mid);
        }

        return (double) med;
    }

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;

        if (n>m){
            return findMedianSortedArrays1(nums2,nums1);  //return is imp , coz if not returned here ,the control comes back and executes the current function as well for interchanged sizes
        }

        int left=(n+m+1)/2;

        int low=0,high=n;
        while (low<=high){
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            System.out.println("mid1: "+mid1);
            System.out.println("mid2: "+mid2);

            int l1=(mid1==0)?Integer.MIN_VALUE:nums1[mid1-1];
            int r1=(mid1==n)?Integer.MAX_VALUE:nums1[mid1];
            int l2=(mid2==0)?Integer.MIN_VALUE:nums2[mid2-1];
            int r2=(mid2==m)?Integer.MAX_VALUE:nums2[mid2];

            if (l1<=r2 && l2<=r1){
                if ((n+m)%2==0){
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
                return Math.max(l1,l2);
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
    }
}
