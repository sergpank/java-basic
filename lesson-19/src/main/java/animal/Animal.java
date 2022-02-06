package animal;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String shout();

    @Override
    public String toString() {
        return String.format("'%s' says '%s'", name, shout());
    }
}
