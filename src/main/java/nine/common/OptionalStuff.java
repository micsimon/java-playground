package nine.common;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalStuff {

    public static void main(String[] args) {
        new OptionalStuff().optionalStream();
    }

    private void optionalStream() {
        getStream().flatMap(Optional::stream).forEach(s -> System.out.println(s));
    }

    private Stream<Optional<String>> getStream() {
        return List.of(Optional.of("2"), Optional.of("3"), Optional.of("5")).stream();
    }
}
