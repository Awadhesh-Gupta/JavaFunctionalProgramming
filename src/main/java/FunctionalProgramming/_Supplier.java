package FunctionalProgramming;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBconnectivityURL());
        System.out.println(getDBconnectivityURLbySupplier.get());

    }
    static String getDBconnectivityURL(){
        return "jdbc:\\localhost:9999\\users";
    }

    static Supplier<List<String>> getDBconnectivityURLbySupplier = ()
            -> List.of("jdbc:\\localhost:9999\\users",
                        "jdbc:\\localhost:9999\\tempo");
}
