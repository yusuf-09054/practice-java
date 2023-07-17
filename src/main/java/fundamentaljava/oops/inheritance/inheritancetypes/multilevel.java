package fundamentaljava.oops.inheritance.inheritancetypes;

class college
{
    public void courseoffered()
    {
        System.out.println("arts and science and engineering");
    }
}

class Estudents extends college
{
    public void degree()
    {
        String cname="Mtech";
        System.out.println("friend degree:"+cname);
    }
}
class Astudents extends Estudents
{
    public void Degree()
    {
     String cname1="Bsc.CS";
        System.out.println("My Degree :"+cname1);
    }



}
public class multilevel {
    public static void main(String[] args) {
        Astudents aa=new Astudents();
                aa.Degree();
        aa.degree();
        aa.courseoffered();
    }

}
