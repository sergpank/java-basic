package animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String shout() {
        return "wof";
    }
}
