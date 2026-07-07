import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

         String A = sc.next();
         String B = sc.next();

         int N = -1;    // 불가능일 때 -1

        for (int i = 0; i < A.length(); i++) {

            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);     // A를 우측으로 한 칸 밀기
                
            if (A.equals(B)) {  // A와 B가 같아지는 순간
                N = i + 1;      // A를 민 횟수

                break;
            }
        }

        // 결과 출력
        System.out.println(N);
    }
}