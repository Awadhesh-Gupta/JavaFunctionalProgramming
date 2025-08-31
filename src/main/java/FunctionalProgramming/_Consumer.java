package FunctionalProgramming;

import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        //Normal Java
         Customer maria = new Customer("maria","987663423");
         greetCustomer(maria);
         greetCustomerV2(maria,true);
         greetCustomerV2(maria,false);

        //Consumer Functional Programming
        greetCustomerbyConsumer.accept(maria);
        greetCustomerbyConsumerV2.accept(maria,true);
        greetCustomerbyConsumerV2.accept(maria,false);


    }
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customername+", your number has been registered which is "+customer.customerphonenumber+" by normal java");
    }
    static void greetCustomerV2(Customer customer,Boolean showphonenumber){
        System.out.println("Hello "+customer.customername+", your number has been registered which is "+(showphonenumber ? customer.customerphonenumber : "*********") + " by normal java");

    }
    static Consumer<Customer> greetCustomerbyConsumer = customer ->
            System.out.println("Hello "+customer.customername+", your number has been registered which is "+customer.customerphonenumber+" by Consumer Functional Programming");

    static BiConsumer<Customer, Boolean> greetCustomerbyConsumerV2 = (customer,showphonenumber) ->
            System.out.println("Hello "+customer.customername+", your number has been registered which is "+(showphonenumber ? customer.customerphonenumber : "*********") + " by BiConsumer Functional Programming");

    static class Customer{
        private final String customername;
        private final String customerphonenumber;
        Customer(String customername, String number){
            this.customername = customername;
            customerphonenumber = number;
        }

    }
}
