package fundamentaljava.Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int a = 20;

        int [] a1={12,10,203,50,100};

        int[] a2=new int[10];

        System.out.println(a1.length);

        for (int i=0;i<a1.length;i++)
        {
            System.out.println(i);
        }
        for (int hoi:a1)
        {
            System.out.println(hoi);
        }
        System.out.println(Arrays.toString(a1));
    }
}
