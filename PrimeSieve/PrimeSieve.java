import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        int N = 100;
        System.out.println("Input the upperbounds for the prime sieve");
        Scanner myObj = new Scanner(System.in);
        int l = myObj.nextInt();
        N = l;
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i*i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i; i*j <= N; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println(
            "The number of primes <= " + N + " is " + primes);
    }
}
