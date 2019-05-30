package nine;

public class ProcessHandler {

    public static void main(String[] args) {
        new ProcessHandler().doStuff();
    }

    private void doStuff() {
        ProcessHandle processHandle = ProcessHandle.current();

        // in java9 it was getPid() ... these functions was renamed to pid()
        System.out.println("processHandle: " + processHandle.pid());

        System.out.println("info: " + processHandle.info());
    }
}
