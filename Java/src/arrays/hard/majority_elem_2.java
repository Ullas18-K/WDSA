package arrays.hard;
import java.util.*;
public class majority_elem_2 {
    static void main() {
        System.out.println(majorityElement(new int[]{2,4,4,2,1,2,2,4,4,5}));
        System.out.println(majorityElement2(new int[]{2,4,4,23,1,2,2,4,4,5}));

    }
    static public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int num:nums){
         map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key:map.keySet()){
            if (map.get(key) > (n/3)){
                list.add(key);
            }
        }
        return list;
    }

    static public List<Integer> majorityElement2(int[] nums) {
        //modified moore's voting algo
        List<Integer> list=new ArrayList<>();
        int el1=0,el2=0,count1=0,count2=0;
        for (int num:nums){
            if (count1==0 && num!=el2){
                el1=num;
                count1++;
            } else if (count2==0 && num!=el1) {
                el2=num;
                count2++;
            }
            else if(num==el1){
                count1++;
            }else if(num==el2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        int k= nums.length/3;
        int cnt1=0,cnt2=0;
        for (int num:nums){
            if (num==el1) cnt1++;
            if (num==el2) cnt2++;
        }
        if (cnt1>k) list.add(el1);
        if (cnt2>k && el1 != el2) list.add(el2); //check for duplicates

        return list;

    }
}
