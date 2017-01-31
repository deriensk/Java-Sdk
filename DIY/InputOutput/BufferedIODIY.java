public class BufferedOutputExample{
	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("/home/name/JavaIO/bstud.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String str = "Java Developers in Nepal. \nWe are reading a file";
        byte[] b = str.getBytes();

        bout.write(b);
        bout.flush();
        bout.close();

        System.out.println("information saved in buffer file.");

		
	}
}

public class BufferedInputExample{
	public static void main(String[] args) throws IOException{
		

        FileInputStream fin = new FileInputStream("/home/name/JavaIO/bstud.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);

        //or  BufferedOutputStream bin = new BufferedOutputStream("/home/name/JavaIO/bstud.txt");

        int i = 0;
        while ((i = bin.read()) != -1){
            System.out.print((char) i);
        }
        bin.close();
        fin.close();
	}
}