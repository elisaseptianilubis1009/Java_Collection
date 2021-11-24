
package java_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("namefirst", "Elisa");
        map.put("namemiddle", "Septiani");
        map.put("namelast", "Lubis");
        
        System.out.println(map.get("namefirst"));
        System.out.println(map.get("namemiddle"));
        System.out.println(map.get("namelast"));
    }
    
}
