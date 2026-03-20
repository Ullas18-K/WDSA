package Binary_search;

import java.util.Arrays;

public class first_last {
    static void main() {
        System.out.println(Arrays.toString(searchRange(new int[]{1,2,3,4,4,5,5,5,6,7,10,11,11},8)));
        System.out.println(Arrays.toString(searchRange2(new int[]{1,2,3,4,4,5,5,6,7,10,11,11},8)));
        System.out.println(Arrays.toString(searchRange2(new int[]{1},1)));
    }
    static public int[] searchRange(int[] nums, int target) {
        int start=-1,end=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target && end==-1){
                start=i;
                end=i;
            }
            else if (nums[i]==target && end>-1) end=i;
        }
        return new int[]{start,end};
    }

    static public int[] searchRange2(int[] nums, int target) {
        int start= low_b(nums,target), end=up_B(nums,target), n=nums.length;
        if (start<n && end-1<n && nums[start]==target && nums[end-1]==target){
        return new int[]{start,end-1};
        }else {
            return new int[]{-1,-1};
        }
    }

    static int low_b(int[] arr,int target){
        int low=0,high=arr.length-1,ans=arr.length;
        while (low<=high){
            int mid=(high+low)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }

    static int up_B(int[] arr,int target){
        int low=0,high=arr.length-1,ans=arr.length;
        while (low<=high){
            int mid=(high+low)/2;
            if(arr[mid]>target){ //just remove the equality
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }

}
