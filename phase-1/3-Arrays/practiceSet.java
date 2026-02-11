public class practiceSet {
    public static void main(String[] args) {
        // Question 1 - create an array of 5 floats and calculate their sum
        float numbers[]= { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float sum=0;
        for (int i=0; i<numbers.length; i++)
        {
            sum = sum + numbers[i];
           
        }
         System.out.println(sum);


         // Question 2 - Write a program to find out whether a given integer is present in an array or not.

    float num = 3.5f;
    boolean isInArray= false;
    for ( float element : numbers)
    {
        if (num==element) {
            isInArray=true;
            break;  
        }}


        if (isInArray) {
            System.out.println(" is in array ");
        } else { System.out.println( " not in the array "); 


        }


        // q3- calculate an average marks from an array  contanong all marks in physics  using for each loop 
        float marks[]= { 1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float add=0;
        for(int i=0; i<marks.length;i++) {
            add= add+ marks[i];
            
        } System.out.println(" the average marks in physics " + add/marks.length);



        // Question 4 - WAP to create an add two matrix 2*3 .
        

    }
}

    
    
      


