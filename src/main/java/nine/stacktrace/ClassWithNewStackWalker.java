package nine.stacktrace;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.StackWalker.Option.*;

public class ClassWithNewStackWalker {

    public void showCurrentStacktrace() {
        StackWalker stackWalker = StackWalker.getInstance(Set.of(RETAIN_CLASS_REFERENCE, SHOW_HIDDEN_FRAMES, SHOW_REFLECT_FRAMES));
        System.out.println("caller class: " + stackWalker.getCallerClass());

        List<StackWalker.StackFrame> walk = stackWalker.walk(this::walkExample);

        for (StackWalker.StackFrame stackFrame : walk) {
            System.out.println("stacktrace frame: " + stackFrame);
        }
    }

    private List<StackWalker.StackFrame> walkExample(Stream<StackWalker.StackFrame> stackFrameStream) {
        return stackFrameStream.collect(Collectors.toList());
    }
}