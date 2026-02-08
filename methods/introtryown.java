public class introtryown {
    
    static void greet()
    {
        System.out.println("hello user welcome to java programming");
    }
    static int add(int a,int b) {
        int c = a + b;
        return c;
   }
   static int condition(int x,int y) {
    int z;
    if (x>y) {
         z = x+y;    
    } else {
         z = x*3+y;
    }
    
    return z;

        
}

    public static void main(String[] args) {
        greet();
        System.out.println(" sum method ");
        int c = add(5, 6);
        System.out.println(" the sum is " + c);
        int z= condition(7, 6);
        System.out.println(" the sum is " + z);


    }
}
