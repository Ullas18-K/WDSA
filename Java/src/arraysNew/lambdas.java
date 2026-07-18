package arraysNew;

import java.util.function.UnaryOperator;

public class lambdas {
    static void main() {

        //older way
        Myshi m = new Myshi() {  //this is called as anonymous class based method definition. a secret class is defined in the back
            // ,it implements Myshi, defines printy(), and an object m is linked to that class.
            public void printy(String s) {
                System.out.println("wassup");
            }
        };
        m.printy("waddap");
        printhing(m); //can pass that object

        //but if you notice you're just passing an obj with method definition, so instead of that why not pass the method itself
//        printhing(public void printy() {
//            System.out.println("wassup");
//        });  you're basically passing like this but change it somewhat like below

        printhing( (String s) -> System.out.println("wassup Beijing"+" "+s)); //the function def are called lambdas - anonymous nameless functions

        Myshi m2 = s -> System.out.println("wassup jap" + " "+ s) ;
        printhing(m2);


        Myice m3 = (s,a) -> {
            if (a>10){
                return "pass";
            }
            return "fail";
        };
        printhing1(m3);

        Myice m4=(s,a) -> "nihoww " + a;
        printhing1(m4);

        UnaryOperator<String> op= s -> 34 + s;  //many collections methods expect these kinda, like unary operator, so try passing just the lamba
        System.out.println(op.apply("waddapu"));

    }

    static void printhing(Myshi obj){
        obj.printy("sup");
    }

    static void printhing1(Myice obj){
        System.out.println(obj.printew("sup",40));
    }
}
