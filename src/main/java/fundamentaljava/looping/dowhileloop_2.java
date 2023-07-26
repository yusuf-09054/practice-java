package fundamentaljava.looping;

import java.util.Scanner;

public class dowhileloop_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int student=0;
        float time=0;
        int count=0;

        do{
            System.out.println(student+"student id login time");
            time=scan.nextFloat();
            if (time>8.00 && time>9.00)
            {
                System.out.println(time+"your late comer so,meet the principal");
                count++;
            }
            else {
                System.out.println("your on time to school go inside");
            }
            student--;
        }
        while (student>0);
        System.out.println("this month late comer count"+count);
        {

        }
    }
}
