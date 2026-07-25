import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (isMatchNum(i)) cnt++;
        }

        System.out.println(cnt);
    }

    // 두 조건의 만족 여부를 반환하는 함수
    public static boolean isMatchNum(int n) {
        if (isPrime(n) && isEvenDigitSum(n)) {
            return true;
        }

        return false;
    }

    // 해당 숫자가 소수인지 여부를 반환하는 함수
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    // 자릿수의 합이 짝수인지 여부를 반환하는 함수
    public static boolean isEvenDigitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum % 2 == 0;
    }
}