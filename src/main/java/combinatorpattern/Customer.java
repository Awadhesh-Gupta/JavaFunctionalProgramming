package combinatorpattern;
import java.time.LocalDate;
public class Customer {
    private final String name;
    private final String phone;
    private final String email;
    private final LocalDate dob;

    public Customer(String name, String phone, String email,LocalDate dob){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.dob = dob;
    }

    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public LocalDate getDob(){
        return dob;
    }

}
