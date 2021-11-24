
package java_collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class LinkedHashMapApp {
    
    public static void main(String[] args) {
        Map<String, String> map= new LinkedHashMap<>();
        
        map.put("first", "Elisa");
        map.put("Last", "Septiani");
        map.put("middle", "Lubis");
        
        Set<String> keys= map.keySet();
        
        for(String key : keys){
            System.out.println(key);
        }
    }
    
}
