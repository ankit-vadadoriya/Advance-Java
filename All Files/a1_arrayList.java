import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;


public class a1_arrayList {
    public static void main(String[] args) {
        
        List<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(5);
        numbers1.add(8);
        numbers1.add(9);
        numbers1.add(2);
        numbers1.add(8);
        
        for (int num1 : numbers1) {
            System.out.println(num1);
        }

        System.out.println("--------------HashSet-------------------------");

        Set<Integer> numbers2 = new HashSet<Integer>();
        numbers2.add(15);
        numbers2.add(28);
        numbers2.add(59);
        numbers2.add(32);
        numbers2.add(8);

        for (int num2 : numbers2) {
            System.out.println(num2);
        }

        System.out.println("--------------TreeSet-------------------------");
        //TreeSet use to get value in order

        Set<Integer> numbers3 = new TreeSet<Integer>();
        numbers3.add(15);
        numbers3.add(28);
        numbers3.add(59);
        numbers3.add(32);
        numbers3.add(8);

        for (int num3 : numbers3) {
            System.out.println(num3);
        }

        System.out.println("-------------Iterator--------------------------");

        Collection<Integer> numbers4 = new TreeSet<Integer>();
        numbers4.add(5);
        numbers4.add(8);
        numbers4.add(9);
        numbers4.add(2);
        numbers4.add(8);

        Iterator<Integer> values = numbers4.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }
}
