package nine.stacktrace;

public class Subclass {

    public void doStuff() {
        first();
    }

    private void first() {
        second();
    }

    private void second() {
        new ClassWithNewStackWalker().showCurrentStacktrace();
    }
}
