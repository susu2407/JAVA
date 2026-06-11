import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 정수의 개수 N 입력
        int N = sc.nextInt();
        int[] arr = new int[N];

        // 2. 배열에 값 입력
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. 중첩 for문과 if문을 이용한 내림차순 정렬 (선택 정렬 변형)
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                // 앞의 값(arr[i])이 뒤의 값(arr[j])보다 작으면 두 값을 교환(Swap)
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // 4. 내림차순 정렬 결과에서 첫 번째(가장 큰 값)와 두 번째 값 출력
        System.out.print(arr[0] + " " + arr[1]);
    }
}
