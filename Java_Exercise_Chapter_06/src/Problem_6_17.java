import java.util.Scanner;

public class Problem_6_17 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);

    }

    public static void printMatrix(int n){

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int random = (int) (Math.random() * 2);
                System.out.print(random);
            }
            System.out.println("");
        }

    }




}
