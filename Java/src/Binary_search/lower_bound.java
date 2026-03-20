package Binary_search;

public class lower_bound {
    static void main() {
        System.out.println(lowerB(new int[]{1},1));
        System.out.println(upperB(new int[]{1},1));
    }
    static int lowerB(int[] arr,int target){
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
    static int upperB(int[] arr,int target){
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
