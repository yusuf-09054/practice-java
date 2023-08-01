package fundamentaljava.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class write {
    public static void main(String[] args) throws IOException {
        File ff = new File("E:\\Hello.txt");
//        ff.createNewFile();
//        System.out.println(ff.getName()+"Successfully created");
        FileOutputStream fo = new FileOutputStream(ff);
        Scanner ss = new Scanner(System.in);
        System.out.println("Which file you want to wirte");
         String data= ss.nextLine();
         fo.write(data.getBytes());
        System.out.println(ff.getName()+"written successfully");






    }
}
