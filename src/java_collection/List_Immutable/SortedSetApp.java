
package java_collection.List_Immutable;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    
    public static void main(String[] args) {
        SortedSet<Person> people= new TreeSet<>(new PersonComparator().reversed());
        
        people.add(new Person("Elisa"));
        people.add(new Person("Septiani"));
        people.add(new Person("Lubis"));
        
        for(Person person : people){
            System.out.println(person.getName());
        }
        
        SortedSet<Person> immutable=Collections.unmodifiableSortedSet(people);
//        immutable.add(new Person("Joko"));// ini bakal error karena immutable
    }
    
}
