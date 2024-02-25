package lekcija5;

import com.github.javafaker.Faker;
import lekcija4.Dog;

public class RandomData {
    public static void main(String[] args) {
        Faker randomDataGenerators = new Faker();

                System.out.println(randomDataGenerators.address().fullAddress());
//        System.out.println(randomDataGenerators.address().fullAddress());
        System.out.println(randomDataGenerators.ancient().hero());
        System.out.println(randomDataGenerators.cat().name());

        Dog mansSuns = new Dog();
        mansSuns.setName(randomDataGenerators.dog().name());
        mansSuns.setAge(randomDataGenerators.dog().hashCode());
        mansSuns.setWeight(randomDataGenerators.dog().hashCode());

        mansSuns.prinDog();
    }
}
