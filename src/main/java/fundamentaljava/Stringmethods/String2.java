package fundamentaljava.Stringmethods;

public class String2 {
    public static void main(String[] args) {
        String a="Yusuf";
        String a1="Yusuf";//literal
        String a2=new String("Yusuf");
        String a3="teja";
        System.out.println(a.equals(a1));
        System.out.println(a2.equals(a1));
        System.out.println(a.equalsIgnoreCase(a1));
        System.out.println(a==a1);
        System.out.println(a.compareTo(a1));
    }
}
