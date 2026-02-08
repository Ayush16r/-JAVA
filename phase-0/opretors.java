public class opretors {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c=2;

        c+=3;
        System.out.println(c);

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));


        int x = 10;
        int y = 20;
        int k= x*y/2;
        System.err.println(k);

        // b^2-4ac/2ac
        int d= b*b - ( 4*a*c )/ (2*a*c) ;
        System.out.println(d);
        
} }