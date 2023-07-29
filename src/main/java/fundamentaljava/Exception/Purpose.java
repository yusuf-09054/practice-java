package fundamentaljava.Exception;

import java.util.Scanner;

public class Purpose {
    public static void main(String[] args) {
        String collect="HI I AM YUSUF";
        Scanner scan=new Scanner(System.in);
        try {
            System.out.println("Please tell which index");
            System.out.println(collect.charAt(scan.nextInt()));
        }
        catch (StringIndexOutOfBoundsException smy)//exception handled block
        {
            System.out.println(smy);
            System.out.println("index number should be less then"+collect.length());
            System.out.println(collect.charAt(scan.nextInt()));
        }
        finally {
            System.out.println("end of the code");
        }
    }
}
