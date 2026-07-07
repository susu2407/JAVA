import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // 초기화 및 입력 받음
        int n = sc.nextInt();
        String A = sc.next();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // A와 일치한 문자열 개수의 개수 구하기
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i].equals(A)) 
                count++;
        }

        // 결과 출력
        System.out.println(count);
    }
}