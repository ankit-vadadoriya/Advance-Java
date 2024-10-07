@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class lambda1 {
    public static void main(String[] args) {

        //using Anonymous class
         A obj = new A() {
          public int add(int i, int j){
            return i+j;
          }  
         };

         //using with lmabda
        //  A obj1 = (i,j) -> { return i+j;  };
         //-----OR------
         A obj1 = (i,j) -> i+j;

         int result = obj.add(5,5);
         int result1 = obj1.add(5,7);
         System.out.println(result);
         System.out.println(result1);
    }
}
