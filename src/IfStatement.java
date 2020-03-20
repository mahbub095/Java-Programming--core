import java.util.Scanner;

public class IfStatement {
    public static void main(String arg[]) {
    /*    int number =100;
        if (number>0){
            System.out.println("Number is positive");
        }
        System.out.println("This statement is always executed.");
*/
    /*    int number = 0;
        if (number > 0) {
            System.out.println("Number is positive.");
        }
        else if (number < 0) {
            System.out.println("Number is negative.");
        }
        else {
            System.out.println("Number is 0.");
        }*/
        int marksObtained, passingMarks;
        passingMarks =40;
        Scanner input= new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksObtained = input.nextInt();
        if (marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        }
        else {
            System.out.println("Unfortunately, you failed to pass the exam.");
        }




    }
}