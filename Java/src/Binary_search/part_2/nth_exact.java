package Binary_search.part_2;

public class nth_exact {
    static void main() {
        System.out.println(nth(2,4));
    }
    static double nth(int n,int m){
        double low=1,high=m;
//        double ans=0;
        double step=0.00001;

        while(low<=high){
            double res=1;
            double mid=(low+high)/2.0;

            for (int i=0;i<n;i++){
                res = res*mid;
                if (res>m) break;
            }

            if(Math.abs(res-m)<0.0001){
                return mid;
            }
            else if(res<=m){
                low=mid+step;
            }
            else high=mid-step;
        }
return -1;
    }
}
