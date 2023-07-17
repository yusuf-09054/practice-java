package fundamentaljava.oops.inheritance.inheritancetypes;

class dog
{
    public void barking()
    {
        System.out.println("dog is barking");

    }
}
class cat extends dog
{
    public void meow(){

        System.out.println("meow the cats ");
    }
}
public class single {
    public static void main(String[] args) {
        //single s=new single();
        cat c=new cat();
        c.meow();
        c.barking();
    }
}
