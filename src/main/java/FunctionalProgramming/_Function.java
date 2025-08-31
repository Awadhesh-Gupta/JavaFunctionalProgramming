package FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println("By Imperative method: "+increment(9));
        System.out.println("Function<T,R> takes 1 argument and produces 1 result");
        int increment2 = IncrementbyOne.apply(9);
        System.out.println("By Declarative or Functional Programming: "+increment2);
        System.out.println("Multiplying By 10: "+multiplyby10Function.apply(increment2));

        //if we have to immediatly multiply after incrementing
        Function<Integer,Integer> incrementbyoneandThenMultiplyby10 = IncrementbyOne.andThen(multiplyby10Function);
        System.out.println("if we have to immediatly multiply after incrementing: "+incrementbyoneandThenMultiplyby10.apply(9));

        System.out.println("\n\n\nBiFunction<T,U,R> takes 2 arguments and produces 1 result");
        System.out.println(incrementbyoneAndmultipyBiFunction.apply(9,20));

    }
    static Function<Integer,Integer> IncrementbyOne = number -> number+1;
    static Function<Integer,Integer> multiplyby10Function = number -> number*10;
    static int increment(int n){
        return n+1;
    }

    static BiFunction<Integer,Integer,Integer> incrementbyoneAndmultipyBiFunction = (incrementbyone,multiplyby10) -> (incrementbyone+1)*multiplyby10;
}
