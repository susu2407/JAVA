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
            1. n의 각 자리 숫자 분리
            2. 각 자리 숫자의 합(sum) 구하기
            3. n이 짝수인지 판단 && sum이 5의 배수인지 판단
        */

        int a = n / 10;
        int b = n % 10;

        int sum = a + b;

        return (n % 2 == 0) && (sum % 5 == 0);
    }
}