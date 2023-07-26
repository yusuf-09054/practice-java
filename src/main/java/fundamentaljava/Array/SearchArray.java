package fundamentaljava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        String [] Heroname={"Suriya","Kamal","Rajini","Vijay","Ajith"};
        System.out.println(Arrays.toString(Heroname));

        Scanner scan=new Scanner(System.in);

        System.out.println(Heroname.length);
        System.out.println("Tell us who is your fav actor ");
        String favor=scan.next();

        for(int pos=0;pos<Heroname.length;pos++)
        {
            if(favor.equalsIgnoreCase(Heroname[pos]))
            {
                System.out.println(favor+"Actor is Founded");
                return;
            }
//            else
//            {
//                System.out.println(favor+"actor is not founded");
//            }
        }
       System.out.println("actor is not founded");
    }
}
