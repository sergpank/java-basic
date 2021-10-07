public class Main {

    public static void main(String[] args) {
        Printer p = new Printer() {
            @Override
            public void print(String message) {
                System.out.println("here is you message: \"" + message + "\"");
            }

            @Override
            public void print(String message, int repeat) { }

            @Override
            public void print(String message1, String message2) { }
        };

        p.print("message for anonymous printer");

        AbstractPrinter ap = new AbstractPrinter(){
            @Override
            public void print(String message) {
                System.out.println("from Anonymous inner class: " + message);
            }
        };

        ap.print("lalala");

        new MyPrinter().print("test message");
    }
}
