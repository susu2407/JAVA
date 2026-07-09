import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        ged(n, m);  // 최대공약수 구하기
    }

    public static void ged(int a, int b) {
        /* 유클리드 호제법 :
            두 수의 최대공약수는,
            큰 수와 작은 수의 최대공약수와 
            큰 수를 작은 수로 나눈 나머지의
            최대공약수와 같습니다.
        */
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println(a);
    }
}