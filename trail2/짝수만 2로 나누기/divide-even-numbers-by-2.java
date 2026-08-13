import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int[] result = modify(arr.clone());         // 새로운 배열을 만들어 넘기기

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] modify(int[] arr2) {         // arr2는 arr와 관련이 없다.
        // 짝수인 원소만 2로 나눈 값으로 바꾸기
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                arr2[i] /= 2;
            }
        }

        return arr2;
    }
}