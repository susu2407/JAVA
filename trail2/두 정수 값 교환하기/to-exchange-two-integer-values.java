import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        swap(n, m);
    }

    public static void swap(int n, int m) {
        int tempt = n;
        n = m;
        m = tempt;
        System.out.println(n + " " + m);
    }
}