import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int[] arrA = new int[N1];
        int[] arrB = new int[N2];

        boolean isContiguousSubarray = false;

        for (int i = 0; i < N1; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < N2; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int i = 0; i <= N1 - N2; i++) {

            boolean match = true;

            for (int j = 0; j < N2; j++) {

                if (arrB[j] != arrA[i + j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                isContiguousSubarray = true;
            }
        }

        if (isContiguousSubarray == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}