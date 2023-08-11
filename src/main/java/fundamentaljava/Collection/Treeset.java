package fundamentaljava.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset{
    public static void main(String[] args)
    {
        TreeSet<Bikes> Showroom=new TreeSet<Bikes>();
        Showroom.add(new Bikes("Pulsar",4, 78000.00));
        Showroom.add(new Bikes("Duke", 2, 111000.00));
        Showroom.add(new Bikes("Royal Enfield", 1, 120000.00));
        Showroom.add(new Bikes("TVS XL", 6, 50000.00));
        Showroom.add(new Bikes("DIO", 8, 70000.00));
        Bikes obj=(new Bikes("Ducati", 2,10000000.00));
        Showroom.add(obj);
       // System.out.println(Showroom);

        Iterator i=Showroom.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        // obj.compareTo(Showroom);
    }
}
class Bikes implements Comparable<Bikes> {
    String bikename;
    Integer no;
    Double price;


    // public Bikes(String bikename, int no, double price)
    // {
    //    super();
    //    bikename=bikename;
    //     no=no;
    //     price=price;
    // }
    @Override
    public String toString()
    {
    return "Bikes[Bikenames="+bikename+",no ="+no+",price ="+price+"]";
}


public Bikes (String bikename,Integer no,Double price)
{
    super();
    this.bikename = bikename;
    this.no = no;
    this.price = price;
}
    @Override
    public int compareTo(Bikes o)
    {
        return o.price.compareTo(this.price);
    }
}
