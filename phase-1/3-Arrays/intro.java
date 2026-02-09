public class intro {
    public static void main(String[] args) {
        int[] marks = new int [5];
        marks[0]=100;
        marks[1]=200;
        marks[3]=300;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        int marks2[] = {100,200,300,400,500}; // declaration and initialization in one line
        float[] marks3;

        marks3 = new float[] {100,200,30.4f,400,500}; // declaration and initialization in two lines
        System.out.println(marks3.length);
        String [] names = { " ayush ", " ranjan "};


        for (int i=0; i<marks3.length;i++){
            System.out.println(marks3[i]);
        }

    }
}
