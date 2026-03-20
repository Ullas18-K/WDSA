package Binary_search;

public class find_min {
    static void main() {
        System.out.println(findMin(new int[]{1}));
        System.out.println(findMin2(new int[]{4,5,6,6,1,2,3}));
    }

   static public int findMin(int[] nums) {
        int low=0,high=nums.length-1,min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<min) min=nums[mid];
            if (nums[low]==nums[mid] && nums[mid]==nums[high]){  //just reduce the search space from both sides
                low++;
                high--;
                continue;
            }
            if (nums[low]<=nums[mid] && nums[mid]<=nums[high]){
                if(nums[low]<min) min=nums[low];
            }

            if(nums[low]<=nums[mid]) low=mid+1;
            else high=mid-1;
        }
        return min;
    }

    static public int findMin2(int[] nums) { //easier and conceptual
        //just find the minimum in each half and campare with previous
        int low=0,high=nums.length-1,min=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[low]==nums[mid] && nums[mid]==nums[high]){  //just reduce the search space from both sides
                min=Math.min(min,nums[mid]); //to avoid [1] situations
                low++;
                high--;
                continue;
            }
            if (nums[low]<nums[high]){
                min=Math.min(min,nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]) {
                min=Math.min(nums[low],min);
                low=mid+1;
            }
            else {
                min=Math.min(nums[mid],min);
                high=mid-1;
            }
        }
        return min;
    }
}

