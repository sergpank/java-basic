import exception.MyError;
import exception.MyExceptionA;
import exception.MyExceptionB;
import exception.MyExceptionC;

public class Panic {
    public void throwMyError()
    {
        System.out.println("Throwing a custom error");
        throw new MyError("This is my custom error");
    }

    public void throwMyExceptionA() throws MyExceptionA {
        System.out.println("Throwing exception A");
        throw new MyExceptionA("this is exception A");
    }

    public void throwMyExceptionB() throws MyExceptionB {
        System.out.println("Throwing exception B");
        throw new MyExceptionB("this is exception B");
    }

    public void throwMyExceptionC() throws MyExceptionC {
        System.out.println("And here goes exception C!");
        throw new MyExceptionC("somethig terrible has happened");
    }
}
