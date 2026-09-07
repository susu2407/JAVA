import java.util.Scanner;

/*
    2026-09-07
    값을 반환하지 않는 재귀함수
    < 재귀함수를 이용한 별 출력2 >
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printStarUD(n);
    }

    public static void printStarUD(int n) {
        // 재귀 멈춘 조건
        if (n == 0) return;

        // N ~ 1
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        printStarUD(n - 1);

        // 1 ~ N
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}