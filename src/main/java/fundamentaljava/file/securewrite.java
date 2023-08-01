package fundamentaljava.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.zip.DeflaterOutputStream;

public class securewrite {
    public static void main(String[] args) throws IOException {
        File fff = new File("E:\\Haii.txt");
        FileOutputStream fo=new FileOutputStream(fff);
        DeflaterOutputStream dd = new DeflaterOutputStream(fo);

        Scanner ss=new Scanner(System.in);
        System.out.println("Which you want");
        String bio=ss.nextLine();
        dd.write(bio.getBytes());
        System.out.println(fff.getName()+"Sucess");
        dd.close();
        fo.close();







    }
}
