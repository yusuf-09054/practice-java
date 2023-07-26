package fundamentaljava.Stringmethods;

public class String3 {
    public static void main(String[] args) {
        String a="arunkumar";
        System.out.println(a.startsWith("A"));
        System.out.println(a.endsWith("r"));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(4));
        System.out.println(a.length());
        String s="avadharam edukuren sir";
        String replace=s.replace("avadharam","avatar");
        System.out.println(replace);
        String s1="I am a boy";
        String s2=s1.replace("boy","MEN");
        System.out.println(s2);
    }
}

