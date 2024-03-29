import java.util.Scanner;

public class Problem_8_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] values = new int[6][7];
        int noOfDisk = 0;
        String s;
        int disk;

        do {

            noOfDisk++;
            if (noOfDisk % 2 == 0) {
                s = "red";
                disk = 1;
            } else {
                s = "yellow";
                disk = 2;
            }

            System.out.print("Drop a " + s + " disk at column (0–6):");
            int col = input.nextInt();
            for (int i = values.length - 1; i >= 0; i--) {
                if (values[i][col] == 0) {
                    values[i][col] = disk;
                    break;
                }
                if (i == 0)
                    System.out.println("Column full. Try again.");
            }
            displayBoard(values);

        } while (checkBoard(values) == false && noOfDisk != 6 * 7);

        if(checkBoard(values)) {
            System.out.println("The " + s + " player won");

        }else {
            System.out.println("It is a draw.");
        }

    }

    public static void displayBoard(int[][] values) {

        for (int i = 0; i < values.length; i++) {
            System.out.print("|");
            for (int j = 0; j < values[i].length; j++) {
                char c;
                if (values[i][j] == 1) {
                    c = 'R';
                } else if (values[i][j] == 2) {
                    c = 'Y';
                } else {
                    c = ' ';
                }

                System.out.print(c + "|");
            }
            System.out.println();
        }

        for (int i = 0; i <= values.length * 2; i++) {
            System.out.print("-");
        }

        System.out.println();

    }

    public static boolean checkBoard(int[][] values) {

        return checkVer(values) || checkHor(values) || checkDia(values);

    }

    public static boolean checkVer(int[][] values) {
        // Going through the array vertically

        for (int i = 0; i < values[0].length; i++) {
            int start = values[0][i];
            int count = 1;
            for (int j = 1; j < values.length; j++) {
                if (start == values[j][i] && start != 0) {
                    count++;
                } else {
                    start = values[j][i];
                    count = 1;
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean checkHor(int[][] values) {

        // Going through the array horizontally

        for (int i = 1; i < values.length; i++) {
            int start = values[i][0];
            int count = 1;
            for (int j = 1; j < values[i].length; j++) {
                if (start == values[i][j] && start != 0) {
                    count++;
                } else {
                    start = values[i][j];
                    count = 1;
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean checkDia(int[][] values) {

        // From upper left to lower right
        // Go through the row

        for (int i = 0; i < values.length; i++) {
            int start = values[i][0];
            int count = 1;
            for (int j = i+1, k = 1; j < values.length && k < values[0].length; j++, k++) {
                if (start == values[j][k] && start != 0) {
                    count++;
                } else {
                    start = values[j][k];
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        // Going through the column

        for (int i = 0; i < values[0].length; i++) {
            int start = values[0][i];
            int count = 1;
            for (int j = i+1, k = 1; j < values[0].length && k < values.length; j++, k++) {
                if (start == values[k][j] && start != 0) {
                    count++;
                } else {
                    start = values[k][j];
                    count = 1;
                }

                if (count == 4) {
                    return true;
                }
            }
        }

        // From upper right to lower left
        // Go through the column

        for (int i = 0; i < values[0].length; i++) {
            int start = values[0][i];
            int count = 1;
            for (int j = 1, k = i-1; j < values.length && k >= 0; j++, k--) {
                if (start == values[j][k] && start != 0) {
                    count++;
                } else {
                    start = values[j][k];
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        // Going through the row

        for (int i = 0; i < values.length; i++) {
            int start = values[i][values[i].length-1];
            int count = 1;
            for (int j = i+1, k = values[0].length-2; j < values.length && k >= 0; j++, k--) {
                if (start == values[j][k] && start != 0) {
                    count++;
                } else {
                    start = values[j][k];
                    count = 1;
                }
                if (count == 4) {
                    return true;
                }
            }
        }

        return false;

    }

}
