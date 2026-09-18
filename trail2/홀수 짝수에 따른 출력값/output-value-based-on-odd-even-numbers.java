import java.util.Scanner;

/*
2026-09-18 값을 반환하는 재귀함수
< 홀수 짝수에 따른 출력값 >
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(paritySum(n));
    }

    // 홀/짝수들의 합
    public static int paritySum(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        return paritySum(n - 2) + n;
    }
}