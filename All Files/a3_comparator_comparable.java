import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        }
        else{
            return -1;
        }
    }
}

public class a3_comparator_comparable {
    public static void main(String[] args) {
        
        // Comparator<Student> com = new Comparator<Student>() {
        //     public int compare(Student i, Student j){
        //         if (i.age > j.age) {
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };
        //--------Using Lambda----------
        Comparator<Student> com = (Student i, Student j) -> {
            return i.age > j.age ? 1 : -1;
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(22, "Ankit"));
        studs.add(new Student(18, "Sahil"));
        studs.add(new Student(36, "Rohan"));
        studs.add(new Student(15, "John"));

        //for use Comparable
        // Collections.sort(studs);

        //for use Comparator
        Collections.sort(studs, com);

        // System.out.println(studs);
        for (Student s : studs) {
            System.out.println(s);
        }

    }
}
