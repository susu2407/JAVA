import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        boolean found = true;

        while (found) {
            found = false;  // 못 찻으면 멈춤. if문이 통과되어 found가 false 상태일 것이므로.

            for (int i = 0; i <= A.length() - B.length(); i++) {
                // 탐색
                if (A.substring(i, i + B.length()).equals(B)) {
                    // 찾으면 삭제
                    A = A.substring(0, i) + A.substring(i + B.length());

                    // 찾았다는 정보 저장 & 반복 멈춤고 다시 처음부터 탐색
                    found = true;
                    break;
                }
            }
        }

        System.out.println(A);
    }
}