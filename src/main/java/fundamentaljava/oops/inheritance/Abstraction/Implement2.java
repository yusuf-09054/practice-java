package fundamentaljava.oops.inheritance.Abstraction;

public class Implement2 extends Additionalprogram {

    @Override
    public void Addingoperator(int a, int b) {
        int c=a/b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Implement2 im1=new Implement2();
        im1.additional(100,100);
        im1.Addingoperator(10,10);
    }
}
