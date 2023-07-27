package fundamentaljava.Constructor;

import java.lang.invoke.MethodHandles;

public class DefConstructor {
    String Accountname;
    Long Accountnumber;
    double Accountbalance;

    public DefConstructor()//default constructor
    {
        System.out.println("Defalut Constructor");
        Accountname = "S.MOHAMMED YUSUF";
        Accountnumber = 1234567890L;
        Accountbalance = 124.003;
        System.out.println("Accountname is:"+Accountname+" Account Number is:"+Accountnumber+" Account balance is:"+Accountbalance);
    }
    public DefConstructor(String Accountname,Long Accountnumber,double Accountbalance)
    {
        this.Accountname=Accountname;
        Accountnumber= Accountnumber;
        this.Accountbalance=Accountbalance;
        System.out.println("Accountname is:"+Accountname+" Accountnumber is:"+Accountnumber+" Accountbalance is:"+Accountbalance);

    }

    public static void main(String[] args) {
        //classname objname=new constructorname(or)methodname
    DefConstructor dd=new DefConstructor();//Initialization an object is called constructor
        DefConstructor dd1=new DefConstructor("S.MOHAMMED YUSUF",1234567890l,124.003);
    }
}
