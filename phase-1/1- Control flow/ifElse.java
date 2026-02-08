import java.util.*;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter you name");
        String name = sc.next();
        System.out.println("enter your age ");
        int a = sc.nextInt();

        int minage=18;

        if (a>minage) {
            System.out.println( "hello " + name + " you are eligible to drive ");

            
        }
        else { System.out.println( " sry! " +name + " you are not eligible to drive");}

    }
    
}
