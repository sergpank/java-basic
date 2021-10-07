public abstract class AbstractPrinter {

    public AbstractPrinter() {
    }

    public void print(String message) {
        System.out.printf("Message from abstract printer: \"%s\"\n", message);
    }
}
