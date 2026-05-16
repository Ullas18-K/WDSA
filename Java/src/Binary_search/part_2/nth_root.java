package Binary_search.part_2;

public class nth_root {
    static void main() {
        System.out.println(nth(3,4));
    }
    static int nth(int n,int m) {
        int low=1, high=m;
        int d=-1;
        while(low<=high){
            int result=1;
            int mid= (low + high) / 2;   //  '/' provides values of types which are similar to the values used in calc, like int/int = int, float/int or viceversa = float
            for (int i=0;i<n;i++){
                result=result*mid;
            }
            if (result==m){
                    return mid;
            }
            else if (result<=m){
                low= mid+1;
            }
            else {
                high= mid-1;
            }
        }
        return -1;
    }
}
