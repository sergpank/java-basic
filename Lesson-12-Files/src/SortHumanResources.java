import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortHumanResources {
    public static void main(String[] args) throws IOException {
        List<Person> hr = readData("1000 Records.csv");

        hr.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Float.compare(p2.getAgeInYears(), p1.getAgeInYears());
            }
        });

//        System.out.println("Top 10 oldest: ");
//        hr.stream().limit(10).forEach(System.out::println);

        hr.sort((Person p1, Person p2) -> {return Byte.compare(p2.getWeightInKg(), p1.getWeightInKg());});

//        System.out.println("\nTop 10 heaviest: ");
//        hr.stream().limit(10).forEach(System.out::println);

        hr.sort((p1, p2) -> {
            int lastNameCompare = p1.getLastName().compareTo(p2.getLastName());
            if (lastNameCompare == 0) {
                return p1.getFirstName().compareTo(p2.getFirstName());
            } else {
                return lastNameCompare;
            }
        });

        hr.forEach(System.out::println);
    }

    private static List<Person> readData(String fileName) throws IOException {
        List<Person> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String line;
        br.readLine();
        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\,");
            String firstName = split[2];
            String lastName = split[4];
            float ageInYears = Float.valueOf(split[12]);
            byte weightInKg = Byte.valueOf(split[13]);
            data.add(new Person(firstName, lastName, ageInYears, weightInKg));
        }

        return data;
    }
}
