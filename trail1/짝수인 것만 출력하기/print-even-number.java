import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int count = 0;
        int[] arr2 = new int[N];

        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
            if (arr1[i] % 2 == 0) {
                arr2[count] = arr1[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}