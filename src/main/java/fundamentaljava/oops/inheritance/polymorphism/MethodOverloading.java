package fundamentaljava.oops.inheritance.polymorphism;

public class MethodOverloading {

    public int caluculate(int a,int b){
        int c= a+b;
        System.out.println(c);
        return c;
    }

    public void calculate(float ab,float ba){
        double abc=ab+ba;
        System.out.println("my double value is abc ="+abc);
    }

    public static void main(String[] args) {
        MethodOverloading mm=new MethodOverloading();
        mm.calculate(1.2f,2.9f);
        mm.caluculate(49,20);
    }
}
