import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem_12_06 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do{
        try {
            System.out.print("Enter a hex number: ");
            String hex = input.nextLine();

            System.out.println("The decimal value for hex number: "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));

            continueInput = false;

        }catch(NumberFormatException  ex){
                System.out.println("Try again. (" + "Incorrect input: Not a hex number)");
                input.nextLine();
            }
        }while (continueInput);
    }

    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return  ch - '0';
    }


}
