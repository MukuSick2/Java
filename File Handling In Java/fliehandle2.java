// buffer output class //

// source ko bout.write nhi kar sakte kyoki bytes mai convert nhi hua tha.

// import java.io.BufferedOutputStream;
// import java.io.FileOutputStream;
// import java.security.spec.ECFieldF2m;

// public class fliehandle2 {
//     public static void main(String[] args) {
//         String source = " this is my file."+ " and I'll be using this data to demostrate the use"+" of FileOutputStream";
//         byte buf[]=source.getBytes();
//         try{
//             FileOutputStream f1 = new FileOutputStream("bufferedfile.txt");
//             BufferedOutputStream bout = new BufferedOutputStream(f1);
//             bout.write(buf);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         finally{
//             try{
//                 if(f1!=null){
//                     f1.close;
//                 }
//             }
//             catch(Exception e){
//                 System.out.println("");
//             }
//         }
//     }
// }

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class fliehandle2 {
    public static void main(String[] args) {
        String source = " this is my file."+ " and I'll be using this data to demostrate the use"+" of FileOutputStream";
        byte buf[]=source.getBytes();
        try(
            FileOutputStream f1 = new FileOutputStream("bufferedfile.txt");
            BufferedOutputStream bout = new BufferedOutputStream(f1);
        ){bout.write(buf);}
        catch(Exception e){
            System.out.println(e);
        }
        // finally{
        //     try{
        //         if(f1!=null){
        //             f1.close;
        //         }
        //     }
        //     catch(Exception e){
        //         System.out.println("");
        //     }
        // }
    }
}
