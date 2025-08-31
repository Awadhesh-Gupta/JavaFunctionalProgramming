package FinalSection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        BiFunction<String,Integer,String> toUppercasedName = (name, age) ->
        {
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println("age: "+age);
            return name.toUpperCase();
        };

        System.out.println(toUppercasedName.apply("Awadhesh",21));
    }
}
