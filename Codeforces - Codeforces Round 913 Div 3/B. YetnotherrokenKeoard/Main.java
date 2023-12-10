import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Pair {
        char first;
        int second;

        Pair(char first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNext()) {
            return; // Exit if there is no input
        }

        String s = scanner.next();

        List<Pair> upperCaseStack = new ArrayList<>();
        List<Pair> lowerCaseStack = new ArrayList<>();
        List<Pair> result = new ArrayList<>();

        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                if (s.charAt(i) == 'B') {
                    if (!upperCaseStack.isEmpty()) {
                        upperCaseStack.remove(upperCaseStack.size() - 1);
                    }
                } else {
                    upperCaseStack.add(new Pair(s.charAt(i), i));
                }
            } else {
                if (s.charAt(i) == 'b') {
                    if (!lowerCaseStack.isEmpty()) {
                        lowerCaseStack.remove(lowerCaseStack.size() - 1);
                    }
                } else {
                    lowerCaseStack.add(new Pair(s.charAt(i), i));
                }
            }
        }

        result.addAll(upperCaseStack);
        result.addAll(lowerCaseStack);

        Collections.sort(result, (a, b) -> Integer.compare(a.second, b.second));

        for (Pair entry : result) {
            System.out.print(entry.first);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return; // Exit if there is no input
        }

        int tc = scanner.nextInt();

        while (tc-- > 0) {
            solve();
        }
    }
}
