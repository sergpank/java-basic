import exception.MyError;
import exception.MyExceptionA;
import exception.MyExceptionB;
import exception.MyExceptionC;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        int c;
        if (b == 0) {
            c = 0;
        }

        try {
            c = a / b;
        } catch (ArithmeticException aaa) {
            System.out.println("An error has occurred " + aaa.getClass() + " : " + aaa.getMessage());
            c = 0;
        }
    }

    public static void testException(boolean b) throws MyExceptionA, MyExceptionB, MyExceptionC {
        if (b) {
            new Panic().throwMyExceptionA();
        } else {
            new Panic().throwMyExceptionB();
            new Panic().throwMyExceptionC();
        }
    }

    public  static void testError()
    {
        new Panic().throwMyError();
    }
}
