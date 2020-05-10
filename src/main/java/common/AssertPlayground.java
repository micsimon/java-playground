package common;

public class AssertPlayground {

    public static void main(String[] args) {
        new AssertPlayground().doAssert(null);
    }


    /**
     * Hellps with some stuff
     *
     * @param value so foo
     * @throws NullPointerException
     */
    private void doAssert(String value) {
        assert value != null;

        System.out.println("Hallo alls ok?");

        System.out.println("hey " + value);
    }
}
