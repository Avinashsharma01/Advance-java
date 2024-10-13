package IO_Stream.part_1;
import java.io.*;
public class Systemin {
    public static void main(String[] args) {
        File file = new File("src/IO_Stream/part_1/filedata.txt");

        try {
            FileInputStream fis = new FileInputStream(file);
            System.setIn(fis);
            int i = 0;
            while ((i = System.in.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
