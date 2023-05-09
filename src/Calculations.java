import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first integer: ");
        int a = scanner.nextInt();
        System.out.println("Please enter your second integer: ");
        int b = scanner.nextInt();
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (Double.valueOf(a)/Double.valueOf(b)));
        System.out.println(a + " % " + b + " = " + (a%b));

    }
}
