import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;
        
        for (int i = A; i <= B; i++) {
            if (hasDigit369(i) || isMulipleOfThree(i))
                count++;
        }

        System.out.println(count);
    }

    // 3, 6, 9 중에 하나가 들어가 있는지 판단
    public static boolean hasDigit369(int i) {
        while (i != 0) {
            int digit = i % 10;

            if (digit == 3 || digit == 6 || digit == 9) {
                return true;
            }

            i = i / 10;
        }

        return false;
    }

    // 3의 배수인가 판단
    public static boolean isMulipleOfThree(int i) {
        return i % 3 == 0;
    }
}