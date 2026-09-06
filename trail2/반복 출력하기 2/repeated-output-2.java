import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printlnHW(n);
    }

    public static void printlnHW(int n) {
        if (n == 0) {
            return;
        }

        printlnHW(n - 1);
        System.out.println("HelloWorld");
    }
}