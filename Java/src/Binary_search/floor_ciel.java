package Binary_search;

public class floor_ciel {
    static void main() {
        int[] arr={2,4,5,8,10,13,15};
        System.out.printf("%d %d \n",floor(arr,16),ciel(arr,16));
        System.out.printf("%d %d",floor(arr,1),ciel(arr,1));
    }
    static int floor(int[] nums,int target){
        int low=0,high=nums.length-1,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid]<=target){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    static int ciel(int[] nums,int target){
        int low=0,high=nums.length-1,ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
