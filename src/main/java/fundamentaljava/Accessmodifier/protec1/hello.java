package fundamentaljava.Accessmodifier.protec1;

import fundamentaljava.Accessmodifier.Protect.prot;

public class hello extends prot {
    public void hh()
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        hello h =new hello();
        h.hh();
        h.a();
    }
}
