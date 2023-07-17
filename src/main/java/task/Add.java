package task;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);

        System.out.println("enter the maths mark");
        int num1=ss.nextInt();

        System.out.println("enter the tamil mark");
        int num2=ss.nextInt();

        int add=num1+num2;
        System.out.println(add);

      int add1=num1*num2;
        System.out.println(add1);
    }
}
