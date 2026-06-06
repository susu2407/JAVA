import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
        int [] count = new int[6];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            for (int c = 0; c < 6; c++) {
                if (arr[i] == c + 1) {
                    count[c]++;
                }
            }
        }

        for (int c = 0; c < 6; c++) {
            System.out.println((c + 1) + " - " + count[c]);
        }
    }
}