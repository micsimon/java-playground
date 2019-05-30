package nine.common;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Http2Client {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        new Http2Client().doStuff();
    }

    private void doStuff() throws URISyntaxException, IOException, InterruptedException {
        URI uri = new URI("http://www.google.de");

        HttpRequest request = HttpRequest.newBuilder().uri(uri).GET().build();

        HttpResponse<String> send = HttpClient.newBuilder().build().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(send.body());

    }
}
