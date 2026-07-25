import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (isPrime(i)) {
                if (isEvenDigitSum(i)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++)
            if(n % i == 0)
                return false;

        return true;
    }

    public static boolean isEvenDigitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum % 2 == 0;
    }

}