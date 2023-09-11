import java.util.Scanner;

public class TicTacToe {
    static char[] square = {'o', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player = 1;
        int choice;
        char mark;

        do {
            drawBoard();
            player = (player % 2 == 0) ? 2 : 1;

            System.out.printf("Player %d, enter a position (1-9): ", player);
            choice = scanner.nextInt();

            mark = (player == 1) ? 'X' : 'O';

            if (choice >= 1 && choice <= 9 && square[choice] == Integer.toString(choice).charAt(0)) {
                square[choice] = mark;
            } else {
                System.out.println("Invalid option! Try again.");
                continue;
            }

            int result = checkWin();
            player++;

            if (result == 1) {
                drawBoard();
                System.out.println("Player " + --player + " wins!");
                break;
            } else if (result == 0) {
                drawBoard();
                System.out.println("It's a draw!");
                break;
            }
        } while (true);

        scanner.close();
    }

    static int checkWin() {
        for (int a = 1; a <= 8; a++) {
            String line = null;

            switch (a) {
                case 1:
                    line = square[1] + "" + square[2] + square[3];
                    break;
                case 2:
                    line = square[4] + "" + square[5] + square[6];
                    break;
                case 3:
                    line = square[7] + "" + square[8] + square[9];
                    break;
                case 4:
                    line = square[1] + "" + square[4] + square[7];
                    break;
                case 5:
                    line = square[2] + "" + square[5] + square[8];
                    break;
                case 6:
                    line = square[3] + "" + square[6] + square[9];
                    break;
                case 7:
                    line = square[1] + "" + square[5] + square[9];
                    break;
                case 8:
                    line = square[3] + "" + square[5] + square[7];
                    break;
            }

            if (line.equals("XXX")) {
                return 1;
            } else if (line.equals("OOO")) {
                return 1;
            }
        }

        for (int i = 1; i <= 9; i++) {
            if (square[i] == Integer.toString(i).charAt(0)) {
                return -1;
            }
        }

        return 0;
    }

    static void drawBoard() {
        System.out.println("\nTic Tac Toe\n");

        System.out.println("Player 1 (X) - Player 2 (O)\n");

        System.out.println("     |     |     ");
        System.out.println("  " + square[1] + "  |  " + square[2] + "  |  " + square[3] + "  ");
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + square[4] + "  |  " + square[5] + "  |  " + square[6] + "  ");
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.println("  " + square[7] + "  |  " + square[8] + "  |  " + square[9] + "  ");
        System.out.println("     |     |     ");
    }
}
