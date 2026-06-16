import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vehicles = new int[N];

        for (int i = 0; i < N; i++) {
            vehicles[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        int windowSum = 0;

        // First window sum
        for (int i = 0; i < K; i++) {
            windowSum += vehicles[i];
        }

        int maxSum = windowSum;

        // Sliding window
        for (int i = K; i < N; i++) {
            windowSum = windowSum - vehicles[i - K] + vehicles[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);

        sc.close();
    }
}
