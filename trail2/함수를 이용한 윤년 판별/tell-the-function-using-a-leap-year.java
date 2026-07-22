import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        System.out.println(isLeapYear(y));
    }

    public static boolean isLeapYear(int n) {
        boolean isLeap = (n % 4 == 0 && n % 100 != 0) || (n % 400 == 0);
        return isLeap;
    }
}