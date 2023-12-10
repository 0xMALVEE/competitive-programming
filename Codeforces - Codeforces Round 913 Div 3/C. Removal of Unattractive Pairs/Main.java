import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();  // length of the string
            String s = scanner.next();  // the string itself

            int result = minDeletions(s);
            System.out.println(result);
        }

        scanner.close();
    }

    // Function to calculate the minimum deletions
    private static int minDeletions(String s) {
        int deletions = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            // Check if the current character is the same as the next one
            if (s.charAt(i) == s.charAt(i + 1)) {
                deletions++;
            }
        }

        return deletions;
    }
}
