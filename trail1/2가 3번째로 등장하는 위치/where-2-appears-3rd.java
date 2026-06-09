import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int thirdOccurrenceIndex = -1;

        for (int i = 0; i < N; i++) {
            if (arr[i] == 2) {
                count++;

                if (count == 3) {
                    thirdOccurrenceIndex = i;
                    break;
                }
            }
        }

        System.out.println(thirdOccurrenceIndex + 1);
    }
}