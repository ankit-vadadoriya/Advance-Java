import java.util.Arrays;
import java.util.List;

public class a9_methodReference {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Navin", "Ankit", "John");

        List<String> uNames = names.stream()
                                    // .map(name -> name.toUpperCase())  //using lambda expression
                                    //------------OR-------------
                                    .map(String::toUpperCase)   //using method reference
                                    .toList();
        
        System.out.println(uNames);
        uNames.forEach(System.out::println);
        //----------------OR--------------
        uNames.forEach(i -> System.out.println(i));
        //-----------OR------------
        for(int i = 0; i < names.size(); i++){
            System.out.println((i+1) + ". " + names.get(i));
        }

    }
}
