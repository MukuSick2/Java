// class NewThread implements Runnable{
//     String name;
//     Thread t;
//     NewThread(String threadname){
//         name = threadname;
//         t=new Thread(this,name);
//         System.out.println("child thread: "+this);
//         t.start();
//     }
//     public void run(){
//         try{
//             for(int i=1;i<=5;i++){
//                 System.out.println(name+" "+i);
//                 Thread.sleep(1000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(name+" "+"interrupted");
//         }
//     }
// }
// public class serious7 {
//     public static void main(String[] args) {
//         NewThread th1= new NewThread("one");
//         NewThread th2= new NewThread("two");
//         NewThread th3= new NewThread("three");

//             try{
//                 for(int i=1;i<=5;i++){
//                     System.out.println("main thread: "+i);
//                     Thread.sleep(1000);
//                 }
//             }
//             catch(InterruptedException e){
//                 System.out.println("main thread interrupted");
//             }
//             System.out.println("Main thread existing");
//     }
// }

// is alive functioin will return bool value //
// join method: waits until the thread on which is called terminates//
// class NewThread implements Runnable{
//     String name;
//     Thread t;
//     NewThread(String threadname){
//         name = threadname;
//         t=new Thread(this,name);
//         System.out.println("child thread: "+this);
//         t.start();
//     }

//     public void run(){
//         try{
//             for(int i=1;i<=5;i++){
//                 System.out.println(name+" "+i);
//                 Thread.sleep(1000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(name+" "+"interrupted");
//         }
//     }
// }
// public class serious7 {
//     public static void main(String[] args) {
//         NewThread th1= new NewThread("one");
//         NewThread th2= new NewThread("two");
//         NewThread th3= new NewThread("three");
//         System.out.println("thread one is alive: "+ th1.t.isAlive());
//         System.out.println("thread two is alive: "+ th2.t.isAlive());
//         System.out.println("thread three is alive: "+ th3.t.isAlive());

//             try{
//                 for(int i=1;i<=5;i++){
//                     System.out.println("main thread: "+i);
//                     Thread.sleep(1000);
//                 }
//             }
//             catch(InterruptedException e){
//                 System.out.println("main thread interrupted");
//             }
//             System.out.println("Main thread existing");
//             System.out.println("thread one is alive: "+ th1.t.isAlive());
//             System.out.println("thread two is alive: "+ th2.t.isAlive());
//             System.out.println("thread three is alive: "+ th3.t.isAlive());
//     }
// }

// cant deal with timmings " isAlive()". so use join() //

class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String threadname){
        name = threadname;
        t=new Thread(this,name);
        System.out.println("child thread: "+this);
        t.start();
    }

    public void run(){
        try{
            for(int i=1;i<=5;i++){
                System.out.println(name+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(name+" "+"interrupted");
        }
    }
}
public class serious7 {
    public static void main(String[] args) {
        NewThread th1= new NewThread("one");
        NewThread th2= new NewThread("two");
        NewThread th3= new NewThread("three");
        System.out.println("thread one is alive: "+ th1.t.isAlive());
        System.out.println("thread two is alive: "+ th2.t.isAlive());
        System.out.println("thread three is alive: "+ th3.t.isAlive());
        
        try{
            System.out.println("waiting for other thread to get terminated...");
            th1.t.join();
            th2.t.join();
            th3.t.join();
        }
        catch(InterruptedException e){
            System.out.println(" main thread intrupted");
        }
        System.out.println("main thread exiting: ");

        

            // try{
            //     for(int i=1;i<=5;i++){
            //         System.out.println("main thread: "+i);
            //         Thread.sleep(1000);
            //     }
            // }
            // catch(InterruptedException e){
            //     System.out.println("main thread interrupted");
            // }
            System.out.println("Main thread existing");
            System.out.println("thread one is alive: "+ th1.t.isAlive());
            System.out.println("thread two is alive: "+ th2.t.isAlive());
            System.out.println("thread three is alive: "+ th3.t.isAlive());
    }
}