import java.util.Scanner;

/*  2026-08-14
    Java 학습 : Call By Value
    < 두 정수에 대한 연산값 >
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