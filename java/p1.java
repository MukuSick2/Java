// public class p1 {
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3,4,5},
//                 {6,7,8,9,10},
//                 {11,12,13,14,15}};
//         for(int i=0;i<arr.length+1;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }  
//     }
// }

// public class p1 {
//         public static void main(String[] args){
//             String[][] arr = {{"hello","my","name","is","mukund"},
//                     {"I","love","to","make","music"},
//                     {"I","dont","like","to","fight"}};
//             for(int i=0;i<arr.length;i++){
//                 for(int j=0;j<arr[i].length;j++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//                 System.out.println();
//             }  
//         }
//     }
/*aksing lines from user on the basis of its length and no. of lines */

// import java.util.Scanner;

// public class p1 {
//             public static void main(String[] args){
                
//                 Scanner sc=new Scanner(System.in);
//                 System.out.println("Enter Number Of Rows"+":");
//                 int rows=sc.nextInt();
//                 System.out.println("Enter Number Of Columns"+":");
//                 int cols=sc.nextInt();
//                 String[][] arr = new String[rows][cols];
//                 for(int i=0;i<rows;i++){
//                     for(int j=0;j<cols;j++){
//                         arr[i][j] = sc.nextLine();
//                     }
//                 } 
//                 for(int i=0;i<rows;i++){
//                     for(int j=0;j<cols;j++){
//                         System.out.print(arr[i][j]+" ");
//                     }
//                     System.out.println();
//                 }
//                 sc.close();   
//             }
//         }
/*If we dont know the length of line??? */

// import java.util.Scanner;

// public class p1{
//     public void main(String[] args){
//         Scanner s = new Scanner(System.in);
//         int rows=s.nextInt();
//         String[][] arr = new String[rows][];
        

//     }
// }

// import java.util.Scanner;

// class Main{
//     int x;
//     int y;
//     Main(){
//         System.out.println(x+y);
//     }
    
// }





// public class p1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Main M = new Main();
//         M.x=sc.nextInt();
//         M.y=sc.nextInt();
//         Main.Main();
//     }
// }
// public class p1{
//     private String name;
//     private int age;
//     public p1(String name, int age){
//         this.name = name;
//         this.age=age;
//     }
//     public String toString(){
//         return "name = '"+name+"'age = "+age;
//     }
//     public static void main(String[] args) {
//         p1 p = new p1("aman",34);
//         String details = "Personal details:"+p;
//         System.out.println(details);
//         System.out.println(p);
//     }
// }
