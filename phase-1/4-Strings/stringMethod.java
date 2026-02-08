public class stringMethod {
    public static void main(String[] args) {
       String name = "ayush"; 
    
    //    System.out.println(name);
       int value = name.length();
      
       System.out.println(value); 
       String lowercase = name.toLowerCase();
       System.out.println(lowercase);
       String upercase = name.toUpperCase();
       System.out.println(upercase);

       String check = "  hello ";
       System.out.println(check);
       System.out.println(check.trim());

       System.out.println(name.substring(2));
       System.out.println(name.substring(2,5));
       System.out.println(name.replace('a', 'p'));
       System.out.println(name.startsWith("ay"));
       System.out.println(name.endsWith("s"));
       System.out.println(name.charAt(2));
       System.out.println(name.indexOf('s'));
       System.out.println(name.indexOf("s",2));
       System.out.println(name.lastIndexOf("h"));
       System.out.println(name.lastIndexOf("h",2));
       System.out.println(name.equals("ayush"));
       System.out.println(name.equalsIgnoreCase("Ayush"));
       


        
    }
}
