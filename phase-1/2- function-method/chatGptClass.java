import java.lang.reflect.Method;

public class chatGptClass {
        public static void sayhello(){
            System.out.println("hello ayush!");
        }
        public static void printname(){
            System.out.println("Ayush ranjan ");


        }
        public static String sayname(){
            return "ayush ";
        }

        // public static void main(String[] args) {
        //     sayhello();
        //     printname();
        //     System.out.println("good morning " + sayname());
        // }

        // so at first there is function name    sayhello  - and when i calling it in main statment it returning hello ayush 

//         🔹 Understanding Keywords
// Keyword        	Meaning
// public       	Access modifier
// static       	Belongs to class
// void         	Returns nothing
// greet        	Method name

// Type 3: Method with Return Type

            public static int add(int a , int b){
                return a+b;
            }
            public static void main(String[] args) {
                int a=2;
                int b=4;
                int result=add(2, 2);
                System.out.println(add(4, 4));
                System.out.println(result);
                
            }

        }

    

