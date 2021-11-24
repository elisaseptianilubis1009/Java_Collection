
package java_collection;

import java.util.EnumMap;
import java.util.Map;


public class EnumHashMapApp {
    
    public static enum Level{
        FREE,STANDARD,PERMIUM,VIP
    }
    
    public static void main(String[] args) {
        Map<Level, String>  map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Elisa");
        map.put(Level.PERMIUM, "Septiani");
        map.put(Level.STANDARD, "Lubis");
        
        for(Level key :map.keySet()){
            System.out.println(map.get(key));
        }
         
    }
    
}
