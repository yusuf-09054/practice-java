package fundamentaljava.Stringmethods;

public class Stringbuffer {
    public static void main(String[] args) {

        StringBuffer s=new StringBuffer("vinoth");// original

        //Append
        s.append("kumar");// append string
        System.out.println(s);
        //insert
        s.insert(11,"sam");
        System.out.println(s);
        //replace
        s.replace(1, 3, "hello");
        System.out.println(s);
        s.delete(1, 5);
        System.out.println(s);
        s.reverse();
        System.out.println(s);

        StringBuffer ss= new StringBuffer("MALAI");
        ss.delete(0,3);
        System.out.println(ss);
    }
}
