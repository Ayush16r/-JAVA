package chatgpt_question_practice;
            // count digit  example  12345 ----  5 digit 
public class q2 {
    static int countDigit(int n){
        int count=0;
        
    while (n != 0) {
        count++;
        n = n / 10;
    }

    return count;
}
public static void main(String[] args) {
    int result =countDigit(123456789);
    System.out.println(result);
}
    }

