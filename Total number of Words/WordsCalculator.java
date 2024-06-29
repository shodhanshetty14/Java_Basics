import java.util.Scanner;

public class WordsCalculator {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Please Enter the Sting value");
        String data = obj.nextLine();

        System.out.println(
                "Enter the choice \n1. Total number of words(without space)\n2. Total number of alphabets\n3. Total number of numeric characters\n4. Total number of spaces");
        
        
        int ch = obj.nextInt();
        
        obj.close();
        int alphaCount = 0, numCount = 0, spaceCount = 0, totalCount = 0;

        for (char each : data.toCharArray()) {
            if (Character.isAlphabetic(each)) {
                alphaCount++;
                // System.out.println("alpha count");
            } else if (Character.isDigit(each)) {
                numCount++;
                // System.out.println("num count");
            } else if (Character.isWhitespace(each)) {
                spaceCount++;
                // System.out.println("Space count");
            }
        }
        totalCount = alphaCount + numCount + spaceCount;

        switch (ch) {
            case 1:
                System.out.println("The total number of Characters are -> " + totalCount);
                break;
            case 2:
                System.out.println("The number of Alphabetic Charater are -> " + alphaCount);
                break;
            case 3:
                System.out.println("The total number of Numeric Characters are ->" + numCount);
                break;
            case 4:
                System.out.println("The total numbe of Spaces are -> " + spaceCount);
                break;
            default:
                System.out.println("Enter the correct choice");
                break;
        }

    }
}
