package strings;

import java.util.*;

public class basic {
    static void main(String[] args) {
        //string memory examples
        String s="example";
        String r="example"; //both in same string pool

        String sr=new String("example"); //in heap
        String rr=new String("example"); //in heap and diiferent

        System.out.println(s==r);
        System.out.println(sr==rr);
        System.out.println(r.equals(sr));

        //immutable
        String s1= s.concat(" sup");
        s=s1;
        r=r.concat(" sup");
        System.out.println(s==s1);
        System.out.println(r);

        //methods
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase());
        System.out.println(s.equalsIgnoreCase(r));
        System.out.println(s.contains("up"));
        System.out.println(s.startsWith("xam"));
        System.out.println(s.substring(3,5)); //[3,5)
        System.out.println(s.strip()); //remove whitespace
        System.out.println(s.indexOf('p',5));
        System.out.println(s.lastIndexOf('p'));
        System.out.println(s.replace('e','t')); //all occurances will be replaced

        String sp="sup| y o|dih|hb";
        String[] er=sp.split("\\|"); //it does regex pattern matching using 2 pointer, certain symbols behave differently so use \\ before symbols
        System.out.println(Arrays.toString(er));
        System.out.println(Arrays.toString(sp.split("\\|",2))); //set the array size limit, will keep splitting till limit - 1, adds remaining as last element

        String tc="dumahhh";
        System.out.println(Arrays.toString(tc.toCharArray()));

        int[] arr=new int[]{1,2,3,4};
        StringBuilder sb=new StringBuilder();
        for(int elem:arr){
            sb.append(elem);
        }
        System.out.println(sb.toString());

        char[] ch={'w','f','g'};
        System.out.println(new String(ch)); //can pass directly

        //any type to string
        System.out.println(String.valueOf(134.6).length());
        System.out.println(Double.toString(453.54));

        System.out.println("gg"+" myahh");
    }
}
