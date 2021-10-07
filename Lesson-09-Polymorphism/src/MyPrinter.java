public class MyPrinter extends AbstractPrinter{
    @Override
    public void print(String message)
    {
        System.out.println("Override :: " + message);
    }
}
