import java.util.Scanner;

public class switchcase {
    
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.print("enter your age:");
         
         int age = sc.nextInt();

         switch (age) {
            case 18:
                System.out.println("you are eligible to drive ");
                break;
         
            default:
                System.out.println("you are not eligible to drive ");
                break;
         }
         System.out.println("Enter you cahr");
         String var = sc.next();

         switch (var) {
            case "a":
                System.out.println("hello");
                break;
         
            default:
                break;
         }
    }
}
