import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        // 초기화 및 입력 받기
        String[] arr = new String[200];
        int count = 0;

        while (true) {
            String s = sc.next();

            if (s.equals("0"))  // '0'이 입력되면 멈춤.
                break;

            arr[count] = s;     // '0'이 아니면 배열에 저장
            count++;            // '0'이 입력되기 전까지 입력된 문자열의 총 개수
        }

        // 결과 출력: 문자열의 총 개수, 홀수 번째 문자열
        System.out.println(count);

        for (int i = 0; i < count; i += 2) {
            System.out.println(arr[i]);
        }
    }
}