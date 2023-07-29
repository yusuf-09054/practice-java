package fundamentaljava.Exception;

import java.io.IOException;

public class Compile {
    public static void main(String[] args) throws IOException, InterruptedException {

        Runtime r = Runtime.getRuntime();
        Process pro;
        pro=r.exec("notepad");
        Thread.sleep(5000);
        pro=r.exec("calc");
        Thread.sleep(2000);
    }
}
