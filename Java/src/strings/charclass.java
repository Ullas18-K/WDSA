package strings;
import java.util.*;

public class charclass {
    static void main() {
        String s="ab3cdefgk";
        System.out.println(Character.isLowerCase(s.charAt(0)));
        System.out.println(Character.isUpperCase(s.charAt(0)));

        System.out.println(Character.isDigit(s.charAt(2)));
        System.out.println(Character.isLetter(s.charAt(0)));
        System.out.println(Character.isWhitespace(s.charAt(0)));
        System.out.println(Character.isWhitespace(s.charAt(0)));
        System.out.println(Character.isLetterOrDigit(s.charAt(0)));

        System.out.println(Character.getNumericValue(s.charAt(s.length()-1)));
        System.out.println(Character.getNumericValue('4'));

    }
}
