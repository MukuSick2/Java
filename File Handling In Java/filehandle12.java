// char array writer class //

import java.io.*;
public class filehandle12 {
    public static void main(String[] args) throws IOException {
        CharArrayWriter cw = new CharArrayWriter();
        cw.write("this is java class");

        FileWriter f1 = new FileWriter("sys.txt");
        FileWriter f2 = new FileWriter("output.txt");

        cw.writeTo(f1);
        cw.writeTo(f2);
        f1.close();
        f2.close();


    }
}
