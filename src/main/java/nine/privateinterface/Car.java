package nine.privateinterface;

public interface Car {

    String sayHello();

    default String sayHelloAndImACar() {
        return sayHello() + " " + sayYourAreACar();
    }

    private String sayYourAreACar() {
        return "im a car!!";
    }
}
