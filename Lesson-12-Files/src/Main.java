import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        File file = new File("/Users/sergpank/work/basic-laboratory/Lesson-12-Files/test.txt");

        File[] dirFiles = file.getParentFile().listFiles();
        List<MyFile> myFiles = new ArrayList<>();
        for (File f : dirFiles)
        {
            myFiles.add(new MyFile(f.getName(), f.isDirectory()));
        }

        Collections.sort(myFiles);
        myFiles.forEach(System.out::println);

        List<Integer> salaries = readSalaries(file);
//
//        // average
//        countAverage(salaries);
//
//        Collections.sort(salaries);
//        // min
//        System.out.println("Min salary: " + salaries.get(0));
//        // max
//        System.out.println("Max salary: " + salaries.get(salaries.size() - 1));
//        // median - 50%
//        System.out.println("median salary: " + salaries.get(salaries.size() / 2));
//        // 90%
//        System.out.println("90% salary: " + salaries.get((int) (salaries.size() * 0.9)));
//        // 95%
//        System.out.println("95% salary: " + salaries.get((int) (salaries.size() * 0.95)));
//        // 99%
//        System.out.println("99% salary: " + salaries.get((int) (salaries.size() * 0.99)));
    }

    private static void countAverage(List<Integer> salaries) {
        int sum = 0;
        for (Integer s : salaries)
        {
            sum += s;
        }
        int averageSalary = sum / salaries.size();
        System.out.println("Average salary is : " + averageSalary);
    }

    private static List<Integer> readSalaries(File file) {
        List<Integer> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            int cnt = 0;
            while ((line = br.readLine()) != null) {
                if (cnt++ == 0) {
                    continue;
                }
                String[] split = line.split("\\,");
                String rawData = split[25];
                System.out.println("raw data = [" + rawData + "]");
                result.add(Integer.valueOf(rawData));
            }
        } catch (IOException e) {
            e.printStackTrace();
            new RuntimeException("unexpected error : stop execution");
        }

        return result;
    }
}
