
import java.util.ArrayList;
import java.util.Collections;

public class ex {

    public static void main(String[] args) {
        System.out.println("sup");
        ArrayList<Integer> we= new ArrayList<>();
        we.add(2);
        we.add(2);
        we.add(1);
        we.add(1);
        Collections.reverse(we);
        System.out.println(we);
    }
}