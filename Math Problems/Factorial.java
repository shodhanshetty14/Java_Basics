
public class Factorial {
    public int factorail(int n) 
    {
        int fact = 1;
        for (int i = n; i>0; i--){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int output = new Factorial().factorail(5);

        System.out.println(output);
    }
}
