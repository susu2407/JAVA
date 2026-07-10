import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        lcm(n, m);
    }

    public static void lcm (int a, int b) {
        /*
        최대공약수(gcd)와 최소공배수(lcm)의 관계 활용:
        gcd * lcm = a * b
        
        -> lcm = a * b / gcd
        */
        System.out.println(a * b / gcdEuclidean(a, b));
    }
 
    // 유클리드 호제법 ver. ------------------------------------
    public static int gcdEuclidean(int a, int b) {
        /* 유클리드 호제법 :
            두 수의 최소공약수는,
            큰 수와 작은 수의 최대공약수와 
            큰 수를 작은 수로 나눈 나머지의
            최대공약수와 같습니다.
        */

        // a를 큰 수, b를 작은 수로 설정
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // 최대공약수 구하기
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // 최대공약수 출력
        return a;
    }
}