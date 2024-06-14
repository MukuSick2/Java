
// class p{
//     public static void main(String[] args){
//         int a=20;
//         long b=30;
//         a+=b;
//         System.out.println(a);
//         sum(a);
      
  
//     };
//     public static void sum(int x){
//       int y=50;
//       x+=y;
//       System.out.println(x);


//     }
// };

// import java.util.*;
// class p{
//   public static void main(String[] args) {
//     int x;
//     Scanner h=new Scanner(System.in);
//     x=h.nextInt();
//     System.out.println(x);
//     h.close();
//   }
// };
// import java.util.Scanner;
// public class p{
//     ;
//     public static void main(String [] args){
//         for(int i=0;i<5;i++){
//             Scanner src= new Scanner(System.in);
//             int s= src.nextLine();
//             System.out.println(s);
//         }
       
//     }
// };

/*printing multiple random numbers */

// import java.util.*;
// public class p{
// public static void main(String[] args){
//     Random r = new Random();
//     int num = r.nextInt(100)+1;
//     System.out.print(num);
//    }
// };

/*printing multiple random numbers using while loop */

// import java.util.*;
// public class p{
// public void main(String[] args){
//     Random r = new Random();
//     int i=0;
//     while(i<10){
        
//         int num = r.nextInt(200-100)+1;
//         System.out.println(num);
//         i++;
//     }
//    }
// };
/* printing multiple random numbers using for loop*/
// import java.util.*;
// public class p{
// public void main(String[] args){
//     Random r = new Random();
//     int num;
//     for(int i=0;i<10;i++){
//         num=r.nextInt(100)+1;
//         System.out.println(num);}
//     }
// };

/* guessing random numbers by user using do while loop */

// import java.util.*;
// public class p{
// public static void main(String[] args){
//     Random r = new Random();
//     int num = r.nextInt(100)+1;
//     int guess;
//     int chance=0;
//     Scanner sc = new Scanner(System.in);
//     do{
//         System.out.println("enter your guess between 1-100");
//         guess = sc.nextInt();
//         if(guess<num){
//             System.out.println("number too low!!!");
//         }
//         else if(guess>num){
//             System.out.println("number too high");
//         }
//         else{
//             System.out.println("you got it right!!");
//         }
//     }
//     while(guess!=num && chance<5);{
//         if(guess!=num && chance == 5){
//             System.out.println("you lost the chance");
//         }
//         else{System.out.println("number is :"+ num);
//         }
        
//     chance++;
//     }
//     sc.close();
//     }
// };

/*iteration - accessing all the elements of an object
  Eg: int[] arr={21,22,23,24,25};  1
      int arr=24;                  2
    1 is iterable but cant do 2.
 */

// public class p{
//     public static void main(String[] args){
//         int[] roll_nums={21,22,23,24,25};
//         // int rool_nums[]={21,22,23,24,25};
//         // int num= roll_nums.length;
//         for(int i=0;i<roll_nums.length;i++)
//         System.out.println(roll_nums[i]);
//     }
// }
/* iterating using for -each loop
   note: we cant update the element of array or object 
        which is iterable.
*/

// public class p{
//     public static void main(String[] args){
//         int[] roll_nums={21,22,23,24,25};  /* we can write in both ways */
//         // int roll_nums[]={21,22,23,24,25};
//         // int num= roll_nums.length;
//         for(int i:roll_nums)
//         System.out.println(i);
//     }
// }

// public class p{
//     public static void main(String[] args){
//        int n=args.length;
//        System.out.println("total p passed:"+n);
//     }
// }
/* array from User */
// import java.util.*;
// public class p{
//     public static void main(String[] args){
//         int n;
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         int[] nums=new int[n];
        
//         for (int i=0;i<n;i++) {
//             nums[i]=sc.nextInt();
//         }
//         for (int i=0;i<n;i++) {
//             System.out.print(nums[i]);
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class p{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n;
//         n=sc.nextInt();
//         int[] arr=int [n];
//     }
//     public static void FindMax(int[] arr){
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//     }
// }

/* 2D arrays with predefined data */
// public class p{
//     public static void main(String[] args){
//         int[][] nums = {
//             {12,14,24,35},
//             {34,45,56,90},
//             {13,25,36,47},
//         };
        
//         for(int i=0;i<nums.length+1;i++){
            
//             for(int j=0;j<nums.length+1;j++){
//                 System.out.print(nums[i][j]+"\t");
//             }
//             System.out.println();
            
//         }
        
//     }
// }
/* 2D array asking from user */
// import java.util.Scanner;

// public class p{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
//         int[][] nums = new int [rows][cols];
        
//         for(int i=0;i<rows;i++){
            
//             for(int j=0;j<cols;j++){
//                nums[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<rows;i++){
            
//             for(int j=0;j<cols;j++){
//                 System.out.print(nums[i][j]+" ");
//                 }
//             System.out.println();
//         }
//         sc.close();
// }}
/* jacked array */
// import java.util.Scanner;

// public class p{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int[][] nums = new int [rows][];
//         nums[0] = new int[4];
//         nums[1] = new int[3];
//         nums[2] = new int[6];
//         nums[3] = new int[2];
//         for(int i=0;i<rows;i++){
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 System.out.print(nums[i][j]+" ");
//             }
//             System.out.println();}
//      sc.close();   
//     }
// }
/* jacked array asking from user and columns also*/
// import java.util.*;
// public class p{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int[][] nums = new int[rows][];
//         for(int i=0;i<rows;i++){
//             System.out.println("enter length of rows "+(i+1)+": ");
//             int cols = sc.nextInt();
//             nums[i] = new int[cols];
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 nums[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 System.out.print(nums[i][j]+" ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }