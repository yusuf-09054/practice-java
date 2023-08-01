package fundamentaljava.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class read {
    public static void main(String[] args) throws IOException {
        File ff = new File("E:\\Hello.txt");
        FileInputStream fi = new FileInputStream(ff);
        byte[] getting=new byte[fi.available()];
        fi.read(getting);
        String aa=new String(getting);
        System.out.println(aa);


    }
}
