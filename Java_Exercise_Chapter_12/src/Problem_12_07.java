import java.util.Scanner;

public class Problem_12_07 {


    public static void main(String[] args) {
        String binaryNumber = promptStringValue();
        int decimalNumber = bin2Dec(binaryNumber);
        System.out.println(decimalNumber);
    }

    private static String promptStringValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        return scanner.nextLine();
    }

    private static int bin2Dec(String binaryString)
            throws NumberFormatException {
        int decimalNumber = 0;
        char binaryNumber;
        for (int i = binaryString.length() - 1, pow = 0; i >= 0; i--, pow++) {
            binaryNumber = binaryString.charAt(i);
            if (binaryNumber == '0' || binaryNumber == '1') {
                decimalNumber += (Math.pow(2, pow) * (binaryNumber - '0'));
            } else {
                throw new NumberFormatException("Not a binary number: " + binaryString);
            }
        }
        return decimalNumber;
    }



}
