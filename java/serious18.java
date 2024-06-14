// import java.util.LinkedHashMap;
// import java.util.TreeMap;

// public class serious18 {

//     public static void main(String[] args) {
//         TreeMap<Integer,String> a = new TreeMap<>();
//         a.put(1,"m");
//         a.put(2,"mu");
//         a.put(3,"muk");
//         a.put(4,"muku");
//         a.put(5,"mukun");
//         System.out.println(a);
//         System.out.println(a.containsKey(5));
//         System.out.println(a.containsValue("muk"));
//         System.out.println(a.values());
//         System.out.println(a.keySet());
//         System.out.println(a.hashCode());
//         a.clear();
//         System.out.println("after cleaning: "+a);

//     }

// }


// import java.util.NavigableMap;
// import java.util.TreeMap;

// public class serious18 {

//     public static void main(String[] args) {
//         NavigableMap<Integer,String> a = new TreeMap<>();
//         a.put(1,"m");
//         a.put(2,"mu");
//         a.put(3,"muk");
//         a.put(4,"muku");
//         a.put(5,"mukun");
//         System.out.println(a);
//         // System.out.println(a.containsKey(5));
//         // System.out.println(a.containsValue("muk"));
//         // System.out.println(a.values());
//         // System.out.println(a.keySet());
//         // System.out.println(a.hashCode());
//         // a.clear();
//         // System.out.println("after cleaning: "+a);
//         System.out.println(a.firstEntry());
//         System.out.println(a.ceilingEntry(2));
//         System.out.println(a.floorEntry(2));


//     }

// }

import java.util.NavigableMap;
import java.util.TreeMap;

public class serious18 {

    public static void main(String[] args) {
        NavigableMap<String,Integer> a = new TreeMap<>();
        a.put("m",1);
        a.put("mu",2);
        a.put("muk",3);
        a.put("muku",4);
        a.put("mukun",5);
        System.out.println(a);
        // System.out.println(a.containsKey(5));
        // System.out.println(a.containsValue("muk"));
        // System.out.println(a.values());
        // System.out.println(a.keySet());
        // System.out.println(a.hashCode());
        // a.clear();
        // System.out.println("after cleaning: "+a);
        // System.out.println(a.firstEntry());
        // System.out.println(a.ceilingEntry("mu"));
        // System.out.println(a.floorEntry("mu"));

        // NavigableMap<Integer,String> b= a.descendingMap();
        
    }
    

}