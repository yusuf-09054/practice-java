package fundamentaljava.Collection;

import java.util.Hashtable;
import java.util.TreeMap;

public class Demomap {
    public static void main(String[] args) {
 //       TreeMap<String,Integer> obj=new TreeMap<String,Integer>();

   //     obj.put("Yusuf",3);
     //   obj.put("Rizwana",2);
       // obj.put("Tabu",1);
       // System.out.println(obj);
       // System.out.println(obj.get("Yusuf"));
       // System.out.println(obj.containsValue(3));
       // System.out.println(obj.containsKey("Tabu"));

        TreeMap<String, Bikes> obj=new TreeMap<String, Bikes>();

        Bikes bb=new Bikes("Pulsar", 4, 78000.00);
        Bikes bb1=new Bikes("Ducati", 4, 1000000.00);
        Bikes bb2=new Bikes("Dio", 2, 80000.00);
        Bikes bb3=new Bikes("TVS XL",5,50000.00);


        obj.put("aruna", bb3);
        obj.put("Raja", bb2);
        obj.put("santhosh", bb);
        obj.put("Raju", bb3);
        obj.put("Ram", bb1);

        System.out.println(obj);
        Hashtable< Bikes, String> obj1=new Hashtable<Bikes,String>();
        obj1.put(bb3, "raja");
    }
}
