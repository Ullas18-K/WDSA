package Binary_search.part_2;

public class kth_sorted {
    static void main() {
        System.out.println(findkth(new int[]{2,3,6,7,9},new int[]{},3));
    }

    public static int findkth(int[] nums1, int[] nums2,int k){
        int n=nums1.length;
        int m=nums2.length;

        if (n>m){
            return findkth(nums2,nums1,k);
        }

        int left=k;

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
                return Math.max(l1,l2);
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
        }
        return 0;
    }
}
