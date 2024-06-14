// taking data from user and reading using InputStreamReader and BufferedReader //

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class filehandle10 {
//     public static void main(String[] args) throws IOException {
//         InputStreamReader I=new InputStreamReader(System.in);
//         BufferedReader re = new BufferedReader(I);
//         System.out.println("Enter your name: ");
//         String name = re.readLine();
//         System.out.println("Welcome "+name);

//     }
// }


// taking data from user and reading and stop when user will write "stop" //
//using InputStreamReader and BufferedReader //

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class filehandle10 {
//     public static void main(String[] args) throws IOException {
//         InputStreamReader I=new InputStreamReader(System.in);
//         BufferedReader re = new BufferedReader(I);
//         System.out.println("Enter your name: ");
//         String name = "";
//         while(!name.equals("stop")){
//             System.out.print("Enter your name: ");
//             name = re.readLine();
//             System.out.println("Data entered is: "+ name);
//         }
//         // System.out.println("Welcome "+name);
//         I.close();

//     }
// }