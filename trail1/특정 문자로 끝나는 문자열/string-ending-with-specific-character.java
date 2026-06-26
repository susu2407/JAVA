import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        boolean found = false;  // 출력 여부 확인

        for (int i = 0; i < 10; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == c) {
                System.out.println(arr[i]);

                found = true;   // 출력 됨을 저장.
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}