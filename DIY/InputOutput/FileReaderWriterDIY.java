class FileWriterDIY {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("/home/name/sometext.txt")){
			fw.write("I am writing some text in file resource technique.");
		
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("File has been saved")
	}
	
}


class FileReaderDIY{
	public static void main(String[] args) {
		
		try(FileReader fread = new FileReader("/home/name/sometext.txt")){

			int i = 0;
			while( (i=fread.read()) != -1){
				System.out.println((char) i)
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

