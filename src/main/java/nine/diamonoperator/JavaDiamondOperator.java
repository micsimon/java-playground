package nine.diamonoperator;

public class JavaDiamondOperator {

    public static void main(String[] args) {
        new JavaDiamondOperator().diamondOperatorInAnonymousClasses();
    }

    private void diamondOperatorInAnonymousClasses() {

        Airplane<String> a380 = new Airplane() {
            @Override
            public String sayYourName() {
                return "asd";
            }
        };

    }

}
