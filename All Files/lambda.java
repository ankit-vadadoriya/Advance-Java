@FunctionalInterface
interface A{
    void show(int i);
}

// class B implements A{
//     public void show(){
//         System.out.println("This is show method");
//     }
// }

public class lambda {
    public static void main(String[] args) {
         A obj = (i) -> {
            System.out.println("This is show method " + i);
         };
         obj.show(5);
    }
}
