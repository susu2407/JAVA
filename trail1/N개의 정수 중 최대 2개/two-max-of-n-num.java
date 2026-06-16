import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal1 = Integer.MIN_VALUE;
        int maxVal2 = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {

            if (maxVal1 < arr[i]) {
                maxVal2 = maxVal1;
                maxVal1 = arr[i];
            } 
            else if (maxVal2 < arr[i]) {
                maxVal2 = arr[i];
            }

        }

        System.out.println(maxVal1 + " " + maxVal2);

    }
}
