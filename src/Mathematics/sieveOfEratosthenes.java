package Mathematics;
import java.util.*;

public class sieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        boolean[] isPrime = sieveEratosthenes(n);

        for(int i = 2; i<=n; i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean[] sieveEratosthenes(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
}