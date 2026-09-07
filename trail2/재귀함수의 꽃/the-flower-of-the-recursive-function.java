import java.util.Scanner;

/*
    2026-09-07
    값을 반환하지 않는 재귀함수
    < 재귀함수의 꽃 (출력 함수 위치의 중요성) >
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        printNumDownAndUp(n);
    }

    public static void printNumDownAndUp(int n) {
        // 재귀 멈춤 조건
        if (n == 0) return;

        // N에서 1까지
        System.out.print(n + " ");
        printNumDownAndUp(n - 1);

        // 1에서 N까지
        System.out.print(n + " ");
    }
}