import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class a8_optionalClass {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Ankit", "Laxmi", "Xar", "Rohan");

        String name = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not Found");

        System.out.println(name);

        //----------------------OR-----------------------

        // Optional<String> name = names.stream()
        //                     .filter(str -> str.contains("x"))
        //                     .findFirst();

        // System.out.println(name.orElse("Not Found"));

    }
}
