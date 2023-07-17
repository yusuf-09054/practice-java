package fundamentaljava.oops.inheritance.Abstraction;

public abstract class Additionalprogram{
    public void AdditionMethod(int a,int b)
    {

        System.out.println(a+b);
    }

    public  abstract void Addingoperator(int a,int b);//using no implement method with using abstract keyword

    public abstract void additional(int a,int b);
}
