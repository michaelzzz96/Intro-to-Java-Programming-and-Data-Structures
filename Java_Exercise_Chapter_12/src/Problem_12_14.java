import java.io.File;
import java.util.Scanner;

public class Problem_12_14 {


    public static void main(String[] args) throws Exception {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to a file
        System.out.print("Enter a file of scores: ");
        File file = new File(input.nextLine());

        // Check if file exists
        if (!file.exists()) {
            System.out.println("File " + file + " does not exist");
            System.exit(1);
        }

        int count = 0; 		// Counts scores
        double total = 0;	// Accumulates total

        try (
                // Create input file
                Scanner inputFile = new Scanner(file);
        ) {
            while (inputFile.hasNext()) {
                total += inputFile.nextInt();
                count++;
            }
        }

        // Display results
        System.out.println("File " + file.getName());
        System.out.println("Total scores: " + total);
        System.out.println("Average scores: " + (total / count));
    }



}
