package Binary_search;

public class basic {
    static void main() {
        int[] arr=new int[]{-1,0,3,5,9,12};
        System.out.println(search(arr,9));
        System.out.println(binary_recursuive(arr,0, arr.length-1,9 ));
        //time ccomplexity - O(log2(N));
        //overflow case--> if low=0 and high=INT_MAX , mid=(int_max + int_max)/2 will overflow, instead use "long"
        //orr modify mid = low + (high-low)/2;
    }
    public static int search(int[] nums, int target) {
            int n=nums.length;
            int low=0,high=n-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target) high=mid-1;
                else low=mid+1;
                
            }
            return -1;
    }
    static int binary_recursuive(int[] nums, int low,int high,int target) {
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return binary_recursuive(nums,low,mid-1,target);
        else return binary_recursuive(nums,mid+1,high,target);
    }
}
