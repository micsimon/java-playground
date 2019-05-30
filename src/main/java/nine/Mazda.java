package nine;

public class Mazda implements Car {
    @Override
    public String sayHello() {
        return "Hello im a Mazda!";
    }

    public String sayHelloAndImACarFromInterface() {
        return sayHelloAndImACar();
    }
}
