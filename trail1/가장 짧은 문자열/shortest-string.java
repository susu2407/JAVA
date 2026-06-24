import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Side Note (다른 제출자 코드 학습)
        // 배열과 반복문을 활용
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[3];

        int min = 20;
        int max = 0;

        for(int i = 0; i < 3; i++){
            arr[i] = sc.next();

            if(min > arr[i].length()){
                min = arr[i].length();
            }

            if(max < arr[i].length()){
                max = arr[i].length();
            }

        }

        System.out.print(max - min);
        
    }
}
