import java.util.HashMap;
import java.util.Map;

public class a2_map {
    public static void main(String[] args) {
     
        Map<String, Integer> students = new HashMap<String, Integer>();
        students.put("Ankit", 11);
        students.put("Amit", 25);
        students.put("Kevin", 97);
        students.put("Sahil", 42);
        students.put("Amit", 55);
        
        // System.out.println(students);
        // System.out.println(students.keySet());
        // System.out.println(students.values());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
        
    }
}
