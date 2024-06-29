import java.util.Scanner;

class CaseConverter{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter The String value");
        String value = obj.nextLine();

        System.out.println("The String value is - " + value);

        System.out.println("Select one of the choices\n" + "1. To lower case\n" + "2. To Upper case");
        int ch = obj.nextInt();
        obj.close();
        
        switch(ch){
            case 1: System.out.println("The updated value - " + value.toLowerCase());
                    break;
            case 2: System.out.println("The updated value - " + value.toUpperCase());
                    break;
            default: System.out.println("Select the appropriate choice!!!");
                    break;
        }
        
    }
}