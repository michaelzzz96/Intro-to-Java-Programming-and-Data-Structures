import java.util.Scanner;

public class Problem_8_06 {

    public static void main(String[] args) {
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];
        double[][] result;

        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = input.nextDouble();
            }

        }

        System.out.print("Enter matrix2:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = input.nextDouble();
            }

        }

        result = multiplyMatrix(a, b);

        // printing
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {

                System.out.print(a[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print("  *  ");
                } else {
                    System.out.print("     ");
                }
            }
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(b[i][j] + " ");
                if (i == 1 && j == 2) {
                    System.out.print(" = ");
                } else {
                    System.out.print("   ");
                }
            }
            for (int j = 0; j < result[0].length; j++) {
                System.out.printf("%.1f ",result[i][j] );
            }
            System.out.println();
        }

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        // Check metrix dimension
        if (a.length != b[0].length)
            return null;

        double[][] result = new double[a.length][b[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int n = 0; n < a[0].length; n++) {
                    result[i][j] += a[i][n] * b[n][j];
                }

            }

        }

        return result;

    }

}
