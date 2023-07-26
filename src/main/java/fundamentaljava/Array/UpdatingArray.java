package fundamentaljava.Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingArray {
    public static void main(String[] args) {
        String[] familymembers={"Yusuf","Sajid","Jabeen","Rizu","Tabu"};
        System.out.println("Before Updating Names");
        System.out.println(Arrays.toString(familymembers));

        Scanner scan=new Scanner(System.in);

        System.out.println("Tell us what position you want to update");
        int pos=scan.nextInt();
        System.out.println("what update/replace names");
        String name=scan.next();

        familymembers[pos]=name;

        System.out.println("After updating names");
        System.out.println(Arrays.toString(familymembers));
    }
}
