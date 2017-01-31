import java.io.File;


public class FileExample {
	
	public static void main(String[] args) {


        File f = new File("/home/name/JavaIO");

        if (f.exists()){
            System.out.println("Does the file exist? " + f.exists());
        }else{
            System.out.println("not found");
        }
        System.out.println("Is it a folder? " + f.isDirectory());

        File f2 = new File("/home/name/JavaIO/Broadway");
        f2.mkdirs();
        
        File f3 = new File("/home/name/JavaIO/TestFolder");
        f3.mkdirs();
        		

        String path = File.separatorChar + "home" + File.separatorChar 
        		+ "name" + File.separatorChar + "JavaIO";
        
        System.out.println("Your required path is : " + path);
        System.out.println("Operation completed finished");

        System.out.println("The list of files in the directory:" + path);

        //listing out the files in directory.
        for (File file : f.listFiles()){
        	System.out.println(file.getAbsolutePath());
        }
    }
}


/*
Does the file exist? true
Is it a folder? true
Your required path is : /home/name/JavaIO
Operation completed finished
The list of files in the directory:/home/name/JavaIO
/home/name/JavaIO/fstud.txt
/home/name/JavaIO/TestFolder
/home/name/JavaIO/bstud.txt
/home/name/JavaIO/DIYIO
/home/name/JavaIO/Broadway
/home/name/JavaIO/stud.txt
*/