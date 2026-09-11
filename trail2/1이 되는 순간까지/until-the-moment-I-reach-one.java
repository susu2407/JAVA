import java.util.Scanner;
/*
2026-09-11
N이 짝수이면 2로 나누고, 
홀수이면 3으로 나눈 
몫을 취하는 작업을 반복하다가 
그 값이 1이 되면 
그때까지 진행한 작업의 횟수를 구하는 프로그램을 
재귀 함수를 이용하여 만들기.
*/
public class Main {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        F(n);
        System.out.println(count);
    }

    public static int F(int n) {
        if (n == 1) return 1;

        if (n % 2 == 0) {
            count++;
            return F(n / 2);
        }
        else {
            count++;
            return F(n / 3);
        }
    }
}