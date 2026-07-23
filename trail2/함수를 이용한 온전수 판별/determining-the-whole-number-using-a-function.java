import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 온전수 판별
        int cnt = 0;

        for (int i = A; i <= B; i++) {
            if (isPerfectNum(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    // 온전수 판별. *가드 절 활용 
    public static boolean isPerfectNum(int n) {
        if (n % 2 == 0) {
            return false;
        }
        if (n % 10 == 5) {
            return false;
        }
        if (n % 3 == 0 && n % 9 != 0) {
            return false;
        }
        return true;
    }
}