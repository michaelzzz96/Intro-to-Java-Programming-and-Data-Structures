import java.util.Scanner;

public class Problem_6_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print("The reversal of " + number + " is ");
        reverse(number);

    }

    public static void reverse (int number){
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(reverse);
    }

}
