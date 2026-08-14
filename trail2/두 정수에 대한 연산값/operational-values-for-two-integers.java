import java.util.Scanner;

/*  2026-08-13
    Java 학습 : 문자열을 인자로 받는 함수
    palindrome 여부 판단하기
        palindrome : 회문. 앞에서부터 읽으나 뒤에서부터 읽으나 똑같은 단어나 문장을 뜻함.
*/

class IntWrapper {
    int value;
    
    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        modify(a, b);

        System.out.println(a.value + " " + b.value);
    }

    public static void modify(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            b.value += 25;
            a.value *= 2;
        }
    }
}