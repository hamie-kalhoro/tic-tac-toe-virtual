import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        printGameBoard(gameBoard);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter your placement (1-9): ");
            int playerPos = scanner.nextInt();

            System.out.println(playerPos);

            placePiece(gameBoard, playerPos, "player");

            Random rand = new Random();
            int cpuPos = rand.nextInt(9)+1;
            placePiece(gameBoard, cpuPos, "computer");

            printGameBoard(gameBoard);
        }

    }

    public static void printGameBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = 'X';
        if (user.equals("player")) {
            symbol = 'X';
        } else if(user.equals("computer")) {
            symbol = 'O';
        }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }
}
