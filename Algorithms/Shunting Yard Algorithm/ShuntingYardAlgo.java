import java.util.Scanner;
import java.util.Stack;

class ShuntingYardAlgo{

    String ShuntingYard(String s)
    {
        String output;
        Stack<Character> stk = new Stack<>();

        return s;
    }

    public static void main(String[] args) {
        ShuntingYardAlgo obj = new ShuntingYardAlgo();

        Scanner ch = new Scanner(System.in);

        System.out.println("Enter the infix String without any spaces = ");
        String value = ch.next();
        
        ch.close();

        String s = obj.ShuntingYard(value);

        System.out.println("Infix string -> " + value + " Postfix String is -> " + s);


    }
}