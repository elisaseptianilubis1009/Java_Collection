package java_collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender {
        FEMALE, MALE, NO_MENTION
    }

    public static void main(String[] args) {

//      EnumSet<Gender> genders= EnumSet.allOf(Gender.class);// bisa pakai SET misal
        Set<Gender> genders2= EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders = EnumSet.of(Gender.FEMALE, Gender.MALE);

        for (Enum gender : genders) {
            System.out.println(gender);
        }

    }

}
