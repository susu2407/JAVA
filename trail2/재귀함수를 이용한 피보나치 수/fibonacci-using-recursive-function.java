import java.util.Scanner;

/*
2026-09-11
재귀함수를 이용한 피보나치 수
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        // 종료조건
        if (n == 1 || n == 2)
            return 1;
        
        // 점화식
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}