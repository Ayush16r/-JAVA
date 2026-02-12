public class variable_arguments {
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;

        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(" the sum of 2 & 2 & 2  :"+ sum(2,2,2));
    }
}


// basicly you dont need to make multiple method for difrrent int ---- just pass inside an array and make sum 