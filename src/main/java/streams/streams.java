package streams;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Awadhesh",Gender.MALE),
                new Person("Anjali", Gender.FEMALE),
                new Person("Jahid", Gender.MALE),
                new Person("Laila", Gender.FEMALE),
                new Person("Rabin", Gender.MALE),
                new Person("Krishna", Gender.MALE)
        );
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Function<Person,String> name = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        people.stream()
                .map(name)//person -> person.name
                .mapToInt(length)//name -> name.length()
                .forEach(println);//person -> System.out.println(person)

        Boolean b = people.stream()
                .noneMatch(person -> Gender.OTHERS.equals(person.gender)); //anyMatch,allMatch
        System.out.println(b);
    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
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
        MALE,FEMALE,OTHERS
    }
}
