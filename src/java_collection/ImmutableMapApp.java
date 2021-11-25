
package java_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ImmutableMapApp {
    
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String,String> singleton = Collections.singletonMap("name", "elisa");
        
        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Septiani");
        Map<String, String> immutable= Collections.unmodifiableMap(mutable);
        System.out.println(immutable.get("name"));
        
        immutable.put("address", "Padangsidimpuan");//ini bakal error karena immutable map
        
       
    }
    
}
