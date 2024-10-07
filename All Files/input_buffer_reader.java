import java.io.BufferedReader;
import java.io.InputStreamReader;

public class input_buffer_reader {
    public static void main(String[] args) {
        
        System.out.print("Enter a number : ");
        try {

            // int num = System.in.read();
            // System.out.println(num);  //return the ASCII value

            //------------------------------------
            
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);

            // int num = Integer.parseInt(bf.readLine()); //return integer
            String num = bf.readLine();
            System.out.println(num);

            bf.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Bye");
        }

    }
}
