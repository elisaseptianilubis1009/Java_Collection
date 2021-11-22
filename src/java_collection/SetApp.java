package java_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();  //Kalo menggunakan type data HashSet data nya tidak berurut
        Set<String> names = new LinkedHashSet<>(); // Datanya bakal berurut
        names.add("Elisa");
        names.add("Septiani");
        names.add("Lubis");
        names.add("Bandung");
        names.add("Elisa");
        names.add("Septiani");
        names.add("Lubis");

        for (String name : names) {
            System.out.println(name);
        }

    }

}
