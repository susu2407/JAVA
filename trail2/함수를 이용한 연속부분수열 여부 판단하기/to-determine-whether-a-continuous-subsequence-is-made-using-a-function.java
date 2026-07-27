import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arrA = new int[A];
        int[] arrB = new int[B];

        for (int i = 0; i < A; i++)
            arrA[i] = sc.nextInt();

        for (int i = 0; i < B; i++)
            arrB[i] = sc.nextInt();

        // 출력
        if (isSubarray(arrA, arrB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSubarray(int[] arrA, int[] arrB) {
        int totalRounds = arrA.length - arrB.length;
        
        for (int i = 0; i <= totalRounds; i++) {
            
            if (arrA[i] != arrB[0]) {
                continue;
            }
            System.out.println("i= " + i + ", arrA[i]= " + arrA[i]);    // 디버그 확인용

            boolean same = true;

            for (int j = 0; j < arrB.length; j++) {
                System.out.println("j= " + j +", arrB[j]= " + arrB[j]); // 디버그 확인용

                if (arrA[i + j] != arrB[j]) {
                    same = false;
                    break;
                }
            }
            if (same) return true;
        }
        return false;
    }
}