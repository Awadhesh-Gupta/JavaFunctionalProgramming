package Imperative;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Awadhesh",Gender.MALE),
                new Person("Krishna",Gender.MALE),
                new Person("Anjali",Gender.FEMALE),
                new Person("Jahid",Gender.MALE),
                new Person("Laila",Gender.FEMALE),
                new Person("Rabin",Gender.MALE)
        );

        //Imperative approach to find how many females in the list

        List<Person> females = new ArrayList<>();

        for(Person person: people){
            if(person.gender.equals(Gender.FEMALE))
                females.add(person);
        }

        for(Person female :females)
            System.out.println(female);

        System.out.println("Declarative approach");
        Predicate<Person> predicateperson = person -> Gender.FEMALE.equals(person.gender);
        List<Person> females2 = people.stream()
                .filter(predicateperson)
                .collect(Collectors.toList());
                females2.forEach(System.out::println);
    }

    static class Person{
      private final String name;
      private final Gender gender;

      Person(String name,Gender gender){
          this.name = name;
          this.gender = gender;
      }
      @Override
      public String toString() {
          return "Person{" +
                  "name='" + name + '\'' +
                  ", gender=" + gender +
                  '}';
      }
    }

    enum Gender{
        MALE,FEMALE
    }
}

