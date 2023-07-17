package fundamentaljava.operators;

public class Logical {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=10;
        System.out.println(a>b||a>c);
        System.out.println(a<b&&a>c);
        System.out.println(!(a==b));
        System.out.println(a!=b);


        System.out.println("welcome");

        String state="Salem";
        String state1="Salem";
        int height=155;
        int weight=90;
        System.out.println(state==state1&&height!=weight);
        System.out.println(state1=="salem"||"Salem"==state1);
        System.out.println((!(weight>90)));

    }
}
