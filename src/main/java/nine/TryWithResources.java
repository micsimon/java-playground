package nine;

import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {

    private static final String FILE_NAME = "test.txt";

    public static void main(String[] args) throws IOException {
        new TryWithResources().doStuff();
    }

    private void doStuff() throws IOException {
        InputStream resourceAsStream = TryWithResources.class.getClassLoader().getResourceAsStream(FILE_NAME);

        try (resourceAsStream) {
            int data = resourceAsStream.read();
            while (data != -1) {
                System.out.println((char) data);
                data = resourceAsStream.read();
            }
        }
    }

}
