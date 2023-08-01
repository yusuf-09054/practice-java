package fundamentaljava.Collection;

import fundamentaljava.Array.Array;

import java.util.ArrayList;
import java.util.Vector;

public class VectorandArraylist {
    public static void main(String[] args) {

        ArrayList list=new ArrayList();

        list.add("BATMAN");
        list.add(55);
        list.add(9.7);
        list.add(12345654321l);
        list.add("A");
        //System.out.println(list);

        Vector list1=new Vector();

        list1.addAll(list);
        list1.add("TEJA");
        list1.add(54567821234567l);
        System.out.println(list1);

        System.out.println("My array list is : "+list);
        System.out.println("My vector list is : "+list1);

       list1.remove("TEJA");
        System.out.println("Arraylist remove and original values : "+list1);

        list1.removeAll(list);
        System.out.println(list1);

        list1.retainAll(list);
        System.out.println(list1);

    }
}
