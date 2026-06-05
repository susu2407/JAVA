import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
    
        int[] arr = new int[10];
        int N = sc.nextInt();

        int count = 0; 

        for (int i = 0; i < 10; i++) {
            arr[i] = N * (i + 1);
            System.out.print(arr[i] + " ");

            if (arr[i] % 5 == 0) {
                count++;
            }

            if (count == 2) {
                break;
            }
        }
    }
}