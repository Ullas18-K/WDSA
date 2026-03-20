package Binary_search;

public class num_arr_rotations {
    static void main() {
        System.out.println(num_rotations(new int[]{10,10,10,0,1,10,10,10}));
    }
    static int num_rotations(int[] nums) {
        int low=0,high=nums.length-1;
        int min=0;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[low]==nums[mid] && nums[mid]==nums[high]){  //just reduce the search space from both sides
                if(nums[mid]<nums[min]) min=mid;
                low++;
                high--;
                continue;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<nums[min]) min=low; //orr  if(nums[low]<min){ min=nums[low] and index=low}, keep min concept the same
                low=mid+1;
            }
            else{
               if(nums[mid]<nums[min]) min=mid;
               high=mid-1;
            }
        }
        return min;
    }
}
