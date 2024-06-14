// buffer input stream class //

// import java.io.FileInputStream;

// public class fliehandle3 {
//     public static void main(String[] args) {
//         try{
//             FileInputStream fin = new FileInputStream("D:\\File Handling In Java\\bufferedfile.txt");
//             int i=0;
//             while((i=fin.read())!= -1){
//                 System.out.println((char) i);
//             }
//             fin.close();

//         }
//         catch(Exception e){
//             System.out.println(e);
//         }       
        
//         // finally{
//         //     try{
//         //         if(f1!=null){
//         //             f1.close;
//         //         }
//         //     }
//         //     catch(Exception e){
//         //         System.out.println("");
//         //     }
//         // }
//     }
// }

// import java.io.BufferedInputStream;
// import java.io.FileInputStream;

// public class fliehandle3 {
//     public static void main(String[] args) {
//         try{
//             FileInputStream fin = new FileInputStream("D:\\File Handling In Java\\bufferedfile.txt");
//             BufferedInputStream bin = new BufferedInputStream(fin);
//             int i=0;
//             while((i=fin.read())!= -1){
//                 System.out.println((char) i);
//             }
//             fin.close();
//             bin.close();

//         }
//         catch(Exception e){
//             System.out.println(e);
//         }       
//     }
// }

// if we dont want to use try catch , we can use throws at the starting of the f'n //

// import java.io.BufferedInputStream;
// import java.io.FileInputStream;
// import java.io.IOException;

// public class fliehandle3 {
//     public static void main(String[] args)  throws IOException{
        
//             FileInputStream fin = new FileInputStream("D:\\File Handling In Java\\bufferedfile.txt");
//             BufferedInputStream bin = new BufferedInputStream(fin);
//             int i=0;
//             while((i=fin.read())!= -1){
//                 System.out.println((char) i);
//             }
//             fin.close();
//             bin.close();
      
//     }
// }