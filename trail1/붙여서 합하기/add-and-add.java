import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String AB = A + B;
        String BA = B + A;

        int result = Integer.parseInt(AB) + Integer.parseInt(BA);

        System.out.println(result);
    }
}