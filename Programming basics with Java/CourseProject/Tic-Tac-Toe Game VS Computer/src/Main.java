import java.util.Scanner;

public class Main {
    static char[][] board = new char[3][3];
    static int rows = 3;
    static int cols = 3;
    static char currentPlayer;
    static char currentComputer;

    public static void main(String[] args) {
        System.out.println("Welcome to my Tic-Tac-Toe Game");

        initializeBoard(rows, cols, board);
        if (!choosingPosition()) {
            return;
        }

        playGame();
    }

    static void initializeBoard(int rows, int cols, char[][] board) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = ' ';
            }
        }
    }

    static void drawingBoard(int rows, int cols, char[][] board) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(" " + board[row][col] + " ");

                if (col < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();

            if (row < 2) {
                System.out.println("-----------");
            }
        }
    }

    static boolean isBoardFull(int rows, int cols, char[][] board) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] == ' ') {
                    return false; // This means there is still a space on the board
                }
            }
        }

        return true; // The board is full
    }

    static void playGame() {
        drawingBoard(rows, cols, board);

        while (true) {
            if (!playerMove() && !computerMove()) {
                return; // Game over
            }

            if (isBoardFull(rows, cols, board)) {
                System.out.println("Game is a draw!");
                break; // Exit the loop when the game is a draw
            }

            if (checkIfPlayerWin(board)) {
                System.out.println("Player " + currentPlayer + " wins!");
                break; // Exit the loop when a player wins
            }

            if (checkIfComputerWin(board)) {
                System.out.println("Player " + currentPlayer + " lose! Computer win.");
                break; // Exit the loop when the computer wins
            }
        }
    }

    static boolean choosingPosition() {
        if (currentPlayer != '\u0000') {
            // Symbols have already been chosen, no need to ask again.
            return true;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Player, choose symbol (X-O): ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("X")) {
            currentPlayer = 'X';
            currentComputer = 'O';
            return true;
        } else if (input.equalsIgnoreCase("O")) {
            currentPlayer = 'O';
            currentComputer = 'X';
            return true;
        } else {
            System.out.println("Invalid choice. Please choose X or O.");
            return false;
        }
    }

    static boolean playerMove() {
        do {
            System.out.println("Player " + currentPlayer + " choose row and column (0-2): ");
            Scanner scanner = new Scanner(System.in);

            System.out.print("The row: ");
            String input = scanner.nextLine();
            System.out.print("The col: ");
            String input2 = scanner.nextLine();

            if (isMoveValid(input, input2, board)) {
                int row = Integer.parseInt(input);
                int col = Integer.parseInt(input2);

                board[row][col] = currentPlayer;
                computerMove();
                drawingBoard(rows, cols, board);
                return true;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        } while (true);
    }

    static int miniMax(char[][] board, char player) {
        if (checkIfPlayerWin(board)) return -1; // Player wins
        if (checkIfComputerWin(board)) return 1; // Computer wins
        if (isBoardFull(3, 3, board)) return 0; // It's a draw

        int bestMove = 0;
        int bestScore;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    board[row][col] = player;
                    int score = miniMax(board, player == 'X' ? 'O' : 'X');
                    board[row][col] = ' ';

                    if ((player == currentComputer && score > bestMove) || (player == currentPlayer && score < bestMove)) {
                        bestMove = score;
                    }
                }
            }
        }

        return bestMove;
    }

    static boolean computerMove() {
        int bestScore = -2;
        int bestRow = -1;
        int bestCol = -1;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') {
                    board[row][col] = currentComputer;
                    int score = miniMax(board, currentPlayer);
                    board[row][col] = ' ';

                    if (score > bestScore) {
                        bestScore = score;
                        bestRow = row;
                        bestCol = col;
                    }
                }
            }
        }

        if (bestRow != -1 && bestCol != -1) {
            board[bestRow][bestCol] = currentComputer;
            System.out.println("Computer chooses row " + bestRow + " and column " + bestCol);
            return true;
        }

        return false;
    }

    static boolean isMoveValid(String input, String input2, char[][] board) {
        try {
            int row = Integer.parseInt(input);
            int col = Integer.parseInt(input2);
            return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static boolean checkIfComputerWin(char[][] board) {
        String playerTriple = "" + currentComputer + currentComputer + currentComputer;

        return checkWinConditions(playerTriple, board);
    }

    static boolean checkIfPlayerWin(char[][] board) {
        String playerTriple = "" + currentPlayer + currentPlayer + currentPlayer;

        return checkWinConditions(playerTriple, board);
    }

    static boolean checkWinConditions(String playerTriple, char[][] board) {
        for (int i = 0; i < 3; i++) {
            String row = new String(board[i]);
            String col = "" + board[0][i] + board[1][i] + board[2][i];
            String diagonal = "" + board[0][0] + board[1][1] + board[2][2];
            String otherDiagonal = "" + board[0][2] + board[1][1] + board[2][0];

            if (row.equals(playerTriple) || col.equals(playerTriple) || diagonal.equals(playerTriple) || otherDiagonal.equals(playerTriple)) {
                return true;
            }
        }

        return false;
    }
}
