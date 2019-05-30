package nine.reactive;

import java.util.List;

public class PersonHelper {

    public List<Person> getPersons() {
        return List.of(new Person("Hans", 22), new Person("Dieter", 44), new Person("Steve", 27));
    }
}
