package Thread;


public class Example12_1 {
    public static void main(String args[]){
        Example12_2 example12_2=new Example12_2();
        example12_2.teacher.start();
        example12_2.student.start();
    }
}
