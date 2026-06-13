import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // 세팅
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)  {
            arr[i] = sc.nextInt();
        }
        
        // 최대 탐색 범위
        int right = N - 1;

        // 최종적으로 첫 번째 원소가 뽑히게 되면 이 과정을 종료 조건 부여
        while (right >= 0) {

            int maxVal = Integer.MIN_VALUE;
            int maxIndex = -1;

            // 현재 범위(0~right)에서 최댓값 찾기
            for (int i = 0; i <= right; i++) {
                if (arr[i] > maxVal) {
                    maxVal = arr[i];
                    maxIndex = i;
                }
            }

            // 출력
            System.out.print(maxIndex + 1 + " ");

            // 다음 탐색 범위를 왼쪽으로 줄임
            right = maxIndex -1;
        }
    }
}