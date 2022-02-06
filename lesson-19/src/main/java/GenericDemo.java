import animal.Animal;
import animal.Cat;
import animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {

        GenericDemo demo = new GenericDemo();

        List<Animal> dogList = new ArrayList<>();
        dogList.add(new Dog("Ceasar"));
        dogList.add(new Dog("Rex"));

        List<Animal> catList = new ArrayList<Animal>();
        catList.add(new Cat("Pushok"));
        catList.add(new Cat("Tom"));

        Dog dog = (Dog) demo.get(dogList);
        Cat cat = (Cat) demo.get(catList);

        System.out.println("dog \"Tom\" found = " + dog);
        System.out.println("cat \"Tom\" found = " + cat);
    }

    public <T extends Animal> T get(List<T> list) {
        T result = null;

        for (T a : list) {
            if (a.getName().equals("Tom")) {
                result = a;
                break;
            }
        }

        return result;
    }

//    public Animal get(List<Animal> list) {
//        Animal result = null;
//
//        for (Animal a : list) {
//            if (a.getName().equals("Tom")) {
//                result = a;
//                break;
//            }
//        }
//
//        return result;
//    }

    public int  sum(int a, int b) {return 0;}
    public long sum(long a, long b) {return 0;}

    public Cat sum(Cat a, Cat b) {return null;}
    public Dog sum(Dog a, Dog b) {return null;}
    public Animal sum(Animal a, Animal b) {return null;}

    //public <T extends Dog> T sum(T a, T b) {return null;}

}
