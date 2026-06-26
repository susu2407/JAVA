import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        // 첫 번째 줄, 입력 받기
        int N = sc.nextInt();

        // N개의 문자열
        String[] arr = new String[N];

        // 모든 문자열 길이의 합
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
            sum += arr[i].length();
        }

        // 주어진 문자 중 첫 번째 문자로 'a'가 나온 횟수
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i].charAt(0) == 'a') {
                count++;
            }
        }

        // 출력
        System.out.print(sum + " " + count);
    }
}