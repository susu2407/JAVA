import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = (char)sc.nextInt();

            System.out.print(arr[i] + " ");
        }
    }
}