import java.util.Scanner;

public class Problem_9_11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Create a LinearEquation object
        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);

        // Display results
        if (linearEquation.isSolvable()) {
            System.out.println("x is " + linearEquation.getX() +
                    " and y is " + linearEquation.getY());
        }
        else
            System.out.println("The equation has no solution.");
    }



    private static class LinearEquation{
        private double a;
        private double b;
        private double c;
        private double d;
        private double e;
        private double f;

        LinearEquation(double a, double b, double c, double d, double e, double f){
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getD() {
            return d;
        }

        public double getE() {
            return e;
        }

        public double getF() {
            return f;
        }

        public boolean isSolvable() {
            return a * d - b * c != 0;
        }

        public double getX() {
            return (e * d - b * f) / (a * d - b * c);
        }

        public double getY() {
            return (a * f - e * c) / (a * d - b * c);
        }

    }

}
