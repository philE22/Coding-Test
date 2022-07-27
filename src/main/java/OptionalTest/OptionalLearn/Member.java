package OptionalTest.OptionalLearn;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter
@AllArgsConstructor
public class Member {
    String name;
    String id;
    Optional<Car> car;
}
