import java.util.Scanner;

public class First {
    public static void main(String arg[]){
        System.out.println("First");
        System.out.println("Enter First Number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter Second Number");
        int b = scanner.nextInt();
        int  c =a+b;
        System.out.println(c);

    }
}
