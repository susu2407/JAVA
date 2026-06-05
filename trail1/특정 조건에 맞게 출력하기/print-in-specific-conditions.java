import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] + 3;
            } else if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }

            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            } else {
                break;
            }

        }
    }
}