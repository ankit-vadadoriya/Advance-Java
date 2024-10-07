import java.util.Scanner;

enum Status{
    Running, Failed, Pending, Success;
}

public class enumDemo {
    public static void main(String[] args){
        // Status s1 = Status.Running;
        // System.out.println(s1);

        // Status s2 = Status.Failed;
        // System.out.println(s2.ordinal());

        // Status[] s3 = Status.values();
        // // System.out.println(s3);
        // for(Status s4 : s3){
        //     System.out.println(s4 + " : " + s4.ordinal());
        // }

        //enum with switch and if - else

        Status s5 = Status.Success;

        switch (s5) {
            case Running : System.out.println("All Good");
                break;
            case Failed : System.out.println("Try Again");
                break;
            case Pending : System.out.println("Please Wait");
                break;
            default : System.out.println("Done");
                break;
        }

        // if(s5 == Status.Running){
        //     System.out.println("All Good");
        // }
        // else if(s5 == Status.Failed){
        //     System.out.println("Try Again");
        // }
        // else if(s5 == Status.Pending){
        //     System.out.println("Please Wait");
        // }
        // else{
        //     System.out.println("Done");
        // }

    }
}
