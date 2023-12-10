import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int[] result = maxAdditionalRemovals(n, arr);
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }

    private static int[] maxAdditionalRemovals(int n, int[] arr) {
        int[] result = new int[n];

        for(int i =0;i < arr.length;i++){
            int resultForIndex = 0;
            int[] copyArray = Arrays.copyOf(arr, n);
            Arrays.sort(copyArray);
            int index = -1;
            for (int k = 0; k < copyArray.length; k++) {
                if (arr[i] == copyArray[k]) {
                    index = k;
                    break;
                }
            }
            copyArray[index] = Integer.MAX_VALUE;

            int score = arr[i];
            for(int j =0;j < copyArray.length;j++){
                if(score >= copyArray[j] ){
                    score += 1;
                    resultForIndex += 1;
                    copyArray[j] = Integer.MAX_VALUE;
                }
            }
            result[i] = resultForIndex;
        }




        return result;
    }
}
