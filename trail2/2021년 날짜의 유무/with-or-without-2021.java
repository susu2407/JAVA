import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if (is2021MonthDay(M, D)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // 2021년의 날짜 중 M월 D일이 존재하면 "Yes", 존재하지 않는다면 "No"를 출력하는 프로그램
    public static boolean is2021MonthDay(int m, int d) {
        
        if (m == 2) {
            if (d <= 28)
                return true;
            return false;
        }

        if (m % 2 == 1) {
            if (d <= 31) 
                return true;
            return false;
        } else {
            if (d <= 30)
                return true;
            return false;
        }
    }
}