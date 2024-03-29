
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Problem_12_24 {

    private static String[] ranks = {"assistant","associate","full"};
    private static Random random = new Random();

    public static void main(String[] args) {
        File salaryFile = createNewFile("resources\\text\\Salary.txt");
        String salaryInfo = generateSalaryInfo();
        WriteToFile(salaryFile, salaryInfo);
    }

    private static void WriteToFile(File file, String text) {
        try (PrintWriter fileOut = new PrintWriter(file)) {
            fileOut.print(text);
        } catch (FileNotFoundException e) {
            System.out.println("destination file is not found");
            System.exit(0);
        }
    }

    private static String generateSalaryInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 1000; i++) {
            stringBuilder.append("FirstName");
            stringBuilder.append(i);
            stringBuilder.append(" LastName");
            stringBuilder.append(i);
            stringBuilder.append(" ");
            String rank = generateRandomRank();
            stringBuilder.append(rank);
            double salary = generateRandomSalaryByRank(rank);
            stringBuilder.append(String.format(" %.2f", salary));
            if (i < 1000) {
                stringBuilder.append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }

    private static double generateRandomSalaryByRank(String rank) {
        if (rank.equals(ranks[0])) {
            return (random.nextInt(3000000) / 100.0) + 50000;
        } else if (rank.equals(ranks[1])) {
            return (random.nextInt(5000000) / 100.0) + 60000;
        } else {
            return (random.nextInt(5500000) / 100.0) + 75000;
        }
    }

    private static String generateRandomRank() {
        return ranks[random.nextInt(3)];
    }

    private static File createNewFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return file;
    }

}
