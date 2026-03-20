package Binary_search;

public class single_elem {
    static void main() {
        System.out.println(single(new int[]{1,1,2,3,3,4,4,5,5}));
        System.out.println(single2(new int[]{1,1,2,3,3,4,4,5,5}));
    }
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int num=Integer.MAX_VALUE;
            if(n==1){
                return nums[0];
            }
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[i]!=nums[i+1]) num=nums[i];
            }
            else if(i==(n-1)){
                if(nums[i]!=nums[n-2]) num=nums[i];
            }
            else{
                if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                    num = nums[i];
                }
            }
        }
        return num;
    }

    static  int single(int[] nums) {
        int low=0,high=nums.length-1; //start from (extreme indexes - 1)
        int n=nums.length;
        int ans=0;
        if(n==1) return nums[0];
        if (nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                ans=nums[mid];
                break;
            }
            else if(nums[mid]==nums[mid+1]){
                if((high-mid-1)%2!=0) low=mid+1;
                else high=mid-1;
            }
            else{
                if((mid-low-1)%2!=0) high=mid-1;
                else low=mid+1;
            }
        }
        return ans;
    }

    static int single2(int[] nums) {
        int low=1,high=nums.length-2;  //even-odd concept
        //if (even,odd) then element is on right side
        //if (odd,even) then element is on left side
        int n=nums.length,ans=0;
        if(n==1) return nums[0];
        if (nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) {
                ans=nums[mid];
                break;
            }
            else if(nums[mid]==nums[mid+1]){
                if(mid % 2==0) low=mid+1;
                else high=mid-1;
            }
            else{
                if (mid % 2 == 0) high = mid - 1;
                else low = mid + 1;
            }
        }
        return ans;
    }
}
