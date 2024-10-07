import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Students{
    private String name;
    private int age;

    public Students() {
    }

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }
    
}

public class a10_constructorReference {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Navin", "Ankit", "John");

        List<Students> students = new ArrayList<>();

        // for(String name : names){
        //     students.add(new Students(name));
        // }

        //--------------OR--------------

        students = names.stream()
                            // .map(name -> new Students(name))  
                            //-----------OR-----------
                            .map(Students::new)   //using constructor reference  
                            .toList();
                                        
        System.out.println(students);

    }
}
