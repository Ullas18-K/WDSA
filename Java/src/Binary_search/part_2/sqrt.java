package Binary_search.part_2;

public class sqrt {
    static void main() {
        System.out.println(sqrtt(25665));
    }

    static long sqrtt(int x){
        int low=1,high=x;
        long d=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int y=mid*mid;
            if (y<=x){
                d=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return d;
    }
}
