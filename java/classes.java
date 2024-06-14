
// public class classes {
//     double wight;
//     double height;
//     double depth;
//     }
// class Main{
//     public static void main(String[] args) {
//         classes c1=new classes();
//         double vol;
//         c1.wight = 10;
//         c1.height = 11;
//         c1.depth = 9;
//         //vol = c1.wight*c1.height*c1.depth ;
//         vol = wight*height*depth;
//         System.out.println("volume of box is "+ vol);
    
//     }
// }

// import java.util.Scanner;

// public class classes{
//     double width;
//     double height;
//     double depth;
//     /* defining function in class , so no need to call for different objects */
//     void Volu(){
//         System.out.println(width*depth*height);
//     }
// }
// class volume{
//     public static void main(String[] args) {
//         classes c1 = new classes();
//         c1.width = 10;
//         c1.height = 11;
//         c1.depth = 12;
//         c1.Volu();
//         classes c2 = new classes();
//         c2.width = 10;
//         c2.height = 11;
//         c2.depth = 12;
//         c2.Volu();

//     }
// }

// import java.util.Scanner;

// public class classes{
//     double width;
//     double height;
//     double depth;
//     /* defining function in class , so no need to call for different objects */
//     double Volu(){
//         return(width*depth*height);
//     }
// }
// class volume{
//     public static void main(String[] args) {
//         classes c1 = new classes();
//         c1.width = 10;
//         c1.height = 11;
//         c1.depth = 12;
//         double v1 = c1.Volu();
//         System.out.println("volume of c1"+":"+v1);
//         classes c2 = new classes();
//         c2.width = 10;
//         c2.height = 11;
//         c2.depth = 12;
//         double v2=c2.Volu();
//         System.out.println("volume of c2"+":"+v2);

//     }
// }


// public class classes{
//     double width;
//     double height;
//     double depth;
//     void setDim(double w,double h,double d){
//         width = w;
//         height = h;
//         depth = d;
//     }
//     /* defining function in class , so no need to call for different objects */
//     double Volu(){
//         return(width*depth*height);
//     }
// }
// class volume{
//     public static void main(String[] args) {
//         classes c1 = new classes();
//         c1.setDim(10,11,13);
//         double v1=c1.Volu();
//         System.out.println(v1);
//         classes c2 = new classes();
//         c2.setDim(12, 13, 14);
//         double v2=c2.Volu();
//         System.out.println(v2);

//     }
// }

// public class classes{
//     static int a=30;
//     static int b;

//     static void Meth(int x){
//         System.out.println("x= "+x);
//         System.out.println("a= "+a);
//         System.out.println("b= "+b);
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         ;
//     }
// }