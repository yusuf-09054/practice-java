package fundamentaljava.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nestedcatch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0;
        int b=0;
        try
        {
            System.out.println("Enter the first Number");
            a=scan.nextInt();
            System.out.println("Enter ther second number");
            b=scan.nextInt();
            System.out.println(a/b);
        }
        catch (ArithmeticException exe)
        {
            System.out.println("cannot be used by zero");
            b=scan.nextInt();
            System.out.println(a/b);
        }
        catch (InputMismatchException exe1)
        {
            Scanner scans =new Scanner(System.in);
            System.out.println("only used by numeric numbers");
            a=scan.nextInt();
            b=scan.nextInt();
            System.out.println(a/b);
        }
    }
}

