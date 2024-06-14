import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class serious16 {
    public static void main(String[] args) {
        HashMap<String,Double> a = new HashMap<>();
        a.put("john", 234234.2342);
        a.put("jo", 234.2342);
        a.put("j", 23.2342);
        System.out.println(a);
        // System.out.println(a.entrySet());
        // COVERTING INTO SET //
        Set<Map.Entry<String, Double>> b = a.entrySet();
        System.out.println(b); 

        // DISPLAYING THE SET
        for(Map.Entry<String,Double> entry:b){
            System.out.println(entry.getKey()+":"+entry.getValue());
            
        }
    }    
}
