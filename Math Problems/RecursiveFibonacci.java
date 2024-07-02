import java.util.Scanner;

public class RecursiveFibonacci {

    public int fibonacci(int n)
    {
        if (n<=1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number - > ");
        int n = sc.nextInt();

        System.out.println("The fibonacci number of "+ n + "th element is -> " + new RecursiveFibonacci().fibonacci(n));

        sc.close();
    }
}
