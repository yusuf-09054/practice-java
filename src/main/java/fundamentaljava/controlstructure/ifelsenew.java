package fundamentaljava.controlstructure;

import java.util.Scanner;

public class ifelsenew {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        System.out.println("Enter ur name ");
        String cname=ss.nextLine();
        if(cname.equalsIgnoreCase("yusuf"))
        {
            System.out.println("you got your name");
        }
        else
        {
            System.out.println("not eligible");
        }
    }
}
