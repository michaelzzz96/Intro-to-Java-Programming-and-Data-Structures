public class Problem_5_43 {

    public static void main(String[] args) {

        int count = 0;

        for(int number1 = 1; number1 <= 7; number1++){
            for (int number2 = number1 + 1; number2 <= 7; number2++){
                System.out.println(number1 + " " + number2);
                count++;
            }
        }
        // Display total number of all combinations
        System.out.println("The total number of all combinations is " + count);
    }

}
