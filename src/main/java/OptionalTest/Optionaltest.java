package OptionalTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionaltest {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList(
                "Ruby", "Python", "Java", "Go", "Kotlin");
        Optional<List<String>> listOptional = Optional.of(languages);

        int size = listOptional
                .map(List::size)
                .orElse(0);
        System.out.println(size);

        Optional.empty();
    }
}
