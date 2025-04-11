import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        printGameBoard(board);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your placement (1-9): ");
        int pos = scanner.nextInt();

        System.out.println(pos);

    }

    public static void printGameBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
