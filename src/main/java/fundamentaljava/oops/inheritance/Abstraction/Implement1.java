package fundamentaljava.oops.inheritance.Abstraction;

public class Implement1 extends Additionalprogram{
    @Override
    public void Addingoperator(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }

    @Override
    public void additional(int a, int b) {

    }

    public static void main(String[] args) {
        Implement1 im=new Implement1();
        im.Addingoperator(50,100);
        im.AdditionMethod(55,55);
    }


}
