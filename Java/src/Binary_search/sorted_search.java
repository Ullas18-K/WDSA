package Binary_search;

public class sorted_search {
    static void main() {
        System.out.println(search_distant(new int[]{4,5,6,7,0,1,2},8));
        System.out.println(search_dup(new int[]{4,4,5,6,4,4,4,4,4},5));

    }
     static public int search_distant(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            if(nums[low]<=nums[mid]){
                if (nums[low]<=target && target<=nums[mid]) high=mid-1;
                else low=mid+1;
            }
            else {
                if(nums[mid]<=target && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }

    static public boolean search_dup(int[] nums, int target) { //if array got dups- where your low=mid=high
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target) return true;

            if (nums[low]==nums[mid] && nums[mid]==nums[high]){  //just reduce the search space from both sides
                low++;
                high--;
                continue;
            }

            if(nums[low]<=nums[mid]){
                if (nums[low]<=target && target<=nums[mid]) high=mid-1;
                else low=mid+1;
            }
            else {
                if(nums[mid]<=target && target<=nums[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return false;
    }


}
