// // Sequence input stream class //

// import java.io.FileInputStream;
// import java.io.SequenceInputStream;

// public class filehandle4 {
//     public static void main(String[] args) {
//         try{
//             FileInputStream f1 = new FileInputStream("D:\\File Handling In Java\\bufferedfile.txt");
//             FileInputStream f2 = new FileInputStream("D:\\File Handling In Java\\sys.txt");
//             SequenceInputStream si1 = new SequenceInputStream(f1,f2);
//             int i;
//             while((i=si1.read())!=-1){
//                 System.out.print((char) i);
//             }
//             f1.close();
//             f2.close();
//             si1.close();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }


// Sequence input stream class //

// import java.io.FileInputStream;
// import java.io.SequenceInputStream;
// import java.util.Enumeration;
// import java.util.Vector;

// public class filehandle4 {
//     public static void main(String[] args) {
//         try{
//             FileInputStream f1 = new FileInputStream("D:\\File Handling In Java\\bufferedfile.txt");
//             FileInputStream f2 = new FileInputStream("D:\\File Handling In Java\\sys.txt");

//             Vector v = new Vector();
//             v.add(f1);
//             v.add(f2);

//             Enumeration E = v.elements();


//             SequenceInputStream si1 = new SequenceInputStream(E);
//             int i;
//             while((i=si1.read())!=-1){
//                 System.out.print((char) i);
//             }
//             f1.close();
//             f2.close();
//             si1.close();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

// if we dont want to use try catch , we can use throws at the starting of the f'n //

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class filehandle4 {
    public static void main(String[] args) throws IOException {
        
            FileInputStream f1 = new FileInputStream("D:\\File Handling In Java\\bufferedfile.txt");
            FileInputStream f2 = new FileInputStream("D:\\File Handling In Java\\sys.txt");

            Vector v = new Vector();
            v.add(f1);
            v.add(f2);

            Enumeration E = v.elements();


            SequenceInputStream si1 = new SequenceInputStream(E);
            int i;
            while((i=si1.read())!=-1){
                System.out.print((char) i);
            }
            f1.close();
            f2.close();
            si1.close();
        
    }
}
