import java.io.File;
import java.util.Scanner;

public class Problem_12_13 {

    public static void main(String[] args) throws Exception {
        // Check command line parameter usage
        if (args.length != 1) {
            System.out.println("Usage: java filename");
            System.exit(1);
        }

        // Check if file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        int characters = 0;	// Number of character
        int words = 0;			// Number of words
        int lines = 0;			// Number of lines

        try (
                // Create input file
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                lines++;
                String line = input.nextLine();
                characters += line.length();
            }
        }

        try (
                // Create input file
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String line = input.next();
                words++;
            }
        }

        // Display results
        System.out.println("File " + file.getName() + " has");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }

}
