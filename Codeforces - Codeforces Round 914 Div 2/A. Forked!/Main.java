import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int xK = scanner.nextInt();
            int yK = scanner.nextInt();
            int xQ = scanner.nextInt();
            int yQ = scanner.nextInt();

            int result = findNumberOfPositions(a, b, xK, yK, xQ, yQ);
            System.out.println(result);
        }
    }

    private static int findNumberOfPositions(int a, int b, int xK, int yK, int xQ, int yQ) {
        // Check if the knight's moves can attack both the king and the queen
        if (Math.abs(xK - xQ) % a == 0 && Math.abs(yK - yQ) % b == 0) {
            int dx = Math.abs(xK - xQ) / a;
            int dy = Math.abs(yK - yQ) / b;

            // If the sum of the number of moves in the x and y directions is even,
            // the knight can attack both the king and the queen
            if ((dx + dy) % 2 == 0) {
                return 1;
            }
        } else if (Math.abs(xK - xQ) % a == 0 && Math.abs(yK - yQ) % b == 0) {
            int dx = Math.abs(xK - xQ) / a;
            int dy = Math.abs(yK - yQ) / b;

            // If the sum of the number of moves in the x and y directions is even,
            // the knight can attack both the king and the queen
            if ((dx + dy) % 2 == 0) {
                return 1;
            }
        }

        // Knight cannot attack both the king and the queen from any position
        return 0;
    }
}
