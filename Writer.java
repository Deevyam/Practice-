import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws IOException {

        FileWriter Fw = new FileWriter("java12.txt");

        Scanner sc = new Scanner(System.in);
        String data;
        data = sc.next();
        Fw.write(data);
        Fw.close();

        FileReader fr = new FileReader("java12.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);
        fr.close();
    }
}
