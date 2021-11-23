
package java_collection.List_Immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;


public class NavigableSetApp {
    
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Arrays.asList("Elisa","Septiani","Lubis","Universitas","Nasional","Pasim","Bandung"));
        
        NavigableSet<String> namesReverse= names.descendingSet();//untuk nge reversed
        NavigableSet<String> lubis = names.headSet("Lubis", true);//ini dari depan ke lubis
        NavigableSet<String>  nasional = names.tailSet("Nasional", true);// ini dari nasional ke bawah
        
        for(String name : names){//otomatis terurut
            System.out.println(name);
        }
        System.out.println("________________________");
        for(String name : lubis){//otomatis terurut
            System.out.println(name);
        }
        System.out.println("________________________");
        for(String name : nasional){//otomatis terurut
            System.out.println(name);
        }
        
        NavigableSet<String> immutable= Collections.unmodifiableNavigableSet(names);
        immutable.add("Joko");
    }
    
}
