package common;

public class AssertPlayground {

    public static void main(String[] args) {
        new AssertPlayground().doAssert(null);
    }

    private void doAssert(String value) {
        assert value != null;

        System.out.println("hey " + value);
    }
}
