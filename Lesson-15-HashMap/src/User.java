public class User implements Comparable{
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hashCode='" + hashCode() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        User that = (User) o;
        return this.firstName.equals(that.firstName)
                && this.lastName.equals(that.lastName)
                && this.age == that.age;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + age;
    }

    @Override
    public int compareTo(Object o) {
        return this.lastName.compareTo(((User)o).lastName);
    }
}
