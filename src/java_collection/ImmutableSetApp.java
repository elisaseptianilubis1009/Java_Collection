
package java_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;


public class ImmutableSetApp {
    
    public static void main(String[] args) {
         Set<String> empty= Collections.emptySet();//Set gak bisa diisi, selalu kosong
         Set<String> onliOne= Collections.singleton("Elisa");// Set hamya bisa menampung satu value
         
         Set<String> mutable= new HashSet<>();
         mutable.add("Elisa");
         mutable.add("Septiani");
         mutable.add("Lubis");
         Set<String> immutable= Collections.unmodifiableSet(mutable);
//         immutable.add("Lub");//tidak bisa di modify, bakal error/
         
         for(String emp : immutable){
             System.out.println(emp);
         }
         
         Set<String> set = Set.of("Julia","Ningsih","Lubis");
    }
    
}
