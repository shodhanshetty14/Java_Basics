// import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchAlgo {

    public int[] WriteArray(int n) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        return arr;
    }

    public void PrintArray(int[] arr) {
        
        int n = arr.length;
        System.out.print("The array elements are -> ");
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");

        }
        System.out.println();
    }

    public int LinearSearch(int[] arr, int elem)
    {
        for(int i=0;i < arr.length; i++)
        {
            if(arr[i] == elem){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Size of the array");
        int n = obj.nextInt();

        LinearSearchAlgo algo = new LinearSearchAlgo();

        int[] arr = algo.WriteArray(n);

        algo.PrintArray(arr);

        System.out.println("Ente the element you want to search for -> ");
        int elem = obj.nextInt();
        int index = algo.LinearSearch(arr, elem);
        
        if(index != -1)
        {
            System.out.println("The Element is found at position " + (index +1) );
        }
        else{
            System.out.println("Element not found in the array!!!");
        }
        
        obj.close();
        // System.out.println(Arrays.toString(arr));
    }
}
