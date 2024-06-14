// multi threading vs single threading //
// built-in support of multi-threaded programming//
// 2 or more parts that can run concurrently : Multi-threading //
// each part of such  a programm is called a thread and each thread defines a separate path of distribution //
// multi-tasking in 2 ways : process based, thread based //
// process based: featue that allows computer to run 2 or more programs concurrently
//                program is the smallest unit which is dispatched by scheduler//
//                more diversed that threat -based//
// threat is smallest unit of dispatchable code
// process: programm that is executing //
// multi-tasking thread will have less over heads than multi tasking 
// it can be achieved either with thread class or runover interface //

// context switching from one process to another is costly where as threads are cheap//
// multi-threading allows us to write more efficint programm that makes the max use of CPU resources available 

// class l extends Thread {
//     public void run(){
//         for(int i=1;i<=5;i++){
//             // System.out.println("thread: "+Thread.currentThread());
//             System.out.println("thread: "+Thread.currentThread().getId() + "count: "+i);
//         }
//     }
// }
// public class serious4{
//     public static void main(String[] args){
//         l th1 = new l();
//         l th2 = new l();

//         th1.start();
//         th2.start();
//         for(int i=1;i<=5;i++){
//             System.out.println("the main thread: "+ i);
//         }
//     }
// }
// answer and order would be different on different devices //