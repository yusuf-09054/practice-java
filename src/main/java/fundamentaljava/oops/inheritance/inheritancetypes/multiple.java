package fundamentaljava.oops.inheritance.inheritancetypes;
interface iphone
{
    public void ios();
}
interface android1
{
    public void and();
}

public class multiple implements iphone,android1{
    public static void main(String[] args) {
     multiple mm=new multiple();
     mm.and();
     mm.ios();
    }

    @Override
    public void ios() {
        System.out.println("iphone works fast and good");
    }

    @Override
    public void and() {
        System.out.println("android works good");

    }
}
