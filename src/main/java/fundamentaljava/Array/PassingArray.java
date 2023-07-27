package fundamentaljava.Array;

import java.util.Arrays;

public class PassingArray {
    public void PassingArray(double[]salary1)
    {
        salary1[3]=112345.000;
        salary1[0]=1230000;
        System.out.println(Arrays.toString(salary1));
    }
    public void PassingArray2(String name1)

    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        int a=100;
        String name="YUSUF";
        double[] salary={12,111,123,1234,124,12.24};
        PassingArray ps=new PassingArray();
        ps.PassingArray(salary);
     //   ps.PassingArray2("Mala");
        System.out.println(name);

    }
}
