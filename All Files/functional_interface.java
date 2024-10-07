@FunctionalInterface
interface A{
    void show();
}

// class B implements A{
//     public void show(){
//         System.out.println("This is show method");
//     }
// }

public class functional_interface {
    public static void main(String[] args) {
         A obj = new A(){
            public void show(){
                System.out.println("I am show method");
            }
         };
         obj.show();
    }
}
