// LINKED HASHMAPS //
//LHM AND HM ARE CLASSES OF MAPS


// import java.util.LinkedHashMap;
// import java.util.Map;
// import java.util.Set;

// public class serious17 {
//     public static void main(String[] args) {
//         LinkedHashMap<String,Double> a = new LinkedHashMap<>();
//         a.put("john", 234234.2342);
//         a.put("jo", 234.2342);
//         a.put("j", 23.2342);
//         System.out.println(a);

//         // COVERTING INTO SET //
//         Set<Map.Entry<String, Double>> b = a.entrySet();
//         System.out.println(b); 

//         // DISPLAYING THE SET
//         for(Map.Entry<String,Double> entry:b){
//             System.out.println(entry.getKey()+":"+entry.getValue());
            
//         }
//     }    
// }


// import java.util.LinkedHashMap;
// import java.util.Map;
// import java.util.Set;

// public class serious17 {
//     public static void main(String[] args) {
//         LinkedHashMap<String,Double> a = new LinkedHashMap<>();
//         a.put("john", 234234.2342);
//         a.put("jo", 234.2342);
//         a.put("j", 23.2342);
//         System.out.println(a);

//         // COVERTING INTO SET //
//         Set<Map.Entry<String, Double>> b = a.entrySet();
//         System.out.println(b); 

//         // DISPLAYING THE SET
//         for(Map.Entry<String,Double> entry:b){
//             System.out.println(entry.getKey()+":"+entry.getValue());
            
//         }
//         a.clear();
//         if (a.isEmpty()){
//             System.out.println(entry.getKey()+":"+entry.getValue());
//             System.out.println("null");

//         }  
            
//     }    
// }

import java.util.LinkedHashMap;

public class serious17 {

    public static void main(String[] args) {
        LinkedHashMap<Integer,String> a = new LinkedHashMap<>();
        a.put(1,"m");
        a.put(2,"mu");
        a.put(3,"muk");
        a.put(4,"muku");
        a.put(5,"mukun");
        System.out.println(a);
        System.out.println(a.containsKey(5));
        System.out.println(a.containsValue("muk"));
        System.out.println(a.values());
        System.out.println(a.keySet());
        System.out.println(a.hashCode());
        a.clear();
        System.out.println("after cleaning: "+a);

    }
}
