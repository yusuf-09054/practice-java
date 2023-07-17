package fundamentaljava.scanner;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        String name = "Yusuf";
        System.out.println(name);
        Scanner sss=new Scanner(System.in);

        System.out.println("Enter the name:");
        String name1 = sss.nextLine();
        System.out.println("My name is:"+name1);

        System.out.println("enter the age:");
        int age=sss.nextInt();
        System.out.println("ROLEX age is:"+age);

        System.out.println("Enter my number:");
        Long number= sss.nextLong();
        System.out.println("My number is:"+number);
    }
}
