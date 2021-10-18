public class Person {
    private String firstName;
    private String lastName;
    private float ageInYears;
    private byte weightInKg;

    public Person(String firstName, String lastName, float ageInYears, byte weightInKg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageInYears = ageInYears;
        this.weightInKg = weightInKg;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getAgeInYears() {
        return ageInYears;
    }

    public byte getWeightInKg() {
        return weightInKg;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f years %d kg", lastName, firstName, ageInYears, weightInKg);
    }
}
