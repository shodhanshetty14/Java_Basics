
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the value of a = ");
        int a = obj.nextInt();
        System.out.print("\nEnter the value of b = ");
        int b = obj.nextInt();

        System.out.print("\nSelect the operator (+, -, /, *, %) - ");
        String ch = obj.next();

        obj.close();
        switch (ch) {
            case "+":
                System.out.println(a + "+" + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + "-" + b + " = " + (a - b));
                break;
            case "*":
                System.out.println(a + "*" + b + " = " + (a * b));
                break;
            case "/":
                System.out.println(a + "/" + b + " = " + (a / b));
                break;
            case "%":
                System.out.println(a + "%" + b + " = " + (a % b));
                break;
            default:
                System.out.println("Please Select a valid operator!!");
                break;
        }

    }
}
