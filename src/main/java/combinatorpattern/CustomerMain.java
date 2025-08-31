package combinatorpattern;

import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;


public class CustomerMain {
    public static void main(String[] args) {
        Customer cs = new Customer("Krishna","+977-9824042122","krishna@gmail.com", LocalDate.of(2008,7,28));

        System.out.println("BY NORMAL JAVA");
        CustomerValidatorService customervalidator = new CustomerValidatorService();
        System.out.println(customervalidator.isValid(cs));


        System.out.println("\n\n\nBY COMBINATOR PATTERN");

        ValidationResult  result= isValidPhone()
                .and(isValidEmail())
                .and(isAdult())
                .apply(cs);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }
    }
}
