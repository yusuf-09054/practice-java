package fundamentaljava.variable;

public class Allvariable {
    static String heroname ="fahad";//static fundamentaljava.variable
    static String heroname1 ="nani";
    int luckynumber=5;//Global fundamentaljava.variable
    int luckynumber1 =50;


     public void bateman(){//method


         String weapon = "chainsaw";//local fundamentaljava.variable
         String weapon1 = "axe";



         System.out.println("used weapon:"+weapon);
         System.out.println("used weapon:"+weapon1);


         System.out.println("fav malayalam heroname:"+heroname);
         System.out.println("fav telugu heroname:"+heroname1);


         System.out.println("lucky number:"+luckynumber);
         System.out.println("fav number:"+luckynumber1);

     }
    public static void main(String[] args) {
        int data = 20;//instace fundamentaljava.variable
        String name = "batman";
        float data1 = 100.5f;

        System.out.println("enter the data:"+data);
        System.out.println("enter the name:"+name);
        System.out.println("float data:"+data1);
        //object creation for local fundamentaljava.variable
        Allvariable sm = new Allvariable();
        sm.bateman();


        System.out.println(sm.luckynumber);
        System.out.println(sm.luckynumber1);
    }
}
