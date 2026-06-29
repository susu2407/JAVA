import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray(); // 문자열을 배열로 변환

       arr[1] = 'a';
       arr[arr.length - 2] = 'a';

       str = String.valueOf(arr);       // 배열을 문자열로 변환

       System.out.println(str);
    }
}