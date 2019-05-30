package nine.privateinterface;

public class InterfacePrivateMethod {

    public static void main(String[] args) {
        System.out.println("first: " + new Mazda().sayHello());
        System.out.println("second: " + new Mazda().sayHelloAndImACarFromInterface());
    }
}
