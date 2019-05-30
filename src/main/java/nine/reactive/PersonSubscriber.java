package nine.reactive;

import java.util.concurrent.Flow;

public class PersonSubscriber implements Flow.Subscriber<Person> {

    private Flow.Subscription subscription;
    private int counter = 0;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("onSubscribe()");
        this.subscription = subscription;
        this.subscription.request(1);
        System.out.println("request subscription 1 item");
    }

    @Override
    public void onNext(Person person) {
        System.out.println("onNext() person: " + person);
        counter++;
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("onError() " + throwable);
    }

    @Override
    public void onComplete() {
        System.out.println("onComplete()");
    }

    public int getCounter() {
        return counter;
    }
}
