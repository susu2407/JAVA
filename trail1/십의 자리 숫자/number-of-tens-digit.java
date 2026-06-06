import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] count = new int[9];

        for(int i = 0; i < 100; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] >= 10) {
                arr[i] = arr[i] / 10;

                for (int j = 0; j < 9; j++) {
                    if (arr[i] == j + 1) {
                        count[j]++;
                    }
                }
            }


            if (arr[i] == 0) {
                break;
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1) + " - " + count[i]);
        }
    }
}