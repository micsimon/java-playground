package nine.reactive;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class ReactiveApp {

    public static void main(String[] args) throws InterruptedException {
        new ReactiveApp().doStuff();
    }

    private void doStuff() throws InterruptedException {
        SubmissionPublisher<Person> publisher = new SubmissionPublisher<>();

        PersonSubscriber personSubscriber = new PersonSubscriber();

        publisher.subscribe(personSubscriber);

        List<Person> persons = new PersonHelper().getPersons();
        persons.forEach(person -> publisher.submit(person));

        while (persons.size() != personSubscriber.getCounter()) {
            Thread.sleep(4000);
        }

        publisher.close();


        System.out.println("done");
    }
}
