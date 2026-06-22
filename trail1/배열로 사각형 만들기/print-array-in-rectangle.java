public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int n = 5;

        int[][] arr2d = new int[5][5];

        // 1-1. 첫 번째 행 모두 1로 초기화 합니다.
        for (int i = 0; i < 5; i++) {
            arr2d[0][i] = 1;
        }
        // 1-2. 첫 번째 열은 모두 1로 초기화 합니다.
        for (int i = 1; i < 5; i++) {
            arr2d[i][0] = 1;
        }


        // 2. 나머지 칸들은 바로 위의 값과 바로 왼쪽의 값을 더합니다.
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                arr2d[i][j] = arr2d[i - 1][j] + arr2d[i][j - 1];
            }
        }

        // 출력
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}