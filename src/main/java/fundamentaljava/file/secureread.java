package fundamentaljava.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterInputStream;

public class secureread {
    public static void main(String[] args) throws IOException {
        File fff = new File("E:\\Haii.txt");
        FileInputStream fi= new FileInputStream(fff);
        InflaterInputStream ds=new InflaterInputStream(fi);
        int size=fi.available();
        byte []sr=new byte[size];
        ds.read(sr);
        System.out.println(new String(sr));
        ds.close();
        fi.close();


    }
}
