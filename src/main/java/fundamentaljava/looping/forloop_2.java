package fundamentaljava.looping;

import java.util.Scanner;

public class forloop_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        for (int myrequirement=10;myrequirement>0;)
        {
            System.out.println("what is ur experience");
            float experience=scan.nextFloat();
            if (experience>=3 && experience<=9)
            {
                System.out.println("you are selected no :"+myrequirement);
                myrequirement--;
            }
            else {
                System.out.println("you are not selected");
            }

        }
    }
}
