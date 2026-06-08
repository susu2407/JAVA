import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);

            } else if (type == 2) {
                int b = sc.nextInt();

                boolean isExist = false;

                for (int j = 0; j < N; j++) {
                    if (arr[j] == b) {
                        System.out.println(j+1);
                        isExist = true;
                        break;
                    }
                }

                if (isExist == false) {
                    System.out.println(0);
                }

            } else if (type == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int j = s -1; j < e; j++) {
                    System.out.print(arr[j] + " ");
                }

                System.out.println();
            }
        }
    }
}