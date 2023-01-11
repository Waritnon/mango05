import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {

        int a = 5, b = 0;

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//        System.out.println("You have entered: "+number);
    }
}
