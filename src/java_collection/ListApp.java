package java_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
//        ====================Implement ArrayList()==================================
//        List<String> arrayList = new ArrayList<>();
//        
//        arrayList.add("Elisa");
//        arrayList.add("Septiani");
//        
//        arrayList.set(0, "Julia");
//        arrayList.remove(1);
//        
//        System.out.println(arrayList.get(0));
//        
//        for(String name : arrayList){
//            System.out.println(name);
//        }

//========================Implement LinkedList()=====================================
        List<String> linkedList = new LinkedList<>();
        
        linkedList.add("Emmi");
        linkedList.add("Hasibuan");
        linkedList.addAll(Arrays.asList("Alamat","Sidadi Jae"));
        
        linkedList.set(0,"Lubis");
        
        linkedList.remove(2);
        
        for(String text : linkedList){
            System.out.println(text);
        }
        System.out.println("Length :"+linkedList.size());   }

}
