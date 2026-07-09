import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.-------------------------

        // 최대공약수 구하기 : 유클리드 호제법 활용
        // gcd(n, m);

        // 최대공약수 구하기 : 소인수분해 활용
        gcdPrime(n, m);
    }

    // 유클리드 호제법 ver. ------------------------------------
    public static void gcd(int a, int b) {
        /* 유클리드 호제법 :
            두 수의 최대공약수는,
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
        System.out.println(a);
    }

    // 소인수분해 활용 ver. -----------------------------------
    public static void gcdPrime(int a, int b) {
        // 소인수 구하기
        List<Integer> factorsA = factorize(a);
        List<Integer> factorsB = factorize(b);

        // 공약수 구하기
        /*
            두 리스트를 비교하여 최대공약수를 구하기
            바깥 for문: A 리스트 순회
            안쪽 for문: B 리스트 순회
            같으면 gcd *= 값
            B.remove(j)
            break
        */

        int gcd = 1;

        for (int i = 0; i < factorsA.size(); i++) {
            for (int j = 0; j < factorsB.size(); j++) {
                
                if (factorsA.get(i) == factorsB.get(j)) {
                    
                    gcd *= factorsA.get(i);
                    
                    factorsB.remove(j);
                    
                    break;
                }
            }
        }

        System.out.println(gcd);        
    }

    // 인수분해
    public static List<Integer> factorize(int num) {
        /*
        factorize(int n) 함수
        반환형: List<Integer>
        예: 84 → [2,2,3,7]
        */

        int div = 2;    // 제일 작은 소수
        
        List<Integer> factors = new ArrayList<>();

        while (num > 1) {

            if (num % div == 0) {
                factors.add(div);  // 약수 저장
                num /= div;
            } else {
                div++;
            }
        }

        return factors;
    }
}