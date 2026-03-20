package Binary_search;

public class peak_elem {
    static void main() {
        System.out.println(findPeakElement(new int[]{1,5,1,2,1}));
    }
    static public int findPeakElement(int[] nums) {
        int low=1,high=nums.length-2;
        int ans=-1,n=nums.length;
        if(n==1 || nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]) {
                ans=mid;
                break;
            }
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }

    static public int findPeak(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if((i==0||nums[i]>nums[i-1]) && (i==nums.length-1||nums[i]>nums[i+1])){
             ans=i;
             break;
            }
        }
        return ans;
    }
}
