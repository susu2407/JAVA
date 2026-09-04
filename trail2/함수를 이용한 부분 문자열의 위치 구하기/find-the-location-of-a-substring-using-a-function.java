import java.util.Scanner;
public class Main {
    static String text;
    static String pattern;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        int ans = -1;

        for (int i = 0; i < text.length(); i++) {
            if (isMatch(i)) {
                ans = i;    // 처음 등장하는 시작 인덱스
                break;
            }
        }

        System.out.print(ans);
    }

    // 시작 위치 idx에서 pattern과 일치하는지 검사
    public static boolean isMatch(int idx) {
        int n = text.length();
        int m = pattern.length();

        // 범위 초과 방지
        if (idx + m > n) return false;

        // 검사
        for (int i = 0; i < m; i++) {
            if (text.charAt(idx + i) != pattern.charAt(i)) 
                return false;
        }
        return true;
    }
} 