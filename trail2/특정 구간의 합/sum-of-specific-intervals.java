/*  2026-09-04
    Java 학습 : 함수/변수의 영역
    < 특정 구간의 합 >
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 원소 개수
        int m = sc.nextInt();   // 질의 개수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            // Please write your code here.
            int sum = 0;    // 합을 0으로 초기화

            // a1번째 원소부타 a2번째 원소까지의 
            for (int j = a1 - 1; j < a2; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }
}