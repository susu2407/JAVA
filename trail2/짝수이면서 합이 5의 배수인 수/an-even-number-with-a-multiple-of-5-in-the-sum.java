import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isEvenAndDigitSumMultipleOfFive(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isEvenAndDigitSumMultipleOfFive(int n) {
        /*
            1. n이 짝수인지 판단
            2. 짝수라면, 각 자리 숫자의 합(sum) 구하기
            3. sum이 5의 배수인지 판단
        */

        int sum = 0;

        if (n % 2 == 0) {
            int a = n / 10;
            int b = n % 10;

            sum = a + b;

            if (sum % 5 ==0) {
                return true;
            }
        }

        return false;
    }
}