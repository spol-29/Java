import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        System.out.println("Enter a number to find all primes in range:");
        int N = 100;
        PrimeSieve rev = new PrimeSieve();
        Scanner sc = new Scanner(System.in); 
        int str = sc.nextInt(); 
        N = str;
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
        int primes = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes++;
        }
        System.out.println(
            "The number of primes <= " + N + " is " + primes);
    }
}
