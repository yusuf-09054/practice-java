package fundamentaljava.scanner;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
     String name = "ROLEX";
        System.out.println(name);
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the name:");
        String name1=scan.nextLine();
        System.out.println("name is :"+name1);

        System.out.println("Enter the age");
        int age=scan.nextInt();
        System.out.println(" age is"+age);


        System.out.println("enter the phone number");
        Long phnnumber=scan.nextLong();
        System.out.println("yusuf phone number is"+phnnumber);
    }
}
