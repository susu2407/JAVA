import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int Q = sc.nextInt();

        char[] arr = S.toCharArray();

        int lenS = arr.length;

        // Q번 반복 진행
        while (Q --> 0) {
            int type = sc.nextInt();    // 1 or 2

            if (type == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                // 문자 위치 교환 a <-> b
                char temp = arr[a - 1];

                arr[a - 1] = arr[b - 1];
                arr[b - 1] = temp;
                
            } else if (type == 2) {
                char x = sc.next().charAt(0);
                char y = sc.next().charAt(0);

                // 문자 변경 x -> y
                for (int j = 0; j < lenS; j++) {
                    if (arr[j] == x) {
                        arr[j] = y;
                    }
                }
            }

            // 결과 출력
            System.out.println(arr);
        }
    }
}