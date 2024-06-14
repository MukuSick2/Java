// exception handling //

// static method ke andar instance method mai directly call nhi kar sakte //

// throw keyword is used to throw exception explicitly//
// we can throw eith er checked or unchecked exception in java //



// public class serious5 {

//     public static void main(String[] args) {
//         throw new NullPointerException("error in code!");
//     }
// }

// import java.util.Scanner;


// public class serious5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a=sc.nextInt();
//        if(a<18){ 
//         throw new ArithmeticException("age less than 18!");
//        }
//        else{
//         System.out.println("ok");
//        }
//     }
// }

// exception propagation:
// check exceptions are not called in calling chain //



// class excp{

//         void m(){
//             int a=3/0;
//         }
//         void n(){
//             m();
//         }
//         void p(){
//             try{
//                 n();
//             }
//             catch(ArithmeticException e){
//                 System.out.println("e");
//         }
        
//         }

//     }
// public class serious5{
//     public static void main(String[] args) {
//         excp d = new excp();
//         d.p();

//     }
// }


// java throws keyword is used to declare n exception .it give info to programmer that there may occer an exception//
// checked excpetion can be propagated using throws keyword //
// if we are calling a method that declares an exception , then we must either caught or declare the exception //


// class excp{

//     void m() throws e{
//         // int a=3/0;
//         throws new excp();
        
//     }
//     void n(){
//         m();
//     }
//     void p(){
//         try{
//             n();
//             throw new excp("error");
//         }
//         catch(ArithmeticException e){
//             System.out.println("e");
//     }
    
//     }

// }
// public class serious5{
// public static void main(String[] args) {
//     excp d = new excp();
//     d.p();

// }
// }

// import java.util.Scanner;
// public class serious5 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         new Exception("array");
//         int a=sc.nextInt();
//        try{if(a<18){
//         throw new ArithmeticException("age less than 18!");
//        }}
//        else{
//         System.out.println("ok");
//        }
//     }
// }


// exception handling with method overriding //
// if super class doesnt declare an exception then sub class overidden method can not be declare the checked exception but not unchecked exception//
// if super class doesnt declare an exception then sub class overidden method can declare subclass exception but not parent exception//
// class animal{
//     void dips(){
//         System.out.println("animal");
//     }
// }
// class cat extends animal{
//     void dips() throws ArithmeticException{
//         System.out.println("cat");
//     }
// }
// public class serious5 {

//     public static void main(String[] args) {
//         cat c = new cat();
//         c.dips();
//     }
// }


// import java.io.IOException;

// class animal{
//     void dips()throws Exception{
//         System.out.println("animal");
//     }
// }
// class cat extends animal{
//     void dips() throws IOException{
//         System.out.println("cat");
//     }
// }
// public class serious5 {

//     public static void main (String[] args )throws Exception {
//         cat c = new cat();
//         c.dips();
//     }
// }


// user defined : to create our own exception class must be inherited from per defined exception class
// class Worng extends ArithmeticException{
//     public Worng(String s){
//         super(s);
//     }
// }
// public class serious5{
//     public static void main(String[] args) {
//         int a=5;
//         if(a<18){
//             throw new Worng("kdkdkdkd");
//         }
//         else{
//             System.out.println("ok");
//         }
//     }
// }