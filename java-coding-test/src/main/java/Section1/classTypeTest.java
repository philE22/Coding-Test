package Section1;

import java.util.HashMap;

public class classTypeTest {
    public static void main(String[] args) {

        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("dsad", 213);

        System.out.println(hashMap.getClass().getSimpleName());

        String na = hashMap.getClass().getSimpleName();

        switch (na) {
            case "String":
                System.out.println("String");
                break;

            case "HashMap":
                System.out.println("jajajajaj");
                break;


        }


    }


}
