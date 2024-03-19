package pl.roka.it.lesson17.input_output.fileInOut;

import java.io.*;

public class SimpleFileIOStream {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("example.txt");
			fos = new FileOutputStream("exampleoutput.txt");

			int c;
			while((c = fis.read()) != -1) {
				fos.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(fis!=null) fis.close();
			if(fos!=null) fos.close();
		}
	}
}
