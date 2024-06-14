// byte array output stream //

// import java.io.ByteArrayInputStream;
// import java.io.ByteArrayOutputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class filehandle5 {
//     public static void main(String[] args) throws IOException{
//         FileOutputStream f1 = new FileOutputStream("btar1.txt");
//         FileOutputStream f2 = new FileOutputStream("btar2.txt");
//         ByteArrayOutputStream bout = new ByteArrayOutputStream();

//         bout.write(65);
//         bout.writeTo(f1);
//         bout.writeTo(f2);
//         bout.flush();
//         bout.close();
//         f1.close();
//         f2.close();
//     }
// }


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filehandle5 {
    public static void main(String[] args) throws IOException{
        FileOutputStream f1 = new FileOutputStream("btar1.txt");
        FileOutputStream f2 = new FileOutputStream("btar2.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        String st = " bla bla bla bla";
        byte buf[]= st.getBytes();

        bout.write(buf);
        bout.writeTo(f1);
        bout.writeTo(f2);
        bout.flush();
        bout.close();
        f1.close();
        f2.close();
    }
}
