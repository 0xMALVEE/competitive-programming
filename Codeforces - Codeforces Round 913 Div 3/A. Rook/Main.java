import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> rookMoves(char column, int row) {
        ArrayList<String> moves = new ArrayList<>();

        // Horizontal moves
        for (int i = 1; i <= 8; i++) {
            if (i != row) {
                moves.add(column + "" + i);
            }
        }

        // Vertical moves
        for (char c = 'a'; c <= 'h'; c++) {
            if (c != column) {
                moves.add(c + "" + row);
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer

        for (int i = 0; i < t; i++) {
            String position = scanner.nextLine().trim();
            char column = position.charAt(0);
            int row = Character.getNumericValue(position.charAt(1));

            ArrayList<String> result = rookMoves(column, row);

            // Output the results for the current test case
            for (String move : result) {
                System.out.println(move);
            }
        }

        scanner.close();
    }
}
