class A{
    public void show(){
        System.out.println("This is show method");
    }

    class B{
        public void config(){
            System.out.println("This is config method");
        }
    }

    static class C{
        public void run(){
            System.out.println("This is run method");
        }
    }
}
public class innerClass {
    public static void main(String[] args){
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C();
        obj2.run();
    }
}