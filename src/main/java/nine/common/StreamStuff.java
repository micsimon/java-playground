package nine.common;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamStuff {

    public static void main(String[] args) {
        new StreamStuff().takeWhile();
        new StreamStuff().dropWhile();
        new StreamStuff().iterate();
        new StreamStuff().ofNullalbe();
    }

    private void takeWhile() {
        System.out.println("takeWhile()");
        Stream.of(1, 2, 3, 4, 5, 6, 7).takeWhile(i -> i < 3).forEach(System.out::println);
    }

    private void dropWhile() {
        System.out.println("dropWhile()");
        Stream.of(1, 2, 3, 4, 5, 6, 7).dropWhile(i -> i < 3).forEach(System.out::println);
    }

    private void iterate() {
        System.out.println("iterate()");
        IntStream.iterate(1, i -> i < 20, i -> ++i).forEach(System.out::println);
    }

    private void ofNullalbe() {
        System.out.println("ofNullable()");
        System.out.println("not nullable:");
        Stream.ofNullable(1).forEach(System.out::println);
        System.out.println("nullable:");
        Stream.ofNullable(null).forEach(System.out::println);
    }
}
