package Optionals;
import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Object o = Optional.ofNullable(null)  // but if we keep some value here that will print
                .orElseGet(() -> "default value");
        System.out.println(o);

        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
        Object exceptionq = Optional.ofNullable("mirza")
                .orElseThrow(exception);
        System.out.println(exceptionq);

        Optional.ofNullable("mulazim")  //if we keep null, it won't display for ifPresent()
                .ifPresent(name -> {
                    //condition if want
                    System.out.println("Hello world "+name);
                });
        Optional.ofNullable("fsfsf@gmail.com")
                .ifPresentOrElse(email -> System.out.println("your email is: "+email),
                        () -> System.out.println("Email is not present")
                );

    }
}
