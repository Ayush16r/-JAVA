public class relational {
    
    public static void main(String[] args) {
        boolean a= true;
        boolean b= false;
        boolean c= false;
        boolean d= true;

        if (a && b) {
            System.out.println("Y");
        } else { System.out.println( " N ");}


        if (b && c) {
            System.out.println("Y");
        } else { System.out.println( " N ");}

        if (a && d) {
            System.out.println("Y");
        } else { System.out.println( " N ");}


        System.out.println(" for logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);

    }
}
