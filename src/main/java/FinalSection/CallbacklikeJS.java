package FinalSection;
import java.util.function.Consumer;
public class CallbacklikeJS {
    public static void main(String[] args) {
        System.out.println("Using Runnable interface since i don't want to print any value here");
        check("Ashok","pratap",() -> System.out.println("no lastname is provided for"));
        System.out.println("\n\nUsing funcitonal programming that is Consumer<T> coz i wanna print the person name for whom lastname not provided");
        check2("Awadhesh",null,value -> System.out.println("no lastname is provided for "+ value));

    }
    static void check(String firstname,String lastname, Runnable callback){
        System.out.println(firstname);
        if(lastname != null){
            System.out.println(lastname);
        }else{
            callback.run();
        }
    }
    static void check2(String firstname,String lastname, Consumer<String> callback){
        System.out.println(firstname);
        if(lastname != null){
            System.out.println(lastname);
        }else{
            callback.accept(firstname);
        }
    }

    /* JavaScript mey callback ka tarika
    function check(firstname,lastname,callback()){
        consoe.log(firstname);
        if(lastname){
            console.log(lastname);
        }else{
            console.log("Lastname not provided")
        }
       }
       check("Awadhesh",null,function(){console.log("lastname not provided")});

    */
}
