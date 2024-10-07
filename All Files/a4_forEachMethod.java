import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class a4_forEachMethod {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);

        // Consumer<Integer> con = new Consumer<Integer>() {
        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };
        //----------using lambda------------

        // Consumer<Integer> con = n -> {System.out.println(n);};
        // nums.forEach(con);
        //-----------------OR----------------
        nums.forEach(n -> System.out.println(n));

        // int Esum = 0;
        // int Osum = 0;
        // for (int n : nums) {
        //     if (n % 2 == 0) {
        //         Esum = Esum + n;
        //     }
        //     else if (n % 2 != 0) {
        //         Osum = Osum + n;
        //     }
        // }
        // System.out.println("Total of Even numbers : " + Esum);
        // System.out.println("Total of Odd numbers : " + Osum);

    }
}
