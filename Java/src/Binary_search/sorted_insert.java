package Binary_search;

public class sorted_insert {
    static void main() {
        System.out.println(searchInsert(new int[]{1,3,5,5,6},8));
    }
    static public int searchInsert(int[] nums, int target) {
           int low=0,high=nums.length-1,ans=nums.length;
           while (low<=high){
               int mid=(low+high)/2;
               if (nums[mid]>=target){ //or can do upperbound as well
                   ans=mid;
                   high=mid-1;
               }
               else{
                   low=mid+1;
               }
           }
           return ans;
    }
}
