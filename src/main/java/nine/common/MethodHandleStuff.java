package nine.common;

import nine.reactive.Person;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class MethodHandleStuff {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        MethodHandles.Lookup publicLookup = MethodHandles.publicLookup();

        MethodHandle methodType = publicLookup.findGetter(Person.class, "name", String.class);

        System.out.println(methodType);

    }
}
