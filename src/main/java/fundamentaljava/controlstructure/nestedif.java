package fundamentaljava.controlstructure;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age");
        int age=scan.nextInt();
        if (age>=18)
    {
        System.out.println("you are eligible for vote");
        if (age>=24 && age<=27)
        {
            System.out.println("you are eligible for marriage");
        }
        else
        {
            System.out.println("your age is over limited");
        }

    }
        else
        {
            System.out.println("your age is below 18");
        }
    }
}
