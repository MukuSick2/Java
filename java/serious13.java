// HASH MAPS //

// import java.util.*;
// public class serious13 {

//     public static void main(String[] args) {
//         HashSet<String> q = new HashSet<String>();
//         q.add("pa");
//         q.add("po");
//         q.add("pi");
//         q.add("pe");
//         System.out.println("content: "+ q);

//     }
// }

import java.util.*;
public class serious13 {

    public static void main(String[] args) {
        // TreeSet<String> q = new TreeSet<String>();
        // q.add("paasdasd");
        // q.add("poasdddfgdfd");
        // q.add("pizxccbxcczxd");
        // q.add("peddcwef");
        // System.out.println("content: "+ q);
        // // System.out.println(q.ceiling("pa"));
        // System.out.println(q.ceiling(""));
        // System.out.println(q.floor("paasdasd"));
        // System.out.println(q.higher("paasdasd"));
        // System.out.println(q.lower("paasdasd"));
        // System.out.println(q.first());
        // System.out.println(q.last());
        // System.out.println(q.pollFirst());
        // System.out.println(q.pollLast());
        TreeSet<Integer> q = new TreeSet<Integer>();
        q.add(21);
        q.add(25);
        q.add(76);
        q.add(56);
        System.out.println("content: "+ q);
        // System.out.println(q.ceiling("pa"));
        System.out.println(q.ceiling(25));
        System.out.println(q.floor(25));
        System.out.println(q.higher(25));
        System.out.println(q.lower(25));
        System.out.println(q.first());
        System.out.println(q.last());
        System.out.println(q.pollFirst());
        System.out.println(q.pollLast());
        

    }
}