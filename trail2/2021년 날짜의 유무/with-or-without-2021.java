import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        // 2021년의 날짜 중 M월 D일이 존재하면 "Yes", 존재하지 않는다면 "No"를 출력하는 프로그램
        System.out.println(isValidDate2021(M, D) ? "Yes" : "No");
    }

    public static boolean isValidDate2021 (int m, int d) {
        // 달이 1월부터 12월 사이인지 검사
        if (!isValidMonth(m)) {
            return false;
        }
        
        // 각 월별 유효한 날수인지 검사
        if (d < 1 || getDaysInMonth(m) < d) {
            return false;
        }

        return true;

    }

    public static boolean isValidMonth(int m) {
        return 1 <= m && m <=12;
    }

    public static int getDaysInMonth (int m) {  // 각 월의 최대 일수 반환
        if (m == 2) {
            return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }
}