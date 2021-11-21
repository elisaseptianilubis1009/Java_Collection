//Collection merupakan istilah struktur data di bahasa pemrogrammanjava
package java_collection;

import java.util.Arrays;
import java.util.Iterator;


public class Java_Collection {

    
    public static void main(String[] args) {
        Iterable<String> names= Arrays.asList("Elisa","Septiani","Lubis");
        
        for(String name : names){
            System.out.println(name);
        }
        
        System.out.println("ITERATOR");
        
        Iterator<String> iterator = names.iterator();
        
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
    
}
