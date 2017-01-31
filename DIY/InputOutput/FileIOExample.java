package DIY;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) throws IOException{

        FileOutputStream fout = new FileOutputStream("/home/name/JavaIO/DIYIO/textone.txt");

        String str = "I am writing in a file";
        byte[] b = str.getBytes();

        fout.write(b);
        fout.close();

        System.out.println("Information has been saved. Thank you");

    }
}
//----------------------------------------------------------------------------


import java.io.FileInputStream;
import java.io.IOException;


public class FileInputEg {

    public static void main(String[] args) throws IOException{

        FileInputStream fin = new FileInputStream("/home/name/JavaIO/DIYIO/textone.txt");

        int i = 0;

        while ( (i=fin.read()) !=-1){
            System.out.print((char) i);
        }
        fin.close();

        System.out.println("\nText file has been read.");

    }
}
