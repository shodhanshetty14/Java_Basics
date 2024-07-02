import java.util.Scanner;



class SimpleFibonacci{

    public int fibonacci(int n){
        int a = 0, b = 1, c= 0;

        if (n==0){
            return 0;
        }
        if (n ==1 || n ==2)
        {
            return 1;
        }
   
        for(int i=3; i<=n;i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number - ");
        int n = sc.nextInt();

        System.out.println("The Fibonacci number of "+ n  + "th element is -> " + new SimpleFibonacci().fibonacci(n));

        sc.close();
    }
}