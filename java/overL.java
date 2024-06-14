/* multi-inheritance is not allowed in java */
// /* INHERITANCE */
// class A{
//     int i;
//     int j;
//     void show(){
//         System.out.println(i);
//         System.out.println(j);
//     }
// }
// class B extends A{
//     void sum(){
//         System.out.println(i+j);
//     }

// }
// public class overL{
//     public static void main(String[] args) {
//         A superobj = new A();
//         B subobj = new B();
//         superobj.i=10;
//         superobj.j =20;
//         superobj.show();
        
//         subobj.i=superobj.i;
//         subobj.j=superobj.j;
//         subobj.sum();
//         subobj.show();/* here we are calling the fn of A from object of B */

//     }
// }

/* super keyword- used for setting different values in different classes */
// class A{
//     int i;
// }
// class B extends A{
//     int i;
//     B(int a,int b){
//         super.i=a;
//         i=b;
//     }
//     void show(){
//         System.out.println("i in super class: "+super.i);
//         System.out.println("i in child class: "+i);
//     }
// }
// class overL{
//     public static void main(String[] args) {
//         B obj = new B(6,7);
//         obj.show();
//     }
// }

