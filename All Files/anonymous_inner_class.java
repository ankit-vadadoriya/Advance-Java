class AA{
    public void show(){
        System.out.println("Show");
    };
}
public class anonymous_inner_class {
    public static void main(String[] args){
        AA obj = new AA()
        {
            public void show(){
                System.out.println("New Show");
            }
        };
        obj.show();
    }
}