package pl.roka.it.lesson17.input_output.fileInOut;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FISRunner {
    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("example.txt");
                FileOutputStream fos = new FileOutputStream("example-copy.txt")
        ) {

            byte[] byteArray = new byte[fis.available()];

            for (int i = 0; i < byteArray.length; i++) {
                int read = fis.read();
                System.out.print((char)read);
                byteArray[i] = (byte) read;
            }
            fos.write(byteArray);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
