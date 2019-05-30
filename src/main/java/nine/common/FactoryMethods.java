package nine.common;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {


    private void doStuff() {
        List<String> list = List.of("1", "2", "3");
        System.out.println("list -> " + list);

        Map<String, Integer> map = Map.of("1", 1, "2", 2, "3", 3);
        System.out.println("map -> " + map);

        Set<String> set = Set.of("1", "2", "3");
        System.out.println("set -> " + set);

    }

    public static void main(String[] args) {
        new FactoryMethods().doStuff();
    }
}
