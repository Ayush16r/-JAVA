import java.util.Scanner;

public class elseif {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter your age ");
        int age = Sc.nextInt();
        

        if (age < 18 ) { 
            System.out.println(" minior");
        
        } else if ( age >= 18 ) {
            System.out.println("teen age ");

        } else if ( age > 21 ) {
            System.err.println("adult ");

        } else { System.err.println( " invalid input ");}
    }
}