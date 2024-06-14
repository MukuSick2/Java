// data output stream //

import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filehandle7 {
    public static void main(String[] args) throws IOException{
        FileOutputStream f1 = new FileOutputStream("primitivefile.txt");
        DataOutputStream dout = new DataOutputStream(f1);
        String str = " this is my kingdom!";
        int a=65;
        dout.writeInt(a);
        dout.writeChars(str);

    }
    
}