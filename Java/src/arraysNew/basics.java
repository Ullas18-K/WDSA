package arraysNew;

import java.lang.reflect.Array;
import java.util.Arrays;

public class basics {
    static void main() {
        int[] nums=new int[10];
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]+1);

        System.out.println(nums.length);

        //2d arrays
        int[][] nums1=new int[][]{{1,2,3},{3,4,6,5,3},{5,8,3}};

        System.out.println(nums1[1][4]);
        System.out.println(Arrays.deepToString(nums1)); //normal tostring doesnt work

        //methods
        int[] arr = {5,2,8,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,2));


        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println(Arrays.equals(a,b));

        System.out.println(Arrays.toString(create()));

        String[] names = {"John","Mike","Sam"};
        for(String s: names){
            System.out.println(Arrays.toString(s.toCharArray()));
        }

        System.out.println(Integer.valueOf(10));
    }

    static int[] create(){
        return new int[]{1,5,3};
    }
}
