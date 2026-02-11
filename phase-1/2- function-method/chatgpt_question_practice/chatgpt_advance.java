package chatgpt_question_practice;
public class chatgpt_advance {
static int max(int x, int y, int z){
    int largest=x;
    if (y>x) {
        largest=y;
        
    }
    if (z>largest) {
        largest =z;
        
    }
    return largest;


}
public static void main(String[] args) {
    int result=max(3, 5, 1);
    System.out.println(result);
}
}
