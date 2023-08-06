package fundamentaljava.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demoset {
    public static void main(String[] args) {
        TreeSet<Double> values=new TreeSet<Double>();


        values.add(90.7);
        values.add(84.9);
        values.add(70.6);
        values.add(69.9);
        values.add(66.9);
        values.add(40.0);
        values.add(32.8);
        values.add(28.4);
        values.add(10.0);


        System.out.println(values);

        HashSet<Double> values1=new HashSet<Double>();

        values1.addAll(values);

        Iterator<Double> it=values1.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next()+"all values");
        }

    }
}
