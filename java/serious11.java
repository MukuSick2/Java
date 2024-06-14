// boolean empty()
//agar data compatibility nhi hogi jo queue mai daalte wakt, ten ClassCastException
// agar null vals add karege in queue, tab NullArgumentException
//agar fixed lenght ka queue hai and full, tab IllegalStateException
//agar 2 ki jagah 3 agrument pass kardiye in queue, tab illegalArgumentException
// poll() ele ko remove karega aur null value dega by default agar queue empty hai tab 
// remove() ele ko remove karega aur exceptioin throw karega agar queue empty ho 
// comparator is an interface jo compare karne mai kaam aata hai

// import java.util.PriorityQueue;

// public class serious11 {
//     public static void main(String[] args) {
//         PriorityQueue<String> q = new PriorityQueue<>();
//         q.offer("java");
//         q.add("Dbms");
//         q.add("ML");
//         System.out.println("content of prior. queue: "+ q);
//         System.out.println("head: "+q.peek());
//         System.out.println("head: "+q.element());
//         // q.poll();
//         // q.poll();
//         // q.poll();
//         // q.poll();
//         // q.remove();
//         // q.remove();
//         // q.remove();
//         // q.remove();
        
//         // q.remove("ML");
//         System.out.println("content of prior. queue: "+ q);
//     }
// }

import java.util.PriorityQueue;

public class serious11 {
    public static void main(String[] args) {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.offer("java");
        q.add("Dbms");
        q.add("ML");
        System.out.println("content of prior. queue: "+ q);
        System.out.println("head: "+q.peek());
        System.out.println("head: "+q.element());

        q.poll();
        System.out.println("content of prior. queue: "+ q);
        q.poll();
        System.out.println("content of prior. queue: "+ q);
        q.poll();
        System.out.println("content of prior. queue: "+ q);
        q.poll();
        System.out.println("content of prior. queue: "+ q);
        // q.remove();
        // System.out.println("content of prior. queue: "+ q);
        // q.remove();
        // System.out.println("content of prior. queue: "+ q);
        // q.remove();
        // System.out.println("content of prior. queue: "+ q);
        // q.remove();
        // System.out.println("content of prior. queue: "+ q);

        
        // q.remove("ML");
        // System.out.println("content of prior. queue: "+ q);
    }
}