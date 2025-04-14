package Mathematics;
import java.util.Arrays;
import java.util.List;

public class count_prime_in_range {

    // Function to create a prefix sum array for prime counts
    public static int[] sievePrefixSum(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Create prefix sum array to store cumulative prime counts
        int[] primeCount = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            primeCount[i] = primeCount[i - 1] + (isPrime[i] ? 1 : 0);
        }
        return primeCount;
    }

    // Function to count primes in a range [l, r]
    public static int primeInRange(int l, int r, int[] primeCount) {
        return primeCount[r] - primeCount[l - 1];
    }

    public static void main(String[] args) {
        int N = 1000000;
        int[] primeCount = sievePrefixSum(N);

        int[][] queries = {{10, 50}, {60, 100}, {200, 300}};
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            System.out.println("Number of primes between " + l + " and " + r + ": " + primeInRange(l, r, primeCount));
        }
    }
}
