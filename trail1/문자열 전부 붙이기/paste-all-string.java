import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // 엔터 제거

        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.nextLine();
        }

        String result = "";

        for (int i = 0; i < n; i++) {
            result += strArr[i];
        }

        System.out.println(result);
    }
}