public class NSum {
    public int n_sum(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
            
        }
        return sum;
    }

    public static void main(String[] args) {
        
        int val = new NSum().n_sum(5);

        System.out.println("The sum of first 5 numbers is - " + val);
    }
}
