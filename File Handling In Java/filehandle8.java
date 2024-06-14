// file reader class //
import java.io.*;
public class filehandle8 {
    public static void main(String[] args) throws IOException {
        File fin = new File("D:/File Handling In Java/bufferedfile.txt");
        FileReader f = new FileReader(fin);
        // this lenght is fro file object //
        char chars[] = new char[(int)fin.length()];
        f.read(chars);
        // writing data to another file
        File fout = new File("output.txt");
        FileWriter fw = new FileWriter(fout);
        fw.write(chars);
        fw.flush();
        f.close();
        fw.close();

    }
}
