package strings;

import java.util.Scanner;

public class sbuilder {
    static void main() {
        StringBuilder sb = new StringBuilder(1000); //capaccity matters for making stringbuilder faster, since everytime new character added on top of capacity this will resize itself and copies all old characters to new char array
        //so if capacity set maximum, no repeated copying so faster
        String s = "gawrr";
        sb.append("gawrr");
        System.out.println(sb.toString().equals(s));

        System.out.println(sb);
        System.out.println(sb.insert(3," guantanamo "));
        System.out.println(sb.deleteCharAt(sb.length()-1));
        System.out.println(sb.delete(3,7));

        System.out.println(sb.reverse());

        System.out.println("hello \"wassup\" ");
        System.out.println(new StringBuilder(s.length()).append(s).reverse().toString()); //most efficient way to reverse a string
    }
}
