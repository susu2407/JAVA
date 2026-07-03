import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char a = sc.next();
        char b = sc.next();

        int sum = (int)a + (int)b;
        int dif = 0;

        if ((int)a > (int)b) {
            dif = (int)a - (int)b;
        } else {
            dif = (int)b - (int)a;
        }

        System.out.println(sum + " " + dif);
    }
}