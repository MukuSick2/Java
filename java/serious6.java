// 2 ways of sleep:
// static void sleep(long milliseconds)
// static void sleep(long milliseconds)

// class NewThread implements Runnable{
//     NewThread(){
//         // super("demo Thread");
//         System.out.println("child thread: "+this);
//         // start();
//         run();
//     }
//     public void run(){
//         try{
//             for(int i=1;i<5;i++){
//             System.out.println("child therad: "+i);
//             Thread.sleep(500);
//         }}
//         catch(InterruptedException e){
//             System.out.println("child thread intruption");
//         }
//         System.out.println("child thread existing");

//     }
// }

// public class serious6{
//     public static void main(String[] args) {
//         // NewThread t=new NewThread();  // muhje isko next code mai use krna ho tab ye//
//         new NewThread();  // muhje isko next code mai nhi use krna ho tab ye//
//         try
//         {
//             for (int i=1;i<=5;i++){
//                 System.out.println("main thread: "+i);
//                 Thread.sleep(1000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println("child thread intruption");
//         }
//         System.out.println("child thread existing");
//     }
// }


// class NewThread implements Runnable{
//     Thread t;
//     NewThread(){
//         // super("demo Thread");
//         t=new Thread(this,"demo thread");
//         System.out.println("child thread: "+this);
//         t.start();
//     }
//     public void run(){
//         try{
//             for(int i=1;i<5;i++){
//             System.out.println("child therad: "+i);
//             Thread.sleep(500);
//         }}
//         catch(InterruptedException e){
//             System.out.println("child thread intruption");
//         }
//         System.out.println("child thread existing");

//     }
// }

// public class serious6{
//     public static void main(String[] args) {
//         // NewThread t=new NewThread();  // muhje isko next code mai use krna ho tab ye//
//         new NewThread();  // muhje isko next code mai nhi use krna ho tab ye//
//         try
//         {
//             for (int i=1;i<=5;i++){
//                 System.out.println("main thread: "+i);
//                 Thread.sleep(1000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println("child thread intruption");
//         }
//         System.out.println("child thread existing");
//     }
// }

// class NewThread implements Runnable{
//     Thread t;
//     NewThread(){
//         // super("demo Thread");
//         t=new Thread("demo thread");
//         System.out.println("child thread: "+this);
//         t.start();
//     }
//     public void run(){
//         try{
//             for(int i=1;i<5;i++){
//             System.out.println("child therad: "+i);
//             Thread.sleep(500);
//         }}
//         catch(InterruptedException e){
//             System.out.println("child thread intruption");
//         }
//         System.out.println("child thread existing");

//     }
// }

// public class serious6{
//     public static void main(String[] args) {
//         // NewThread t=new NewThread();  // muhje isko next code mai use krna ho tab ye//
//         new NewThread();  // muhje isko next code mai nhi use krna ho tab ye//
//         try
//         {
//             for (int i=1;i<=5;i++){
//                 System.out.println("main thread: "+i);
//                 Thread.sleep(1000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println("child thread intruption");
//         }
//         System.out.println("child thread existing");
//     }
// }

