//// SUPER KEYWORD- USED IN INHERITANCE TO ACCESS ////
//// THE VARIABLE,FUNCTION/METHODS,CONSTRUCTOR OF THE PARENT CLASS ////
// with var: //

class N{
    String n="mukund";

}
class M extends N {
    String n="malik";
    void disp(){
        System.out.print(super.n+" "+n);
    }

}



public class serious1 {
   public static void main(String[] args) {
    M obj = new M();
    obj.disp();
   }
    
}


// with method and method + var ://

// class N{
//     int m=7;
//     void count(int m){
//         for(int i=0;i<m;i++){
//             System.out.print(i+" ");
//         }
//         System.out.println("N");
//     }
// }
// class M extends N{
//     int m=10;
//     void count(int m){
//         for(int i=0;i<m;i++){
//             System.out.print(i+" ");
            
//         }
//         System.out.println("M");
//     }

//     void disp(){
//         count(m);
//         super.count(super.m);
//         super.count(m);
//     }
// }
// public class serious1{
//     public static void main(String[] args) {
//         M obj = new M();
//         obj.disp();
        
//     }
// }

// with constructor: //

// class N{
//     N(){
        
//         for (int i=0;i<10;i++){
//             System.out.print(i+" ");
//         }
//         System.out.println("N");
//     }
// }
// class M extends N{
//     M(){
//         super();
//         for (int i=0;i<7;i++){
//             System.out.print(i+" ");
//         }
//         System.out.println("M");
        
//     }
// }
// public class serious1{
//     public static void main(String[] args) {
//         M o = new M();
    
//     }
// }
// public class serious1 {

//     public static void main(String[] args) {
//         System.out.println("hello");
//     }
// }