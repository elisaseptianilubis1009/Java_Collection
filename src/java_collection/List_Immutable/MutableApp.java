
package java_collection.List_Immutable;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        
        Person person = new Person("Elisa");
        person.addHobby("Nonton");
        person.addHobby("Travelling");
        
        doSomethingWithHobbies(person.getHobbies());
        
        for(String hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }
    
    public static void doSomethingWithHobbies(List<String> Hobbies){
        Hobbies.add("tambah sembarang");//Seharusnya gk boleh add disini, harus lewat object personnya
        
    }
    
}
