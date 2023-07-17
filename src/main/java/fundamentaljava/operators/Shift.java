package fundamentaljava.operators;

public class Shift {
    public static void main(String[] args) {
        //formula
        //Right shift=a/b(b)
        //Left shift=a+2(b)

        int a=10;
        int b=1;
        int c;
        c=a<<b;//left
        System.out.println(c);
        c=a>>b;//right
        System.out.println(c);
    }
}
