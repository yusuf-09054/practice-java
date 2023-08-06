package fundamentaljava.typecasting_java;

public class casting {
    public static void main(String[] args) {
        char scorpio='Y';

        int asciinumber = scorpio;

        System.out.println("team sign is:"+scorpio+":Convert value in asciinumber :"+asciinumber);

        //narrow

        double myweight=68.79;
        int mywholeweight=(int) myweight;
        System.out.println(mywholeweight);

        int mynumber=88;

        char value=(char) mynumber;
        System.out.println("my number is:"+mynumber+"is converted into ascii value is:"+value);

        int value1 = 50;
        System.out.println("the integer value is :"+value1);

        //convert into double type
        double data = value1;
        System.out.println("the double data value is:"+data);

        double num1 = 10.55;
        System.out.println("the double value is:"+num1);

        int data1=(int) num1;
        System.out.println("the data value is:"+data1);

    }
}
