package fundamentaljava.oops.inheritance.inheritancetypes;

class father
{
    String fname="sajid";
    public void mother(){
        String Mname="jabeen";
        System.out.println("Father name is:"+fname);
        System.out.println("Mother name is :"+Mname);
    }
}

class son extends father
{
    public void son()
    {
    String sname="yusuf";
        System.out.println("son name is :"+sname);
    }

}

class daughter extends father
{
    public void daughter()
    {
        String dname="tabu";
        System.out.println("Daughter name is :"+dname);
    }
}
public class hierarical {
    public static void main(String[] args) {
        daughter dd=new daughter();
        dd.mother();
        dd.daughter();
        son s=new son();
        s.son();
    }
}
