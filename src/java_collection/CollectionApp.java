
package java_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Elisa");
        names.add("Septiani");
        names.add("Lubis");
        names.addAll(Arrays.asList("Alamat","Sidadi", "Jae"));
        
        for(String name : names){
            System.out.println(name);
        }
        
        System.out.println("REMOVE");
        
        names.remove("Elisa");
        names.removeAll(Arrays.asList("Sidadi","Jae"));
        
        for(String name : names){
            System.out.println(name);
        }
        
        System.out.println(names.contains("Septiani"));
        
        System.out.println(names.containsAll(Arrays.asList("Lubis","Alamat")));
    }
    
}
