package FunctionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //Normal java
        System.out.println("Without Predicate");
        System.out.println(isNumberValid("+91-3432432423"));
        System.out.println(isNumberValid("+977-3432432423") &&  isValidLength("+977-3432432423"));

        //Using Predicate
        System.out.println("\n \n\nWith Predicate");
        System.out.println(isNumberValidByPredicate.test("+91-34324324"));
        System.out.println(isNumberValidByPredicate.and(isValidLengthByPredicate).test("+91-34324324"));
        System.out.println(isNumberValidByPredicate.or(isValidLengthByPredicate).test("+91-343243242324"));
        System.out.println(isNumberValidByBiPredicate.test("+91-34324324",true));
        System.out.println(isNumberValidByBiPredicate.test("+91-34324324234324",true));
        System.out.println(isNumberValidByBiPredicate.test("+91-34324324",false));






    }
    static Boolean isNumberValid(String n){
        return n.startsWith("+91") && n.contains("7");
    }
    static Boolean isValidLength(String n){
        return n.length()==12;
    }
    static Predicate<String> isNumberValidByPredicate = n ->
            n.startsWith("+91") && n.contains("1");
    static Predicate<String> isValidLengthByPredicate = n -> n.length() == 12;

    static BiPredicate<String,Boolean> isNumberValidByBiPredicate = (n,showvalidation) ->
            showvalidation ? (n.startsWith("+91") && n.contains("1") && n.length()==12): false;
}
