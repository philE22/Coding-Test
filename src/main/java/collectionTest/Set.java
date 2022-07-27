package collectionTest;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java"); // 중복

        Iterator iterator = languages.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
