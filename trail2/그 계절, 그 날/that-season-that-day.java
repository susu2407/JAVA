import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        System.out.println(getSeaseon(Y, M, D));
    }

    public static String getSeaseon (int y, int m, int d) {

        // 유효한 월일인지 판단
        if (!isValidDate(y, m, d))
            return "-1";
            
        // 계절 판단
        if (m == 3 || m == 4 || m == 5)
            return "Spring";

        if (m == 6 || m == 7 || m == 8)
            return "Summer";

        if (m == 9 || m == 10 || m == 11)
            return "Fall";

        if (m == 12 || m == 1 || m == 2)
            return "Winter";
        
        return "Error";
    }

    public static boolean isValidDate (int y, int m, int d) {
        // 달이 1월부터 12월 사이인지 검사
        if (!isValidMonth(m)) {
            return false;
        }
        
        // 각 월별 유효한 날수인지 검사
        if (d < 1 || d > getDaysInMonth(y, m)) {
            return false;
        }

        return true;

    }

    public static boolean isValidMonth(int m) {
        return 1 <= m && m <=12;
    }

    public static int getDaysInMonth (int y, int m) {  // 각 월의 최대 일수 반환, 윤년일 때에 2월은 29일까지.
        if (m == 2) {
            if (isLeapYear(y)) {
                return 29;
            }
            return 28;
        }

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }

        return 31;
    }

    public static boolean isLeapYear(int n) {
        return (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0);
    }
}