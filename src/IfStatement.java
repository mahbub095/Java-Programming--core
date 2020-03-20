public class IfStatement {
    public static void main(String arg[]) {
    /*    int number =100;
        if (number>0){
            System.out.println("Number is positive");
        }
        System.out.println("This statement is always executed.");
*/
        int number = 0;
        if (number > 0) {
            System.out.println("Number is positive.");
        }
        else if (number < 0) {
            System.out.println("Number is negative.");
        }
        else {
            System.out.println("Number is 0.");
        }
    }
}