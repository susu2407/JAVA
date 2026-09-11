import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(squareF(n));
    }

    public static int squareF(int n) {
        if(n < 10) return n * n;

        int s = (n % 10) * (n % 10);

        return squareF(n / 10) + s;
    }
}